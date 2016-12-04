package com.net.nky.garea.vo;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class Ecg {
	private String detectDate;//Detection time    Time format character String
	private Integer leadType;//2  Lead type  1:5 lead  2:12 lead
	private Integer type;//1    ECG type   1: Emergency treatment 2: Outpatient Department 3: Hospitalization  4: Physical examination
	private String params;//,"94;64;91;36;164;122;336;420;1485;-1328;2815;1;102.0"
	private String analyzeResult;//"9110;1100;7102;-1;-1;-1;-1;-1;-1;-1",
	private String data;  //AFAATgBIAEIAPAA3ADAALQAqACoAKgArAC0ALgAxADMAMgAwACsAJwAl
	private EcgConfig config;//ECG configuration  :{"highPassFilter":7,"lowPassFilter":5,"notchFilter":0},
	private EcgRepBeat repBeat;

	public String getDetectDate() {
		return detectDate;
	}

	public void setDetectDate(String detectDate) {
		this.detectDate = detectDate;
	}

	public Integer getLeadType() {
		return leadType;
	}

	public void setLeadType(Integer leadType) {
		this.leadType = leadType;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getAnalyzeResult() {
		return analyzeResult;
	}

	public void setAnalyzeResult(String analyzeResult) {
		this.analyzeResult = analyzeResult;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public EcgConfig getConfig() {
		return config;
	}

	public void setConfig(EcgConfig config) {
		this.config = config;
	}

	public EcgRepBeat getRepBeat() {
		return repBeat;
	}

	public void setRepBeat(EcgRepBeat repBeat) {
		this.repBeat = repBeat;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}