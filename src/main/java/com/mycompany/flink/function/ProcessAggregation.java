package com.mycompany.flink.function;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.json.JSONException;

import java.util.List;

import org.apache.flink.api.common.functions.ReduceFunction;
import org.apache.flink.api.common.state.ListState;
import org.apache.flink.api.common.state.ListStateDescriptor;
import org.apache.flink.api.common.state.ReducingState;
import org.apache.flink.api.common.state.ReducingStateDescriptor;
import org.apache.flink.api.common.state.ValueStateDescriptor;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.functions.ProcessFunction;
import org.apache.flink.util.Collector;

import com.mycompany.flink.monitor.StatsdPerformanceMarker;
import com.mycompany.flink.record.Record;

public class ProcessAggregation extends ProcessFunction<Record, Record> {

	private static final long serialVersionUID = 1L;
	public static Logger LOG = Logger.getLogger(ProcessAggregation.class);
	private ListState<Record> recordStore;
    private int aggrWindowsIntervalMs;
    final String statsdAspect = "a_process_aggregation";
    final String statsdAspect2 = "a_process_aggregation_timer";
    private final StatsdPerformanceMarker countMarker;
    private final StatsdPerformanceMarker countMarker2;  
    
    public ProcessAggregation(int aggrWindowsIntervalMs, StatsdPerformanceMarker countMarker, StatsdPerformanceMarker countMarker2) {
    	this.aggrWindowsIntervalMs = aggrWindowsIntervalMs;
    	this.countMarker = countMarker;
    	this.countMarker2 = countMarker2;
    }
    
    @Override
    public void open(Configuration parameters) throws Exception {
    	if(countMarker != null) {
    		countMarker.setName(statsdAspect);
    		countMarker.init(); 
    	}
    	
    	if(countMarker2 != null) {
    		countMarker2.setName(statsdAspect2);
    		countMarker2.init(); 
    	}
        recordStore = getRuntimeContext().getListState(new ListStateDescriptor<>("total record per schedule", Record.class));
    }
    
    @Override
    public void close() throws Exception {
        super.close();
        if(countMarker != null) {
        	countMarker.stopMarker();
        }
        if(countMarker2 != null) {
        	countMarker2.stopMarker();
        }
    }
    
    @Override
    public void processElement(Record r, Context ctx, Collector<Record> out)
            throws Exception {
    		//recordStore.add(r);
        	ctx.timerService().registerProcessingTimeTimer(((ctx.timerService().currentProcessingTime() + aggrWindowsIntervalMs) / 1000) * 1000);
        	if(countMarker != null) countMarker.count();
    }

    @Override
    public void onTimer(long timestamp, OnTimerContext ctx, Collector<Record> out)
            throws Exception {
    	//Iterable<Record> records = recordStore.get();
    	recordStore.clear();
    }
}        
