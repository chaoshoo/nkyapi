package com.net.nky.service;

import net.sf.json.JSONObject;

/**
 * Interface service class.
 * @author Ken
 * @version 2016year8month19day
 */
public interface AppInterfaceService {
	
	/**
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={type:%27login%27}
	 * @param messageObj
	 * @param result
	 */
	void login(JSONObject messageObj, JSONObject result);
	
	/**
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={%27type%27:%27registMessage%27,%27tel%27:%2713367241859%27}
	 * @param messageObj
	 * @param result json:{"success":false,"message":"SMS failed"}
	 */
	void registmessage(JSONObject messageObj, JSONObject result);
	
	/**
	 * Registered message.
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={'type':'ghmessage','tel':'13367241859','hospital':'Tongji','depart':'Zhen Pu','doctor':'Zheng doctor','date':'2016-9-22','num':'2'}
	 */
	void ghmessage(JSONObject messageObj, JSONObject result);
	
	/**
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={%27type%27:%27pushmessage%27,%27title%27:%27abc%27,%27content%27:%27def%27,%27channeid%27:%27channeid%27}   
	 * @param messageObj
	 * @param result json:{"success":false,"message":"Message sending failed"}
	 */
	void pushmessage(JSONObject messageObj, JSONObject result);
	
	/**
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={%27type%27:%27changepwdmessage%27,%27tel%27:%2713367241859%27}
	 * @param messageObj
	 * @param result  json:{"success":true,"message":"SMS sent"}
	 */
	void changepwdmessage(JSONObject messageObj, JSONObject result);
	
	/**
	 * localhost:8080/nkyapi/mobile/interface.do?content={'type':'checkmessage','tel':'13367241859','code':'123456'}
	 * @param messageObj Which contains2One parameter  tel,code codeVerification code for input 
	 * @param result   json:{"success":false,"message":"Verification code validation failed"}
	 */
	void checkmessage(JSONObject messageObj, JSONObject result);
	
	/**User login
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={type:}
	 * @param messageObj
	 * @param result
	 */
	void userlogin(JSONObject messageObj, JSONObject result);
	
	/**User registration
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={type:'useregist'}
	 * @param messageObj
	 * @param result
	 */
	void useregist(JSONObject messageObj, JSONObject result);
	
	/**Hospital inquiry
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={type:}
	 * @param messageObj
	 * @param result
	 */
	void hospitals(JSONObject messageObj, JSONObject result);
	
	/**Department inquiry
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={type:}
	 * @param messageObj
	 * @param result
	 */
	void offices(JSONObject messageObj, JSONObject result);
	
	/**Doctor inquiry
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={type:}
	 * @param messageObj
	 * @param result
	 */
	void doctors(JSONObject messageObj, JSONObject result);
	
	/**Equipment operation guide
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={type:}
	 * @param messageObj
	 * @param result
	 */
	void syspara(JSONObject messageObj, JSONObject result);
	
	/**Message list
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={type:}
	 * @param messageObj
	 * @param result
	 */
	void messagelist(JSONObject messageObj, JSONObject result);
	
	/**Message details
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={type:}
	 * @param messageObj
	 * @param result
	 */
	void messageinfo(JSONObject messageObj, JSONObject result);
	
	/**Consulting input
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={type:}
	 * @param messageObj
	 * @param result
	 */
	void questionsave(JSONObject messageObj, JSONObject result);
	
	/**Advisory reply input
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={type:}
	 * @param messageObj
	 * @param result
	 */
	void questionlogsave(JSONObject messageObj, JSONObject result);
	
	/**Consulting list
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={type:}
	 * @param messageObj
	 * @param result
	 */
	void questionlist(JSONObject messageObj, JSONObject result);
	
	/**Consultation details
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={type:}
	 * @param messageObj
	 * @param result
	 */
	void questioninfo(JSONObject messageObj, JSONObject result);
	
	/**Remote consultation list
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={type:}
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={'type':'remotelist','vip_id':'V10102'}
	 * @param messageObj
	 * @param result
	 */
	void remotelist(JSONObject messageObj, JSONObject result);
	
	/**Remote consultation details
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={type:}
	 * @param messageObj
	 * @param result
	 */
	void remoteinfo(JSONObject messageObj, JSONObject result);
	
	/**Remote consultation input
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={type:}
	 * @param messageObj
	 * @param result
	 */
	void remotesave(JSONObject messageObj, JSONObject result);
	
	/**Remote consultation cancellation
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={type:}
	 * @param messageObj
	 * @param result
	 */
	void remotecancel(JSONObject messageObj, JSONObject result);
	
	/**Remote consultation input
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={type:}
	 * @param messageObj
	 * @param result
	 */
	void remotescoresave(JSONObject messageObj, JSONObject result);
	
	/**Remote consultation input
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={type:}
	 * @param messageObj
	 * @param result
	 */
	void remotelogsave(JSONObject messageObj, JSONObject result);

	/**
	 *  http://localhost:8080/nkyapi/mobile/interface.do?content={'type':'measure','inspect_code':'C01','SYS':'137','DIA':'78','PR':'67','card_code':'420222198101010001','device_sn':'2131231321321','inspect_time':'2016-08-23 09:49:35'}
	 *  
	 * Index detection
	 * @param messageObj
	 * @param result
	 */
	void measure(JSONObject messageObj, JSONObject result);

	/**
http://localhost:8080/nkyapi/mobile/interface.do?content={%27type%27:%27querymeasuredatalist%27,%27inspect_code%27:%27C01%27,%27card_code%27:%27420222198101010001%27,page:%271%27}
	 * Query index data list
	 * @param messageObj
	 * @param result
	 */
	void querymeasuredatalist(JSONObject messageObj, JSONObject result);
	
	/**
	 *  http://localhost:8080/nkyapi/mobile/interface.do?content={'type':'recentmeasuredata','card_code':'420222198101010001'}
	 * @param messageObj
	 * @param result
	 */
	void  recentmeasuredata(JSONObject messageObj, JSONObject result); 
	
	/**
	 *  http://localhost:8080/nkyapi/mobile/interface.do?content={'type':'savevipfamily',}
	 * @param messageObj
	 * @param result
	 */
	void  savevipfamily(JSONObject messageObj, JSONObject result); 
	
	/**
	 *  http://localhost:8080/nkyapi/mobile/interface.do?content={'type':'vipfamilylist',}
	 * @param messageObj
	 * @param result
	 */
	void  vipfamilylist(JSONObject messageObj, JSONObject result);
	
	/**
	 *  http://localhost:8080/nkyapi/mobile/interface.do?content={'type':'getsystemtime',}
	 * @param messageObj
	 * @param result
	 */
	void getsystemtime(JSONObject messageObj, JSONObject result);
	
	
	/**
	 * Query hospital 860270007
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={'type':'hospitalAllList','hosid':'0','rowstart':'0','rowcount':'0','hosname':'Concord','flag':'0'}
	 * * flag＝0From the database search，Search must be sent0
	 * @param messageObj
	 * @param result
	 */
	void  hospitalalllist(JSONObject messageObj, JSONObject result);
	
	
	/**
	 *  860270007 860270129
	 * Query Department
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={'type':'deptalllist','hosid':'860270007','rowstart':'1','rowcount':'300','deptname':'Pediatrics','flag':'0'}
	 * * flag＝0From the database search，Search must be sent0
	 * @param messageObj
	 * @param result
	 */
	void  deptalllist(JSONObject messageObj, JSONObject result);
	
	
	/**
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={'type':'doctor','deptid':'4200270386','hosid':'860270129','rowstart':'0','rowcount':'20','docname':'Zhang','flag':'0'}
	 * flag＝0From the database search，Search must be sent0
	 * 4200270142
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={'type':'doctor','deptid':'4200270102','hosid':'860270007','rowstart':'0','rowcount':'20'}
	 * 4200270115 
	 * Query doctor
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={'type':'doctor','deptid':'4200270386','hosid':'860270129','rowstart':'0','rowcount':'20'}
	 * @param messageObj
	 * @param result
	 */
	void doctor(JSONObject messageObj, JSONObject result);
	
	
	/**
	 * 
	 * 4200270102  861006747  860270007
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={'type':'doctorschedule','deptid':'4200270102','docid':'861006747','hosid':'860270007','rowstart':'1','rowcount':'10'}
	 * Query scheduling
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={'type':'doctorschedule','deptid':'4200270386','docid':'861005481','hosid':'860270129','rowstart':'1','rowcount':'10'}
	 * @param messageObj
	 * @param result
	 */
	void doctorschedule(JSONObject messageObj, JSONObject result);
	
	/**
	 * 860270007
	 * 
	 * 
	* http://localhost:8080/nkyapi/mobile/interface.do?content={'type':'parttime','doctorno':'861006747','hosid':'860270007','rowcount':'0','rowstart':'0','scheduleid':'99246'}
	 * 5.1.5 	Query time scheduling
	 * @param messageObj
	 * @param result
	 */
	void parttime(JSONObject messageObj, JSONObject result);
	
	
	/**
	 * 443294
	 * 107755
	* http://localhost:8080/nkyapi/mobile/interface.do?content=
	* {'type':'ghlock','hosid':'860270007','partscheduleid':'411314','scheduleid':'100019','certtypeno':'1','idcard':'421002199102075015',
	* 'patientname':'Liu','patientsex':'1','patientbirthday':'1991-02-07','contactphone':'18907183215','familyaddress':'Dongxihu Wuhan Xinhua Hospital','vipcode':'V1001','docid':'861000031','outpdate':'2016-09-10 AM','deptid':'4200271144'}
	 * 5.1.6 	Lock signal source
	 * @param messageObj
	 * @param result
	 */
	void ghlock(JSONObject messageObj, JSONObject result);
	
	/**
	* http://localhost:8080/nkyapi/mobile/interface.do?content={'type':'confirmorder','orderid':'2002454'}
	 *5.1.7 	Confirm order
	 * @param messageObj
	 * @param result
	 */
	void confirmorder(JSONObject messageObj, JSONObject result);
	
	
	/**
	* http://localhost:8080/nkyapi/mobile/interface.do?content={'type':'cancelorder','cancelreason':'test2','operator':'13638631787','orderid':'2002286'}
	 *5.1.8 	Cancel order
	 * @param messageObj
	 * @param result
	 */
	void cancelorder(JSONObject messageObj, JSONObject result);
	
	/**
	  * http://localhost:8080/nkyapi/mobile/interface.do?content={'type':'doctorstop','bstp':'0','estp':'0','hosid':'860270007','rowcount':'20','rowstart':'1'}
	 * 5.1.9 	Get a stop order
	 */
	void doctorstop(JSONObject messageObj, JSONObject result);
	/**
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={'type':'getghorderLst','orderId':'2002498','hosid':'860270007','patientname':'Liu','vipcode':'V2169','docid':'861000031','deptid':'4200271144','status':'1','pageIndex':'1','pageSize':'10'}
	 * 5.1.9 	Get a list of registered orders
	 * status  //1  Locked success  2 Confirmed  3 Payed 4 Payment failed 5 Cancel order
	 */
	void getghorderlst(JSONObject messageObj, JSONObject result);
	/**
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={'type':'getwxpreOrder','orderid':'2002498','openid':'oenWDs0oFjJ1q6VuRk-Gr3W1eeOw'}
	 * 5.1.9 	WeChat payment，Advance orders
	 * 
	 */
	void getwxpreorder(JSONObject messageObj, JSONObject result);
	/**
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={'type':'getappversion'}
	 * 5.1.9 	appVersion
	 * 
	 */
	void getappversion(JSONObject messageObj, JSONObject result);
	/**
	 * Contact binding
	 * 
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={'type':'deletebind','vip_code':'V10607','vip_card':'429001198710264633','bind_account':'420106197702160011'}
	 * @param messageObj
	 * @param result
	 */
	void deletebind(JSONObject messageObj, JSONObject result);
	
	/**
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={'type':'doctorlogin','tel':'V10607','password':'429001198710264633','android_tv_channel_id':'420106197702160011'}
	 * Doctor login
	 * @param messageObj
	 * @param result
	 */
	void doctorlogin(JSONObject messageObj, JSONObject result);
	
	/**
	 *  http://localhost:8080/nkyapi/mobile/interface.do?content={'type':'doctorremotelist','doctor_code':'V10607'}
	 * Doctor video list
	 * @param messageObj
	 * @param result
	 */
	void doctorremotelist(JSONObject messageObj, JSONObject result);
	
	/**
	 * http://localhost:8080/nkyapi/mobile/interface.do?content={'type':'doctorremotewychannel','remote_inspect_id':'V10607','channel_id':'V10607'}
	 * Doctor initiated video back room number  andpush Message tovip
	 * @param messageObj
	 * @param result
	 */
	void doctorremotewychannel(JSONObject messageObj, JSONObject result);
	
	
	/**
	 * Remote video End callback
	 * @param messageObj
	 * @param result
	 */
	void doctorexitvedio(JSONObject messageObj, JSONObject result);

	/**
	 * Get used to the videotoken
	 * @param messageObj
	 * @param result
	 */
	void getvediotoken(JSONObject messageObj, JSONObject result);
	
	/**
	 * Create room
	 * @param messageObj
	 * @param result
	 */
	void makechannelname(JSONObject messageObj, JSONObject result);
	
	/**
	 * Create room
	 * @param messageObj
	 * @param result
	 */
	void deletechannelname(JSONObject messageObj, JSONObject result);
}