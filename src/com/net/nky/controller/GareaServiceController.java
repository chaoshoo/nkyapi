package com.net.nky.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.net.nky.garea.req.BmiReq;
import com.net.nky.garea.req.CreatTemperatureReq;
import com.net.nky.garea.req.CreateInfoReq;
import com.net.nky.garea.req.DetectReportReq;
import com.net.nky.garea.req.EcgReq;
import com.net.nky.garea.rsp.GareaRsp;

/**
 * Gary machine.
 * @author Ken
 * @version 2016year9month19day
 */
@Controller
@RequestMapping("/xxx")
public class GareaServiceController {

	Logger Log = LoggerFactory.getLogger(this.getClass());

	/**
	 * Create a doctor or resident user
	 */
	@RequestMapping(value = "/api/em/info/create", method = RequestMethod.POST
			, consumes="application/json;chartset=utf-8")
	@ResponseBody
	public GareaRsp infoCreate(CreateInfoReq req) {
		//HttpServletRequest request,
		//@RequestParam("file") MultipartFile file
		Log.info("req : " + req);
		//Object xxx = request.getParameter("name");
		/*try {
			//拿到输出流，同时重命名上传的文件  
			FileOutputStream os = new FileOutputStream("E:/" + file.getOriginalFilename());
			//拿到上传文件的输入流  
			FileInputStream in = (FileInputStream) file.getInputStream();

			//以写字节的方式写文件  
			int b = 0;
			while ((b = in.read()) != -1) {
				os.write(b);
			}
			os.flush();
			os.close();
			in.close(); 

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("上传出错");
		}*/
		GareaRsp rsp = new GareaRsp();
		rsp.setSuccess(false);
		Log.info("rsp : " + rsp);
		return rsp;
	}

	/**
	 * 3.1.2Upload search report
	 */
	@RequestMapping(value = "/api/dt/detectReport/create", method = RequestMethod.POST)
	@ResponseBody
	public GareaRsp detectReport(DetectReportReq req) {
		Log.info("req : " + req);
		GareaRsp rsp = new GareaRsp();
		rsp.setSuccess(false);
		Log.info("rsp : " + rsp);
		return rsp;
	}

	/**
	 * 3.2.1 uploadBMIdata interface
	 */
	@RequestMapping(value = "/api/dt/bmi/create", method = RequestMethod.POST)
	@ResponseBody
	public GareaRsp bmi(BmiReq req) {
		Log.info("req : " + req);
		GareaRsp rsp = new GareaRsp();
		rsp.setSuccess(false);
		Log.info("rsp : " + rsp);
		return rsp;
	}
	
	/**
	 * 3.2.2 ECGSave
	 */
	@RequestMapping(value = "/api/dt/ecgManage/create", method = RequestMethod.POST)
	@ResponseBody
	public GareaRsp ecgManage (EcgReq req) {
		Log.info("req : " + req);
		GareaRsp rsp = new GareaRsp();
		rsp.setSuccess(false);
		Log.info("rsp : " + rsp);
		return rsp;
	}

	@RequestMapping(value = "/api/dt/temperature/create", method = RequestMethod.POST, consumes="application/json;chartset=utf-8")
	@ResponseBody
	public GareaRsp temperatureCreate(CreatTemperatureReq req) {
		Log.info("req : " + req);
		GareaRsp rsp = new GareaRsp();
		rsp.setSuccess(false);
		Log.info("rsp : " + rsp);
		return rsp;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public GareaRsp getxx() {
		GareaRsp rsp = new GareaRsp();
		rsp.setSuccess(false);
		Log.info("rsp : " + rsp);
		return rsp;
	}

}