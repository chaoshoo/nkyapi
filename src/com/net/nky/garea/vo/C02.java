package com.net.nky.garea.vo;

/**
 * 7Types of"Fasting","Before breakfast","After breakfast","Before lunch","After lunch","Before dinner","After dinner" The corresponding code sent me
 * 0reach6
 * @author Ken
 * @version 2016year9month21day
 */
public class C02 {

	private String detectDate;//Detection time    Time format character String

	private Float glu;

	private Integer beforeOrAtter;
	
	//GLU0 随机血糖    GLU1	餐前血糖    GLU2		餐后血糖
	public String getType(){
		if(beforeOrAtter == 0){
			return "GLU0";
		}else if (beforeOrAtter == 1 || beforeOrAtter == 3 || beforeOrAtter == 5){
			return "GLU1";
		}else if (beforeOrAtter == 2 || beforeOrAtter == 4 || beforeOrAtter == 6){
			return "GLU2";
		}
		return "";
	}
	
	public String getDetectDate() {
		return detectDate;
	}

	public void setDetectDate(String detectDate) {
		this.detectDate = detectDate;
	}

	public Float getGlu() {
		return glu;
	}

	public void setGlu(Float glu) {
		this.glu = glu;
	}

	public Integer getBeforeOrAtter() {
		return beforeOrAtter;
	}

	public void setBeforeOrAtter(Integer beforeOrAtter) {
		this.beforeOrAtter = beforeOrAtter;
	}

}