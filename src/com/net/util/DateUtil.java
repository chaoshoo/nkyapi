package com.net.util;


/**
 * Get time stamp
 * @author zw
 *
 */
public class DateUtil {

	
	public static String getNowStp(){
		long nowstp = System.currentTimeMillis();
		return Long.toString(nowstp); 
	}
}