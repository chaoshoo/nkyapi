package com.net.nky.garea.vo;

/**
 * Oxygen
 * @author Ken
 * @version 2016year9month21day
 */
public class C05 {
	private String detectDate;//Detection time    Time format character String
	private Integer pr;// 
	private Integer spo2;// 
	//{"detectDate":"2016-09-21 15:54:54","pr":77,"spo2":99}

	public String getDetectDate() {
		return detectDate;
	}

	public void setDetectDate(String detectDate) {
		this.detectDate = detectDate;
	}

	public Integer getPr() {
		return pr;
	}

	public void setPr(Integer pr) {
		this.pr = pr;
	}

	public Integer getSpo2() {
		return spo2;
	}

	public void setSpo2(Integer spo2) {
		this.spo2 = spo2;
	}

}