package com.net.util;

import java.util.Random;


/**
 * Generating random number,Code,sequence
 * @author YC
 *
 */
public class CodeUtil {
	
	/**
	 * Get the random code of the specified length
	 * @param len
	 * @return
	 */
	public static String getRandomCode(int len){
		StringBuffer rntStr=new StringBuffer();
		Random r=new Random();
		for(int i=0;i<len;i++){
			rntStr.append(r.nextInt(10));
		}
		return rntStr.toString();
	}
	
}