package com.net.util;

/**
 * System parameter configuration
 * 
 * huilet 2013-4-11
 * 
 * @author yuanc
 */
public class Contants {
	
	/**
	 * redisList of dictionarieskeyvalue,DicSingleton
	 */
	public static final String KEY_DIC ="dic";
	/**
	 * redisList of dictionarieskeyvalue,SysSingleton
	 */
	public static final String SYS_PARA ="sysPara";
	/**
	 * redisMedium storagedepartmentThekeyvalue,DepartmentSingleton
	 */
	public static final String KEY_DPLIST ="dpList";
	/**
	 * redisMedium storagedepartmentThekeyvalue,DepartmentSingleton
	 */
	public static final String KEY_DPMAP ="dpMap";
	/**
	 * redisMedium storagedepartmentThekeyvalue,DepartmentSingleton
	 */
	public static final String KEY_SYSLIST ="sysList";
	/**
	 * redisMedium storaget_device_attrThekeyvalue,DeviceAttrSingleton
	 */
	public static final String KEY_ATTR ="listAttr";

	/**
	 * Calculating the cost of short message
	 * @param price
	 * @param content
	 * @return
	 */
	public static float getPrice(float price, String content) {
		int length = content.length();
		if(length<=61) {
			return price;
		}else if(length>61 && length <=130){
			return price*2;
		}else if(length>130 && length <=200) {
			return price*3;
		}
		return price*(length/60+1);
	}
	
}