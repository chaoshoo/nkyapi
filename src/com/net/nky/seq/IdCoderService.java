package com.net.nky.seq;

import org.springframework.stereotype.Service;

/**
 * Uniform codingID
 * @author lenovo
 *
 */
@Service(value="idCoderService")
public class IdCoderService {
//	@Autowired
//	private SysUserDao sysUserDao;
	

//	统一编码  
//	系统用户  SXXXX  例如 S0001
//	医院用户  Hxxxx
//	医生用户   Dxxxx
//	客户     Vxxxx
//	
	/**
	 * Get user unified coding
	 * @return
	 * @throws Exception 
	 */
	public String getVip() throws Exception {
		String id = "V";
		id+=SysId.getInstance().getId("SEQ_SYS_ID");
		return id;
	}
	
	
	/**
	 * Acquisition system user code
	 * @return
	 * @throws Exception 
	 */
	public String getSys() throws Exception {
		String id = "S";
		id+=SysId.getInstance().getId("SEQ_SYS_ID");
		return id;
	}

	
	/**
	 * Get hospital code
	 * @return
	 * @throws Exception 
	 */
	public String getHospital() throws Exception {
		String id = "H";
		id+=SysId.getInstance().getId("SEQ_HOSPITAL_ID");
		return id;
	}
	
	/**
	 * Get doctor code
	 * @return
	 * @throws Exception 
	 */
	public String getPartnerChild() throws Exception {
		String id = "D";
		id+=SysId.getInstance().getId("SEQ_DOCTOR_ID");
		return id;
	}
	/**
	 * Get the supply and marketing business code
	 * @return
	 * @throws Exception 
	 */
	public String getSupplyClientCode() throws Exception {
		String id = "V";
		id+=SysId.getInstance().getId("SEQ_VIP_ID");
		return id;
	}
	
}