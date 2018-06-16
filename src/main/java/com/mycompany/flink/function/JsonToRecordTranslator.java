package com.mycompany.flink.function;

import java.util.Iterator;

import org.apache.flink.api.common.functions.RichMapFunction;
import org.apache.flink.configuration.Configuration;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.mycompany.flink.monitor.StatsdPerformanceMarker;
import com.mycompany.flink.record.Record;

public class JsonToRecordTranslator extends RichMapFunction<String, Record> {

	public static Logger LOG = Logger.getLogger(JsonToRecordTranslator.class);
	private static final long serialVersionUID = 1L;
    final String statsdAspect = "a_json_to_record";
    private final StatsdPerformanceMarker countMarker;
    private ObjectReader objReader;
    private long epoch;
    private String inputLink;
    
    public JsonToRecordTranslator(StatsdPerformanceMarker countMarker, String inputLink) {
    	 this.countMarker = countMarker;
    	 this.inputLink = inputLink;
    }

    @Override
    public void open(Configuration configuration) throws Exception {
        super.open(configuration);
        if(countMarker != null) {
	        countMarker.setName(statsdAspect);
	  	    countMarker.init();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS); 
        objReader = objectMapper.readerFor(Record.class);
    }
    
    @Override
    public void close() throws Exception {
        super.close();
        if(countMarker != null)
        	countMarker.stopMarker();
    }
    
    @Override
	public Record map(String jsonRecord) throws Exception {
      if(countMarker != null) countMarker.count();
      Record rec = objReader.readValue(jsonRecord);
      epoch = System.currentTimeMillis();
      rec.setEA_DATE(epoch);
      rec.setEA_START_DATE(epoch);
      //rec.setEL_COUNTER_IN(true);
      rec.setINTERNAL_AUDIT_KEY(rec.getUNIQUE_KEY());
      rec.setAuditOnly(false);
      rec.setINPUT_LINK(inputLink);
      //LOG.log(Level.INFO, "record unique: " + rec.getUNIQUE_KEY());
      
  	  return rec;
	}
}
