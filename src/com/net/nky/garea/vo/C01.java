package com.net.nky.garea.vo;

/**
 * blood pressure
 * @author Ken
 * @version 2016year9month19day
 */
public class C01 {
	private String detectDate;//Detection time    Time format character String
	private Integer nibpDia;// 
	private Integer nibpMea;// 
	private Integer nibpSys;// 
	private Integer pr;// 
	//{"detectDate":"2016-09-21 15:54:54","nibpDia":77,"nibpMea":90,"nibpSys":126,"pr":99}

	public String getDetectDate() {
		return detectDate;
	}

	public void setDetectDate(String detectDate) {
		this.detectDate = detectDate;
	}

	public Integer getNibpDia() {
		return nibpDia;
	}

	public void setNibpDia(Integer nibpDia) {
		this.nibpDia = nibpDia;
	}

	public Integer getNibpMea() {
		return nibpMea;
	}

	public void setNibpMea(Integer nibpMea) {
		this.nibpMea = nibpMea;
	}

	public Integer getNibpSys() {
		return nibpSys;
	}

	public void setNibpSys(Integer nibpSys) {
		this.nibpSys = nibpSys;
	}

	public Integer getPr() {
		return pr;
	}

	public void setPr(Integer pr) {
		this.pr = pr;
	}

}