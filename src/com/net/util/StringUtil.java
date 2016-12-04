package com.net.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Pattern;

public class StringUtil {

	
	final static Pattern INT_PATTERN = Pattern.compile("^[-\\+]?[\\d]+$");    
	final static SimpleDateFormat DATE_TIME_PATTERN = new SimpleDateFormat("yyyyMMddHHmmss");
	/**
	 * To determine whether a string is an integer
	 * @param str
	 * @return boolean If it is an integer，Returntrue；Otherwise returnfalse
	 */
	public static boolean isInteger(String str) {    
		 return INT_PATTERN.matcher(str).matches();    
	}  
	
	public static String now(){
		return DATE_TIME_PATTERN.format(Calendar.getInstance().getTime());
	}

	public static String timestamp(){
		Calendar cal = Calendar.getInstance();
		return DATE_TIME_PATTERN.format(cal.getTime()) + cal.getTimeInMillis() ;
	}
	
}