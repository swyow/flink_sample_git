package com.mycompany.flink.main;
 
import java.util.HashSet;
import org.apache.flink.api.java.functions.KeySelector;
import org.apache.flink.contrib.streaming.state.PredefinedOptions;
import org.apache.flink.contrib.streaming.state.RocksDBStateBackend;
import org.apache.flink.runtime.state.filesystem.FsStateBackend;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

import org.apache.log4j.Logger;

import com.mycompany.flink.function.JsonToRecordTranslator;
import com.mycompany.flink.function.ProcessAggregation;
import com.mycompany.flink.monitor.PerformanceMarkerFactory;
import com.mycompany.flink.record.Record;
import com.mycompany.flink.source.GeneratorSource;

public class Job {
    public static Logger logger = Logger.getLogger(Job.class);
	public static void main(String[] args) throws Exception {
		String statsdUrl = "192.168.56.200:8127";
		long samplingDuration = 1000;
		int loop = 10;
		int aggrDuration = 10000;
		int auditDuration = 120000;
		int psrc = 4, pJ2R = 4, pAggr = 4;
		boolean statsd = false;
        for(String arg : args) {
            String[] splited = arg.split("=");
            switch(splited[0]) {
                case "URL":
                	statsdUrl = splited[1];
                    System.out.println("URL is updated to: " + statsdUrl);
                    break;
                case "loop":
                	loop = Integer.parseInt(splited[1]);
                    System.out.println("loop is updated to: " + loop);
                    break;
                case "samplinginterval":
                	samplingDuration = Integer.parseInt(splited[1]);
                    System.out.println("samplinginterval is updated to: " + samplingDuration);
                    break;
                case "aggrinterval":
                	aggrDuration = Integer.parseInt(splited[1]);
                    System.out.println("aggrinterval is updated to: " + aggrDuration);
                    break;
                case "auditinterval":
                	auditDuration = Integer.parseInt(splited[1]);
                    System.out.println("auditDuration is updated to: " + auditDuration);
                    break;
                case "statsd":
                	statsd = Integer.parseInt(splited[1]) == 1 ? true : false;
                    System.out.println("statsd flag is updated to: " + statsd);
                    break;
                case "psrc":
                	psrc = Integer.parseInt(splited[1]);
                    System.out.println("src parallelism is updated to: " + psrc);
                    break;
                case "pJ2R":
                	pJ2R = Integer.parseInt(splited[1]);
                    System.out.println("pJ2R parallelism is updated to: " + pJ2R);
                    break;
                case "pAggr":
                	pAggr = Integer.parseInt(splited[1]);
                    System.out.println("pAggr parallelism is updated to: " + pAggr);
                    break;
            }
        }
        
        String inputlink = "testinputlink";
        HashSet<String> outputlinks = new HashSet<String>();
        outputlinks.add("testoutputlink1");
        final String outrejectedlink = "testoutrejlink";
        final String inrejectedlink = "testinrejlink";
        final String nodeid = "18";
        
        PerformanceMarkerFactory markerFactory = new PerformanceMarkerFactory(statsdUrl.split(":")[0]
        		, Integer.parseInt(statsdUrl.split(":")[1])
        		, samplingDuration, statsd);
		final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
		 
		env.getConfig().enableObjectReuse();
		env.getConfig().setUseSnapshotCompression(true);
		RocksDBStateBackend rocksdb = new RocksDBStateBackend(new FsStateBackend("file:///tmp/rocksdb/checkpoints"), true);
		env.setStateBackend(rocksdb);
		rocksdb.setPredefinedOptions(PredefinedOptions.SPINNING_DISK_OPTIMIZED_HIGH_MEM);

		DataStream<String> sourceStringStream = env
        		.addSource(new GeneratorSource(loop)).name("GeneratorSource: " + loop).setParallelism(psrc);
		
        DataStream<Record> AggregatedRecordWithAuditStream = sourceStringStream
        		.map(new JsonToRecordTranslator(markerFactory.getMarker(), inputlink)).name("JsonRecTranslator").setParallelism(pJ2R) 
        		.keyBy(new KeySelector<Record, String>() {
					private static final long serialVersionUID = 1L;
					
					@Override
        			public String getKey(Record r) throws Exception {
        				return r.getUNIQUE_KEY(); 
        			}
        		}) 
         		.process(new ProcessAggregation(aggrDuration, markerFactory.getMarker(), markerFactory.getMarker())).setParallelism(pAggr)
         		.name("AggregationDuration: " + aggrDuration +"ms");
        
		env.execute("Flink Java API Skeleton");
	} 
}