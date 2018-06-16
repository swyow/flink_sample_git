package com.mycompany.flink.utils;

public class StringFunctions {

	public static String formatValue(String value) {
	    return (value == null || value.isEmpty()) ? "-" : value;
	}
	
}
