package com.mycompany.flink.record;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Record {
	
	@JsonIgnore
	private boolean auditOnly;

	public boolean isAuditOnly() {
		return auditOnly;
	}

	public void setAuditOnly(boolean auditOnly) {
		this.auditOnly = auditOnly;
	}

	@JsonProperty
	public String getInput_id() {
		return input_id;
	}
	
	@JsonProperty("#input_id")
	public void setInput_id(String input_id) {
		this.input_id = input_id;
	}
	
	@JsonProperty
	public String getOutput_id() {
		return output_id;
	}
	
	@JsonProperty("#output_id")
	public void setOutput_id(String output_id) {
		this.output_id = output_id;
	}
	
	@JsonProperty
	public String getInput_type() {
		return input_type;
	}
	
	@JsonProperty("#input_type")
	public void setInput_type(String input_type) {
		this.input_type = input_type;
	}
	
	@JsonProperty
	public String getOutput_type() {
		return output_type;
	}
	
	@JsonProperty("#output_type")
	public void setOutput_type(String output_type) {
		this.output_type = output_type;
	}
	
	@JsonProperty
	public String getAddkey() {
		return addkey;
	}
	
	@JsonProperty("#addkey")
	public void setAddkey(String addkey) {
		this.addkey = addkey;
	}
	
	@JsonProperty
	public String getSource_id() {
		return source_id;
	}
	
	@JsonProperty("#source_id")
	public void setSource_id(String source_id) {
		this.source_id = source_id;
	}
	
	@JsonProperty
	public String getFilename() {
		return filename;
	}
	
	@JsonProperty("#filename")
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	@JsonProperty
	public String getI_GUIDE_NUMBER_TYPE() {
		return I_GUIDE_NUMBER_TYPE;
	}
	
	@JsonProperty("I_GUIDE_NUMBER_TYPE")
	public void setI_GUIDE_NUMBER_TYPE(String i_GUIDE_NUMBER_TYPE) {
		I_GUIDE_NUMBER_TYPE = i_GUIDE_NUMBER_TYPE;
	}
	
	@JsonProperty
	public String getI_SEQUENCE_NUMBER() {
		return I_SEQUENCE_NUMBER;
	}
	
	@JsonProperty("I_SEQUENCE_NUMBER")
	public void setI_SEQUENCE_NUMBER(String i_SEQUENCE_NUMBER) {
		I_SEQUENCE_NUMBER = i_SEQUENCE_NUMBER;
	}
	
	@JsonProperty
	public String getI_GPRSRECORDTYPE() {
		return I_GPRSRECORDTYPE;
	}
	
	@JsonProperty("I_GPRSRECORDTYPE")
	public void setI_GPRSRECORDTYPE(String i_GPRSRECORDTYPE) {
		I_GPRSRECORDTYPE = i_GPRSRECORDTYPE;
	}
	
	@JsonProperty
	public String getI_RECORDID() {
		return I_RECORDID;
	}
	
	@JsonProperty("I_RECORDID")
	public void setI_RECORDID(String i_RECORDID) {
		I_RECORDID = i_RECORDID;
	}
	
	@JsonProperty
	public String getI_POINT_ORIGIN() {
		return I_POINT_ORIGIN;
	}
	
	@JsonProperty("I_POINT_ORIGIN")
	public void setI_POINT_ORIGIN(String i_POINT_ORIGIN) {
		I_POINT_ORIGIN = i_POINT_ORIGIN;
	}
	
	@JsonProperty
	public String getI_POINT_TARGET() {
		return I_POINT_TARGET;
	}
	
	@JsonProperty("I_POINT_TARGET")
	public void setI_POINT_TARGET(String i_POINT_TARGET) {
		I_POINT_TARGET = i_POINT_TARGET;
	}
	
	@JsonProperty
	public String getI_IMSI() {
		return I_IMSI;
	}
	
	@JsonProperty("I_IMSI")
	public void setI_IMSI(String i_IMSI) {
		I_IMSI = i_IMSI;
	}
	
	@JsonProperty
	public String getI_TRANSACTIONID() {
		return I_TRANSACTIONID;
	}
	
	@JsonProperty("I_TRANSACTIONID")
	public void setI_TRANSACTIONID(String i_TRANSACTIONID) {
		I_TRANSACTIONID = i_TRANSACTIONID;
	}
	
	@JsonProperty
	public String getI_USAGE_TYPE() {
		return I_USAGE_TYPE;
	}
	
	@JsonProperty("I_USAGE_TYPE")
	public void setI_USAGE_TYPE(String i_USAGE_TYPE) {
		I_USAGE_TYPE = i_USAGE_TYPE;
	}
	
	@JsonProperty
	public String getI_BILL_CLASS() {
		return I_BILL_CLASS;
	}
	
	@JsonProperty("I_BILL_CLASS")
	public void setI_BILL_CLASS(String i_BILL_CLASS) {
		I_BILL_CLASS = i_BILL_CLASS;
	}
	
	@JsonProperty
	public String getI_PROVIDER_ID() {
		return I_PROVIDER_ID;
	}
	
	@JsonProperty("I_PROVIDER_ID")
	public void setI_PROVIDER_ID(String i_PROVIDER_ID) {
		I_PROVIDER_ID = i_PROVIDER_ID;
	}
	
	@JsonProperty
	public String getI_DATE() {
		return I_DATE;
	}
	
	@JsonProperty("I_DATE")
	public void setI_DATE(String i_DATE) {
		I_DATE = i_DATE;
	}
	
	@JsonProperty
	public String getI_PRERATED_AMT() {
		return I_PRERATED_AMT;
	}
	
	@JsonProperty("I_PRERATED_AMT")
	public void setI_PRERATED_AMT(String i_PRERATED_AMT) {
		I_PRERATED_AMT = i_PRERATED_AMT;
	}
	
	@JsonProperty
	public String getI_PRERATED_TAX() {
		return I_PRERATED_TAX;
	}
	
	@JsonProperty("I_PRERATED_TAX")
	public void setI_PRERATED_TAX(String i_PRERATED_TAX) {
		I_PRERATED_TAX = i_PRERATED_TAX;
	}
	
	@JsonProperty
	public String getI_PRERATED_CC() {
		return I_PRERATED_CC;
	}
	
	@JsonProperty("I_PRERATED_CC")
	public void setI_PRERATED_CC(String i_PRERATED_CC) {
		I_PRERATED_CC = i_PRERATED_CC;
	}
	
	@JsonProperty
	public String getI_COMPLETION_STATUS() {
		return I_COMPLETION_STATUS;
	}
	
	@JsonProperty("I_COMPLETION_STATUS")
	public void setI_COMPLETION_STATUS(String i_COMPLETION_STATUS) {
		I_COMPLETION_STATUS = i_COMPLETION_STATUS;
	}
	
	@JsonProperty
	public String getI_TIMEZONE() {
		return I_TIMEZONE;
	}
	
	@JsonProperty("I_TIMEZONE")
	public void setI_TIMEZONE(String i_TIMEZONE) {
		I_TIMEZONE = i_TIMEZONE;
	}
	
	@JsonProperty
	public String getI_DIALLED_DIGITS() {
		return I_DIALLED_DIGITS;
	}
	
	@JsonProperty("I_DIALLED_DIGITS")
	public void setI_DIALLED_DIGITS(String i_DIALLED_DIGITS) {
		I_DIALLED_DIGITS = i_DIALLED_DIGITS;
	}
	
	@JsonProperty
	public String getI_CDR_TYPE() {
		return I_CDR_TYPE;
	}
	
	@JsonProperty("I_CDR_TYPE")
	public void setI_CDR_TYPE(String i_CDR_TYPE) {
		I_CDR_TYPE = i_CDR_TYPE;
	}
	
	@JsonProperty
	public String getI_MSISDN() {
		return I_MSISDN;
	}
	
	@JsonProperty("I_MSISDN")
	public void setI_MSISDN(String i_MSISDN) {
		I_MSISDN = i_MSISDN;
	}
	public String getI_CHARGED_PARTY() {
		return I_CHARGED_PARTY;
	}
	
	@JsonProperty("I_CHARGED_PARTY")
	public void setI_CHARGED_PARTY(String i_CHARGED_PARTY) {
		I_CHARGED_PARTY = i_CHARGED_PARTY;
	}
	
	@JsonProperty
	public String getI_DISCONNECTING_PARTY() {
		return I_DISCONNECTING_PARTY;
	}
	
	@JsonProperty("I_DISCONNECTING_PARTY")
	public void setI_DISCONNECTING_PARTY(String i_DISCONNECTING_PARTY) {
		I_DISCONNECTING_PARTY = i_DISCONNECTING_PARTY;
	}
	
	@JsonProperty
	public String getI_RADIO_CHANNI_USED() {
		return I_RADIO_CHANNI_USED;
	}
	
	@JsonProperty("I_RADIO_CHANNI_USED")
	public void setI_RADIO_CHANNI_USED(String i_RADIO_CHANNI_USED) {
		I_RADIO_CHANNI_USED = i_RADIO_CHANNI_USED;
	}
	
	@JsonProperty
	public String getI_SERVICE_CODE() {
		return I_SERVICE_CODE;
	}
	
	@JsonProperty("I_SERVICE_CODE")
	public void setI_SERVICE_CODE(String i_SERVICE_CODE) {
		I_SERVICE_CODE = i_SERVICE_CODE;
	}
	
	@JsonProperty
	public String getI_MSC_ID() {
		return I_MSC_ID;
	}
	
	@JsonProperty("I_MSC_ID")
	public void setI_MSC_ID(String i_MSC_ID) {
		I_MSC_ID = i_MSC_ID;
	}
	
	@JsonProperty
	public String getI_RELATED_NUMBER() {
		return I_RELATED_NUMBER;
	}
	
	@JsonProperty("I_RELATED_NUMBER")
	public void setI_RELATED_NUMBER(String i_RELATED_NUMBER) {
		I_RELATED_NUMBER = i_RELATED_NUMBER;
	}
	
	@JsonProperty
	public String getI_IMEI() {
		return I_IMEI;
	}
	
	@JsonProperty("I_IMEI")
	public void setI_IMEI(String i_IMEI) {
		I_IMEI = i_IMEI;
	}
	
	@JsonProperty
	public String getI_FIRST_CELL() {
		return I_FIRST_CELL;
	}
	
	@JsonProperty("I_FIRST_CELL")
	public void setI_FIRST_CELL(String i_FIRST_CELL) {
		I_FIRST_CELL = i_FIRST_CELL;
	}
	
	@JsonProperty
	public String getI_LAST_CELL() {
		return I_LAST_CELL;
	}
	
	@JsonProperty("I_LAST_CELL")
	public void setI_LAST_CELL(String i_LAST_CELL) {
		I_LAST_CELL = i_LAST_CELL;
	}
	
	@JsonProperty
	public String getI_ROUTE() {
		return I_ROUTE;
	}
	
	@JsonProperty("I_ROUTE")
	public void setI_ROUTE(String i_ROUTE) {
		I_ROUTE = i_ROUTE;
	}
	
	@JsonProperty
	public String getI_SEIZURE_TIME() {
		return I_SEIZURE_TIME;
	}
	
	@JsonProperty("I_SEIZURE_TIME")
	public void setI_SEIZURE_TIME(String i_SEIZURE_TIME) {
		I_SEIZURE_TIME = i_SEIZURE_TIME;
	}
	
	@JsonProperty
	public String getI_CAC() {
		return I_CAC;
	}
	
	@JsonProperty("I_CAC")
	public void setI_CAC(String i_CAC) {
		I_CAC = i_CAC;
	}
	
	@JsonProperty
	public String getI_PDP_ADDRESS() {
		return I_PDP_ADDRESS;
	}
	
	@JsonProperty("I_PDP_ADDRESS")
	public void setI_PDP_ADDRESS(String i_PDP_ADDRESS) {
		I_PDP_ADDRESS = i_PDP_ADDRESS;
	}
	
	@JsonProperty
	public String getI_PDP_TYPE() {
		return I_PDP_TYPE;
	}
	
	@JsonProperty("I_PDP_TYPE")
	public void setI_PDP_TYPE(String i_PDP_TYPE) {
		I_PDP_TYPE = i_PDP_TYPE;
	}
	
	@JsonProperty
	public String getI_COS() {
		return I_COS;
	}
	
	@JsonProperty("I_COS")
	public void setI_COS(String i_COS) {
		I_COS = i_COS;
	}
	
	@JsonProperty
	public String getI_DIFF_QOS() {
		return I_DIFF_QOS;
	}
	
	@JsonProperty("I_DIFF_QOS")
	public void setI_DIFF_QOS(String i_DIFF_QOS) {
		I_DIFF_QOS = i_DIFF_QOS;
	}
	
	@JsonProperty
	public String getI_TTFILENAME() {
		return I_TTFILENAME;
	}
	
	@JsonProperty("I_TTFILENAME")
	public void setI_TTFILENAME(String i_TTFILENAME) {
		I_TTFILENAME = i_TTFILENAME;
	}
	
	@JsonProperty
	public String getUNIQUE_KEY() {
		return UNIQUE_KEY;
	}
	
	@JsonProperty("UNIQUE_KEY")
	public void setUNIQUE_KEY(String uNIQUE_KEY) {
		UNIQUE_KEY = uNIQUE_KEY;
	}
	
	@JsonProperty
	public String getPARTIAL_TYPE() {
		return PARTIAL_TYPE;
	}
	
	@JsonProperty("PARTIAL_TYPE")
	public void setPARTIAL_TYPE(String pARTIAL_TYPE) {
		PARTIAL_TYPE = pARTIAL_TYPE;
	}
	
	@JsonProperty
	public String getSEPARATION_FIELD() {
		return SEPARATION_FIELD;
	}
	
	@JsonProperty("SEPARATION_FIELD")
	public void setSEPARATION_FIELD(String sEPARATION_FIELD) {
		SEPARATION_FIELD = sEPARATION_FIELD;
	}
	
	//meta data
	private String input_id;
	private String output_id;
	private String input_type;
	private String output_type;
	private String addkey;
	private String source_id;
	private String filename;
	
	private String I_GUIDE_NUMBER_TYPE; 
	private String I_SEQUENCE_NUMBER; 
	private String I_GPRSRECORDTYPE;
	private String I_RECORDID; 
	private String I_POINT_ORIGIN; 
	private String I_POINT_TARGET; 
	private String I_IMSI; 
	private String I_TRANSACTIONID; 
	private String I_USAGE_TYPE;
	private String I_BILL_CLASS; 
	private String I_PROVIDER_ID; 
	private String I_DATE; 
	private String I_PRERATED_AMT; 
	private String I_PRERATED_TAX; 
	private String I_PRERATED_CC;
	private String I_COMPLETION_STATUS; 
	private String I_TIMEZONE; 
	private String I_DIALLED_DIGITS; 
	private String I_CDR_TYPE; 
	private String I_MSISDN; 
	private String I_CHARGED_PARTY;
	private String I_DISCONNECTING_PARTY; 
	private String I_RADIO_CHANNI_USED; 
	private String I_SERVICE_CODE; 
	private String I_MSC_ID; 
	private String I_RELATED_NUMBER; 
	private String I_IMEI;
	private String I_FIRST_CELL; 
	private String I_LAST_CELL; 
	private String I_ROUTE; 
	private String I_SEIZURE_TIME; 
	private String I_CAC; 
	private String I_PDP_ADDRESS; 
	private String I_PDP_TYPE; 
	private String I_COS;
	private String I_DIFF_QOS; 
	private String I_TTFILENAME; 
	private String UNIQUE_KEY; 
	private String PARTIAL_TYPE; 
	private String SEPARATION_FIELD;

	public int getI_PRIMARY_UNITS() {
		return I_PRIMARY_UNITS;
	}
	
	@JsonProperty("I_PRIMARY_UNITS")
	public void setI_PRIMARY_UNITS(int i_PRIMARY_UNITS) {
		I_PRIMARY_UNITS = i_PRIMARY_UNITS;
	}

	public int getI_SECONDARY_UNITS() {
		return I_SECONDARY_UNITS;
	}

	@JsonProperty("I_SECONDARY_UNITS")
	public void setI_SECONDARY_UNITS(int i_SECONDARY_UNITS) {
		I_SECONDARY_UNITS = i_SECONDARY_UNITS;
	}

	public int getI_TERTIARY_UNITS() {
		return I_TERTIARY_UNITS;
	}

	@JsonProperty("I_TERTIARY_UNITS")
	public void setI_TERTIARY_UNITS(int i_TERTIARY_UNITS) {
		I_TERTIARY_UNITS = i_TERTIARY_UNITS;
	}

	private int I_PRIMARY_UNITS;
	private int I_SECONDARY_UNITS;
	private int I_TERTIARY_UNITS;
	
	public long getEA_DATE() {
		return EA_DATE;
	}

	@JsonProperty("EA_DATE")
	public void setEA_DATE(long eA_DATE) {
		EA_DATE = eA_DATE;
	}

	public long getEA_END_DATE() {
		return EA_END_DATE;
	}

	@JsonProperty("EA_END_DATE")
	public void setEA_END_DATE(long eA_END_DATE) {
		EA_END_DATE = eA_END_DATE;
	}

	public int getEA_PRIMARY_UNITS() {
		return EA_PRIMARY_UNITS;
	}

	@JsonProperty("EA_PRIMARY_UNITS")
	public void setEA_PRIMARY_UNITS(int eA_PRIMARY_UNITS) {
		EA_PRIMARY_UNITS = eA_PRIMARY_UNITS;
	}

	public int getEA_SECONDARY_UNITS() {
		return EA_SECONDARY_UNITS;
	}

	@JsonProperty("EA_SECONDARY_UNITS")
	public void setEA_SECONDARY_UNITS(int eA_SECONDARY_UNITS) {
		EA_SECONDARY_UNITS = eA_SECONDARY_UNITS;
	}

	public int getEA_TERTIARY_UNITS() {
		return EA_TERTIARY_UNITS;
	}

	@JsonProperty("EA_TERTIARY_UNITS")
	public void setEA_TERTIARY_UNITS(int eA_TERTIARY_UNITS) {
		EA_TERTIARY_UNITS = eA_TERTIARY_UNITS;
	}

	public long getEA_START_DATE() {
		return EA_START_DATE;
	}

	@JsonProperty("EA_START_DATE")
	public void setEA_START_DATE(long eA_START_DATE) {
		EA_START_DATE = eA_START_DATE;
	}

	public String getEA_PARTIAL_TYPE() {
		return EA_PARTIAL_TYPE;
	}

	@JsonProperty("EA_PARTIAL_TYPE")
	public void setEA_PARTIAL_TYPE(String eA_PARTIAL_TYPE) {
		EA_PARTIAL_TYPE = eA_PARTIAL_TYPE;
	}

	public String getAGGREGATION_KEY() {
		return AGGREGATION_KEY;
	}

	@JsonProperty("AGGREGATION_KEY")
	public void setAGGREGATION_KEY(String aGGREGATION_KEY) {
		AGGREGATION_KEY = aGGREGATION_KEY;
	}

	@JsonProperty("PARTIALS_COMBINED_")
	public long getPARTIALS_COMBINED_() {
		return PARTIALS_COMBINED_;
	}

	public void setPARTIALS_COMBINED_(long pARTIALS_COMBINED_) {
		PARTIALS_COMBINED_ = pARTIALS_COMBINED_;
	}

	private long EA_DATE;
	private long EA_END_DATE;
	private int EA_PRIMARY_UNITS;
	private int EA_SECONDARY_UNITS;
	private int EA_TERTIARY_UNITS;
	private long EA_START_DATE;
	private String EA_PARTIAL_TYPE;
	private String AGGREGATION_KEY;
	private long PARTIALS_COMBINED_;
	
	
	private String INTERNAL_AUDIT_KEY;

	@JsonIgnore
	public String getINTERNAL_AUDIT_KEY() {
		return INTERNAL_AUDIT_KEY;
	}

	@JsonIgnore
	public void setINTERNAL_AUDIT_KEY(String iNTERNAL_AUDIT_KEY) {
		INTERNAL_AUDIT_KEY = iNTERNAL_AUDIT_KEY;
	}
	
	@JsonIgnore
	private long EL_COUNTER_IN;
	@JsonIgnore
	private long EL_COUNTER_OUT;
	@JsonIgnore
	private long EL_COUNTER_FILTERED;
	@JsonIgnore
	private long EL_COUNTER_REJECTED;
	@JsonIgnore
	private long EL_COUNTER_REPROCESS;
	@JsonIgnore
	private long EL_COUNTER_CREATED;
	@JsonIgnore
	private long EL_COUNTER_DUPLICATED;
	@JsonIgnore
	private long EL_COUNTER_STORED;
	@JsonIgnore
	private long EL_COUNTER_RETRIEVED;
	@JsonIgnore
	private long EL_COUNTER_REDUCED;

	public long getEL_COUNTER_IN() {
		return EL_COUNTER_IN;
	}

	public void setEL_COUNTER_IN(long eL_COUNTER_IN) {
		EL_COUNTER_IN = eL_COUNTER_IN;
	}

	public long getEL_COUNTER_OUT() {
		return EL_COUNTER_OUT;
	}

	public void setEL_COUNTER_OUT(long eL_COUNTER_OUT) {
		EL_COUNTER_OUT = eL_COUNTER_OUT;
	}

	public long getEL_COUNTER_FILTERED() {
		return EL_COUNTER_FILTERED;
	}

	public void setEL_COUNTER_FILTERED(long eL_COUNTER_FILTERED) {
		EL_COUNTER_FILTERED = eL_COUNTER_FILTERED;
	}

	public long getEL_COUNTER_REJECTED() {
		return EL_COUNTER_REJECTED;
	}

	public void setEL_COUNTER_REJECTED(long eL_COUNTER_REJECTED) {
		EL_COUNTER_REJECTED = eL_COUNTER_REJECTED;
	}

	public long getEL_COUNTER_REPROCESS() {
		return EL_COUNTER_REPROCESS;
	}

	public void setEL_COUNTER_REPROCESS(long eL_COUNTER_REPROCESS) {
		EL_COUNTER_REPROCESS = eL_COUNTER_REPROCESS;
	}

	public long getEL_COUNTER_CREATED() {
		return EL_COUNTER_CREATED;
	}

	public void setEL_COUNTER_CREATED(long eL_COUNTER_CREATED) {
		EL_COUNTER_CREATED = eL_COUNTER_CREATED;
	}

	public long getEL_COUNTER_DUPLICATED() {
		return EL_COUNTER_DUPLICATED;
	}

	public void setEL_COUNTER_DUPLICATED(long eL_COUNTER_DUPLICATED) {
		EL_COUNTER_DUPLICATED = eL_COUNTER_DUPLICATED;
	}

	public long getEL_COUNTER_STORED() {
		return EL_COUNTER_STORED;
	}

	public void setEL_COUNTER_STORED(long eL_COUNTER_STORED) {
		EL_COUNTER_STORED = eL_COUNTER_STORED;
	}

	public long getEL_COUNTER_RETRIEVED() {
		return EL_COUNTER_RETRIEVED;
	}

	public void setEL_COUNTER_RETRIEVED(long eL_COUNTER_RETRIEVED) {
		EL_COUNTER_RETRIEVED = eL_COUNTER_RETRIEVED;
	}

	public long getEL_COUNTER_REDUCED() {
		return EL_COUNTER_REDUCED;
	}

	public void setEL_COUNTER_REDUCED(long eL_COUNTER_REDUCED) {
		EL_COUNTER_REDUCED = eL_COUNTER_REDUCED;
	}

	@JsonIgnore
	private String INPUT_LINK;

	public String getINPUT_LINK() {
		return INPUT_LINK;
	}

	@JsonIgnore
	public void setINPUT_LINK(String iNPUT_LINK) {
		INPUT_LINK = iNPUT_LINK;
	}
	
	@JsonIgnore
	private String OUTPUT_LINK;

	public String getOUTPUT_LINK() {
		return OUTPUT_LINK;
	}

	@JsonIgnore
	public void setOUTPUT_LINK(String oUTPUT_LINK) {
		OUTPUT_LINK = oUTPUT_LINK;
	}
	
	
	
	
}
