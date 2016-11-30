package com.net.nky.garea.util;

/**
 * 一般就是按I II III aVR aVL aVF V1 V2 V3 V4 V5 V6顺序显示吧
 * 传给你们的是12导的数据  你们需要把这12导数据还原成波形显示，一般就是刚才那顺序纵向排列
 * 
 * 12导联的 逻辑 还是这样的  
 * 但这种方式显示  确实不敢恭维 
 * 我以前对接过别人的心电图  都是拿到12导联的 数据   通过代码 自己绘制图形  
 * @author Ken
 * @version 2016年9月23日
 */
public class EcgUtil {
	
    public static String getResultText(int code) {

		switch ((int) code) {
		case -1:
			return null;
		case 0:
			return "Arrhythmia,Conduction block,Myocardial Infarction,ST & Tabnormal,Ventricular Hypertrophy,Atrial Hypertrophy,心电轴abnormal";
		case 1100:
			return "Sinus Rhythm";
		case 1120:
			return "Sinus Tachycardia";
		case 1130:
			return "Sinus Bradycardia";
		case 1102:
			return "Sinus Arrhythmia";
		case 1108:
			return "Sever Sinus Arrhythmia";
		case 1200:
			return "Atrial Rhythm";
		case 1220:
			return "Atrial Tachycardia";
		case 1210:
			return "Atrial Fibrillation";
		case 12101:
			return "Tachycardia Atrial Fibrillation";
		case 12102:
			return "Atrial Fibrillation";
		case 12103:
			return "Atrial Fibrillation merged Premature  Ventricular Contraction (PVC )or Intraventricular Aberrant Conduction";
		case 12108:
			return "Tachycardia Atrial Fibrillation merged Premature Ventricular Beats or Intraventricular Aberrant Conduction";
		case 12109:
			return "Atrial Fibrillation merged Premature Ventricular Beats or Intraventricular Aberrant Conduction";
		case 1250:
			return "Atrial Flutter";
		case 12503:
			return "Artial Fluttrt merged Premature Ventricular  Contraction ( PVC )or Intraventricular Aberrant Conduction";
		case 12505:
			return ""Atrial Flutter  intermittent"";
		case 1300:
			return "junctional rhythm";
		case 1320:
			return "The borderline tachycardia";
		case 1330:
			return "Borderline ventricular tachycardia";
		case 1400:
			return "Supraventricular Rhythm";
		case 1420:
			return "Supraventricular Tachycardia";
		case 1430:
			return "Supraventricular Bradycardia";
		case 1470:
			return "Spontaneous Supraventricular Contraction";
		case 1474:
			return "Frequent premature ventricular contraction";
		case 1475:
			return "Frequency of premature ventricular contraction before the formation of the two law";
		case 1500:
			return "Ventricular Rhythm";
		case 1520:
			return "Ventricular Tachycardia";
		case 1570:
			return "Spontaneous Ventricular Premature Contraction";
		case 1574:
			return "Frequent premature ventricular contractions";
		case 1575:
			return "Frequent premature ventricular contraction and the formation of the two joint law";
		case 1970:
			return "Spontaneous Ectopic Premature Contraction";
		case 1974:
			return "Recurrent ectopic period before contraction";
		case 1975:
			return "Two laws of the formation of the premature contraction of the recurrent ectopic phase";
		case 16006:
			return "AAIPacing Electrocardiogram";
		case 16007:
			return "VVIPacing Electrocardiogram";
		case 1901:
			return "Undetermined Regular Cardiac Rhythm";
		case 1902:
			return "Undetermined Cardiac Rhythm";
		case 2210:
			return "PRInterval shortening";
		case 2216:
			return "AtypeWPWsyndrome";
		case 2217:
			return "BtypeWPWsyndrome";
		case 2218:
			return "WPWsyndrome";
		case 2219:
			return "intermittentWPWsyndrome";
		case 2231:
			return "I Atrioventricular Block";
		case 2232:
			return "II Atrioventricular Block，MorseIGender";
		case 2233:
			return "II Atrioventricular Block，MorseIIGender";
		case 2420:
			return "Right Ventricular Donduction Delay";
		case 2440:
			return "Incomplete right bundle branch block";
		case 2450:
			return "Complete Right Bundle Branch Block";
		case 24501:
			return "Complete right bundle branch block with right ventricular hypertrophy";
		case 2540:
			return "Incomplete left bundle branch block";
		case 2550:
			return "Complete Left Bundle Brank Block";
		case 2630:
			return "Left Anterior Branch Block";
		case 2730:
			return "Left Posterior Fascicular Block";
		case 2320:
			return "Intraventricular Conduction Delay (IVCD)";
		case 2330:
			return "Intraventricular Block";
		case 9110:
			return "** Normal ECG **";
		case 9120:
			return "** Atypical electrocardiogram **";
		case 9130:
			return "** Suspicious Electrocardiogram（ECG） **";
		case 9140:
			return "** Abnormal ECG **";
		case 5120:
			return "Suspicious Right Ventricular Hypertrophy";
		case 5130:
			return "Right Ventricular Hypertrophy";
		case 5134:
			return "Right Ventricular Hypertrophy，companionST-Tchange";
		case 5211:
			return "Left Ventricular Hypertrophy";
		case 5220:
			return "Left Ventricular Hypertrophy";
		case 5222:
			return "Suspicious Left Ventricular Hypertrophy";
		case 5233:
			return "Left Ventricular Hypertrophy";
		case 5234:
			return "Left Ventricular Hypertrophy，companionST-Tchange";
		case 3113:
			return "Remote Anterior Myocardial Infarction awaiting investigation";
		case 3112:
			return "Sub-acute Anterior  Myocardial Infarction  awaiting investigation";
		case 3111:
			return " Acute Anterior Myocardial Infarction under investigation";
		case 3123:
			return "Suspicious Remote Anterior Myocardial Infarction";
		case 3122:
			return "Suspicious Sub-acute Anterior  Myocardial Infarction";
		case 3121:
			return "Suspicious Acute Anterior  Myocardial Infarction";
		case 3133:
			return "Remote Anterior Myocardial Infarction";
		case 3132:
			return "Sub-acute Anterior  Myocardial Infarction";
		case 3131:
			return " Acute Anterior  Myocardial Infarction";
		case 3413:
			return "Remote Anterior  Myocardial Infarction awaiting investigation";
		case 3412:
			return "Sub-acute Anteroseptal  Myocardial Infarction  awaiting investigation";
		case 3411:
			return "Acute Anteroseptal  myocardial infarction under investigation";
		case 3423:
			return "Suspicious Remote  Anteroseptal    Myocardial Infarction";
		case 3422:
			return "Suspicious Sub-acute Anteroseptal  Myocardial Infarction";
		case 3421:
			return "Suspicious Acute Anteroseptal  Myocardial Infarction";
		case 3433:
			return "Remote Anterior Myocardial Infarction";
		case 3432:
			return "Sub-acute Anteroseptal  Myocardial Infarction";
		case 3431:
			return "Acute Anteroseptal  Myocardial Infarction";
		case 3513:
			return "Remote Lateral  Myocardial Infarction awaiting investigation";
		case 3512:
			return "Sub-acute Lateral Myocardial Infarction  awaiting investigation";
		case 3511:
			return "Acute Lateral Myocardial Infarction under investigation";
		case 3523:
			return "Suspicious Remote Lateral Myocardial Infarction";
		case 3522:
			return "Suspicious Sub-acute Lateral Myocardial Infarction";
		case 3521:
			return "Suspicious Acute Lateral Myocardial Infarction";
		case 3533:
			return "Remote Lateral Myocardial Infarction";
		case 3532:
			return "Sub-acute Lateral Myocardial Infarction";
		case 3531:
			return "Acute Lateral Myocardial Infarction";
		case 3613:
			return "Remote Inferior Myocardial Infarction awaiting investigation";
		case 3612:
			return "Sub-acute Inferior Myocardial Infarction  awaiting investigation";
		case 3611:
			return "Acute Inferior Myocardial Infarction under investigation";
		case 3623:
			return "Suspicious Remote Inferior  Myocardial Infarction";
		case 3622:
			return "Suspicious Sub-acute Inferior Myocardial Infarction";
		case 3621:
			return "Suspicious Acute Inferior  Myocardial Infarction";
		case 3633:
			return "Remote  Inferior Myocardial Infarction";
		case 3632:
			return "Sub-acute Inferior Myocardial Infarction";
		case 3631:
			return "Acute Inferior Myocardial Infarction";
		case 36132:
			return "Old inferior wall and posterior wall myocardial infarction";
		case 36122:
			return "Sub-acute Inferior& Posterior Myocardial Infarction awaiting investigation";
		case 36112:
			return "Acute Inferior & Posterior  Myocardial Infarction under investigation";
		case 36232:
			return "Suspicious Remote Inferior & Posterior  Myocardial Infarction";
		case 36222:
			return "Suspicious Sub-acute Inferior and Posterior Myocardial Infarction";
		case 36212:
			return "Suspicious Acute Inferior and Posterior Myocardial Infarction";
		case 36332:
			return "Remote Inferior & Posterior  Myocardial Infarction";
		case 36322:
			return "Sub-acute Inferior& Posterior Myocardial Infarction";
		case 36312:
			return "Acute Inferior & Posterior  Myocardial Infarction";
		case 31131:
			return "V3/V4abnormalQwave（Myocardial Infarction Suspected）";
		case 34131:
			return "V1/V2abnormalQwave（Myocardial Infarction Suspected）";
		case 35131:
			return "I/AVL/V5/V6abnormalQwave（Myocardial Infarction Suspected）";
		case 36131:
			return "II/AVFabnormalQwave（Myocardial Infarction Suspected）";
		case 4038:
			return "STSegment elevation";
		case 40304:
			return "Acute Pericarditis";
		case 4164:
			return "Suspicious Anterior Myocardial Ischemia";
		case 4165:
			return "Anterior Myocardial Ischemia";
		case 4564:
			return "Suspicious Lateral Myocardial Ischemia";
		case 4565:
			return "Lateral Myocardial Ischemia";
		case 4664:
			return "Suspicious Inferior Myocardial Ischemia";
		case 4665:
			return "Inferior wall myocardial ischemia";
		case 4136:
			return "Suspicious Anterior Myocardial Damage";
		case 4137:
			return "Anterior Myocardial Damage";
		case 4536:
			return "Suspicious Lateral Myocardial Damage";
		case 4537:
			return "Lateral Myocardial Damage";
		case 4636:
			return "Suspicious Inferior Myocardial Damage";
		case 4637:
			return "Inferior wall myocardial damage";
		case 40106:
			return "STLower segment，likely Digitalis Effect";
		case 4011:
			return "MildSTDuan low";
		case 40116:
			return "MildSTDuan low，likely Digitalis Effect";
		case 4012:
			return "ModerateSTDuan low";
		case 40126:
			return "ModerateSTDuan low，likely Digitalis Effect";
		case 4016:
			return "SignificantSTDuan low，likely Myocardial Demage";
		case 40166:
			return "SignificantSTDuan low，likely Myocardial Demage or Digitalis Effect";
		case 4017:
			return "SignificantSTDuan low，Consistent with myocardial damage";
		case 4021:
			return "STparagraphJPoint type reduction，likely Normal";
		case 4023:
			return "STparagraphJPoint type reduction";
		case 40302:
			return "STSegment elevation，likely ERS（Early Repolarization Syndrome）";
		case 40303:
			return "early repolarization syndrome";
		case 4050:
			return "TWave height，For hyperkalemia";
		case 4068:
			return "TWave anomaly";
		case 40686:
			return "Nonspecific.TWave anomaly，likely Digitalis Effect";
		case 4436:
			return "Suspicious Anteroseptal Myocardial Damage";
		case 4437:
			return "Anteroseptal Myocardial Damage";
		case 6120:
			return "Suspicious Right Atrial Hypertrophy";
		case 6130:
			return "Right Atrial Hypertrophy";
		case 6220:
			return "Suspicious Left Atrial Hypertrophy";
		case 6230:
			return "Left Atrial Hypertrophy";
		case 7102:
			return "Mild Right Axis Deviation";
		case 7100:
			return "Right Axis Deviation";
		case 7202:
			return "Mild Left Axis Deviation";
		case 7200:
			return "Left Axis Deviation";
		case 7300:
			return "Severe Right Axis Deviation";
		case 7400:
			return "S1-S2-S3syndrome";
		case 7500:
			return "QRS-TIncluded angle anomaly";
		case 8003:
			return "Suspicious Chronic Pulmonary Heart Disease";
		case 8100:
			return "low voltage";
		case 8101:
			return "Limb-lead Low Voltage";
		case 8102:
			return "Chest-lead Low Voltage";
		case 8200:
			return "Dextrocardia";
		case 8304:
			return "QTcProlongation of interval";
		case 8305:
			return "QTcShortened interval";
		case 101:
			return "Left&right Upper Limb Electrode Reverse";
		case 4048:
			return "ST-Tabnormal";
		case 16008:
			return "DDDPacing Electrocardiogram";
		case 16009:
			return "Pacing Electrocardiogram";
		}
		return null;
	}
    
    public static String getCode(String result) {

    	if(result.equals("Arrhythmia,Conduction block,Myocardial Infarction,ST & Tabnormal,Ventricular Hypertrophy,Atrial Hypertrophy,心电轴abnormal")){
    		return "0";
    	}else if(result == null || result == ""){
    		return "-1";
    	}else if(result.equals("Sinus Rhythm")){
    		return "1100";
    	}else if(result.equals("Sinus Tachycardia")){
    		return "1120";
    	}else if(result.equals("Sinus Bradycardia")){
    		return "1130";
    	}else if(result.equals("Sinus Arrhythmia")){
    		return "1102";
    	}else if(result.equals("Sever Sinus Arrhythmia")){
    		return "1108";
    	}else if(result.equals("Atrial Rhythm")){
    		return "1200";
    	}else if(result.equals("Atrial Tachycardia")){
    		return "1220";
    	}else if(result.equals("Atrial Fibrillation")){
    		return "1210";
    	}else if(result.equals("Tachycardia Atrial Fibrillation")){
    		return "12101";
    	}else if(result.equals("Atrial Fibrillation")){
    		return "12102";
    	}else if(result.equals("Atrial Fibrillation merged Premature  Ventricular Contraction (PVC )or Intraventricular Aberrant Conduction")){
    		return "12103";
    	}else if(result.equals("Tachycardia Atrial Fibrillation merged Premature Ventricular Beats or Intraventricular Aberrant Conduction")){
    		return "12108";
    	}else if(result.equals("Atrial Fibrillation merged Premature Ventricular Beats or Intraventricular Aberrant Conduction")){
    		return "12109";
    	}else if(result.equals("Atrial Flutter")){
    		return "1250";
    	}else if(result.equals("Artial Fluttrt merged Premature Ventricular  Contraction ( PVC )or Intraventricular Aberrant Conduction")){
    		return "12503";
    	}else if(result.equals(""Atrial Flutter  intermittent"")){
    		return "12505";
    	}else if(result.equals("junctional rhythm")){
    		return "1300";
    	}else if(result.equals("The borderline tachycardia")){
    		return "1320";
    	}else if(result.equals("Borderline ventricular tachycardia")){
    		return "1330";
    	}else if(result.equals("Supraventricular Rhythm")){
    		return "1400";
    	}else if(result.equals("Supraventricular Tachycardia")){
    		return "1420";
    	}else if(result.equals("Supraventricular Bradycardia")){
    		return "1430";
    	}else if(result.equals("Spontaneous Supraventricular Contraction")){
    		return "1470";
    	}else if(result.equals("Frequent premature ventricular contraction")){
    		return "1474";
    	}else if(result.equals("Frequency of premature ventricular contraction before the formation of the two law")){
    		return "1475";
    	}else if(result.equals("Ventricular Rhythm")){
    		return "1500";
    	}else if(result.equals("Ventricular Tachycardia")){
    		return "1520";
    	}else if(result.equals("Spontaneous Ventricular Premature Contraction")){
    		return "1570";
    	}else if(result.equals("Frequent premature ventricular contractions")){
    		return "1574";
    	}else if(result.equals("Frequent premature ventricular contraction and the formation of the two joint law")){
    		return "1575";
    	}else if(result.equals("Spontaneous Ectopic Premature Contraction")){
    		return "1970";
    	}else if(result.equals("Recurrent ectopic period before contraction")){
    		return "1974";
    	}else if(result.equals("Two laws of the formation of the premature contraction of the recurrent ectopic phase")){
    		return "1975";
    	}else if(result.equals("AAIPacing Electrocardiogram")){
    		return "16006";
    	}else if(result.equals("VVIPacing Electrocardiogram")){
    		return "16007";
    	}else if(result.equals("Undetermined Regular Cardiac Rhythm")){
    		return "1901";
    	}else if(result.equals("Undetermined Cardiac Rhythm")){
    		return "1902";
    	}else if(result.equals("PRInterval shortening")){
    		return "2210";
    	}else if(result.equals("AtypeWPWsyndrome")){
    		return "2216";
    	}else if(result.equals("BtypeWPWsyndrome")){
    		return "2217";
    	}else if(result.equals("WPWsyndrome")){
    		return "2218";
    	}else if(result.equals("intermittentWPWsyndrome")){
    		return "2219";
    	}else if(result.equals("I Atrioventricular Block")){
    		return "2231";
    	}else if(result.equals("II Atrioventricular Block，MorseIGender")){
    		return "2232";
    	}else if(result.equals("II Atrioventricular Block，MorseIIGender")){
    		return "2233";
    	}else if(result.equals("Right Ventricular Donduction Delay")){
    		return "2420";
    	}else if(result.equals("Incomplete right bundle branch block")){
    		return "2440";
    	}else if(result.equals("Complete Right Bundle Branch Block")){
    		return "2450";
    	}else if(result.equals("Complete right bundle branch block with right ventricular hypertrophy")){
    		return "24501";
    	}else if(result.equals("Incomplete left bundle branch block")){
    		return "2540";
    	}else if(result.equals("Complete Left Bundle Brank Block")){
    		return "2550";
    	}else if(result.equals("Left Anterior Branch Block")){
    		return "2630";
    	}else if(result.equals("Left Posterior Fascicular Block")){
    		return "2730";
    	}else if(result.equals("Intraventricular Conduction Delay (IVCD)")){
    		return "2320";
    	}else if(result.equals("Intraventricular Block")){
    		return "2330";
    	}else if(result.equals("** Normal ECG **")){
    		return "9110";
    	}else if(result.equals("** Atypical electrocardiogram **")){
    		return "9120";
    	}else if(result.equals("** Suspicious Electrocardiogram（ECG） **")){
    		return "9130";
    	}else if(result.equals("** Abnormal ECG **")){
    		return "9140";
    	}else if(result.equals("Suspicious Right Ventricular Hypertrophy")){
    		return "5120";
    	}else if(result.equals("Right Ventricular Hypertrophy")){
    		return "5130";
    	}else if(result.equals("Right Ventricular Hypertrophy，companionST-Tchange")){
    		return "5134";
    	}else if(result.equals("Left Ventricular Hypertrophy")){
    		return "5211";
    	}else if(result.equals("Left Ventricular Hypertrophy")){
    		return "5220";
    	}else if(result.equals("Suspicious Left Ventricular Hypertrophy")){
    		return "5222";
    	}else if(result.equals("Left Ventricular Hypertrophy")){
    		return "5233";
    	}else if(result.equals("Left Ventricular Hypertrophy，companionST-Tchange")){
    		return "5234";
    	}else if(result.equals("Remote Anterior Myocardial Infarction awaiting investigation")){
    		return "3113";
    	}else if(result.equals("Sub-acute Anterior  Myocardial Infarction  awaiting investigation")){
    		return "3112";
    	}else if(result.equals(" Acute Anterior Myocardial Infarction under investigation")){
    		return "3111";
    	}else if(result.equals("Suspicious Remote Anterior Myocardial Infarction")){
    		return "3123";
    	}else if(result.equals("Suspicious Sub-acute Anterior  Myocardial Infarction")){
    		return "3122";
    	}else if(result.equals("Suspicious Acute Anterior  Myocardial Infarction")){
    		return "3121";
    	}else if(result.equals("Remote Anterior Myocardial Infarction")){
    		return "3133";
    	}else if(result.equals("Sub-acute Anterior  Myocardial Infarction")){
    		return "3132";
    	}else if(result.equals(" Acute Anterior  Myocardial Infarction")){
    		return "3131";
    	}else if(result.equals("Remote Anterior  Myocardial Infarction awaiting investigation")){
    		return "3413";
    	}else if(result.equals("Sub-acute Anteroseptal  Myocardial Infarction  awaiting investigation")){
    		return "3412";
    	}else if(result.equals("Acute Anteroseptal  myocardial infarction under investigation")){
    		return "3411";
    	}else if(result.equals("Suspicious Remote  Anteroseptal    Myocardial Infarction")){
    		return "3423";
    	}else if(result.equals("Suspicious Sub-acute Anteroseptal  Myocardial Infarction")){
    		return "3422";
    	}else if(result.equals("Suspicious Acute Anteroseptal  Myocardial Infarction")){
    		return "3421";
    	}else if(result.equals("Remote Anterior Myocardial Infarction")){
    		return "3433";
    	}else if(result.equals("Sub-acute Anteroseptal  Myocardial Infarction")){
    		return "3432";
    	}else if(result.equals("Acute Anteroseptal  Myocardial Infarction")){
    		return "3431";
    	}else if(result.equals("Remote Lateral  Myocardial Infarction awaiting investigation")){
    		return "3513";
    	}else if(result.equals("Sub-acute Lateral Myocardial Infarction  awaiting investigation")){
    		return "3512";
    	}else if(result.equals("Acute Lateral Myocardial Infarction under investigation")){
    		return "3511";
    	}else if(result.equals("Suspicious Remote Lateral Myocardial Infarction")){
    		return "3523";
    	}else if(result.equals("Suspicious Sub-acute Lateral Myocardial Infarction")){
    		return "3522";
    	}else if(result.equals("Suspicious Acute Lateral Myocardial Infarction")){
    		return "3521";
    	}else if(result.equals("Remote Lateral Myocardial Infarction")){
    		return "3533";
    	}else if(result.equals("Sub-acute Lateral Myocardial Infarction")){
    		return "3532";
    	}else if(result.equals("Acute Lateral Myocardial Infarction")){
    		return "3531";
    	}else if(result.equals("Remote Inferior Myocardial Infarction awaiting investigation")){
    		return "3613";
    	}else if(result.equals("Sub-acute Inferior Myocardial Infarction  awaiting investigation")){
    		return "3612";
    	}else if(result.equals("Acute Inferior Myocardial Infarction under investigation")){
    		return "3611";
    	}else if(result.equals("Suspicious Remote Inferior  Myocardial Infarction")){
    		return "3623";
    	}else if(result.equals("Suspicious Sub-acute Inferior Myocardial Infarction")){
    		return "3622";
    	}else if(result.equals("Suspicious Acute Inferior  Myocardial Infarction")){
    		return "3621";
    	}else if(result.equals("Remote  Inferior Myocardial Infarction")){
    		return "3633";
    	}else if(result.equals("Sub-acute Inferior Myocardial Infarction")){
    		return "3632";
    	}else if(result.equals("Acute Inferior Myocardial Infarction")){
    		return "3631";
    	}else if(result.equals("Old inferior wall and posterior wall myocardial infarction")){
    		return "36132";
    	}else if(result.equals("Sub-acute Inferior& Posterior Myocardial Infarction awaiting investigation")){
    		return "36122";
    	}else if(result.equals("Acute Inferior & Posterior  Myocardial Infarction under investigation")){
    		return "36112";
    	}else if(result.equals("Suspicious Remote Inferior & Posterior  Myocardial Infarction")){
    		return "36232";
    	}else if(result.equals("Suspicious Sub-acute Inferior and Posterior Myocardial Infarction")){
    		return "36222";
    	}else if(result.equals("Suspicious Acute Inferior and Posterior Myocardial Infarction")){
    		return "36212";
    	}else if(result.equals("Remote Inferior & Posterior  Myocardial Infarction")){
    		return "36332";
    	}else if(result.equals("Sub-acute Inferior& Posterior Myocardial Infarction")){
    		return "36322";
    	}else if(result.equals("Acute Inferior & Posterior  Myocardial Infarction")){
    		return "36312";
    	}else if(result.equals("V3/V4abnormalQwave（Myocardial Infarction Suspected）")){
    		return "31131";
    	}else if(result.equals("V1/V2abnormalQwave（Myocardial Infarction Suspected）")){
    		return "34131";
    	}else if(result.equals("I/AVL/V5/V6abnormalQwave（Myocardial Infarction Suspected）")){
    		return "35131";
    	}else if(result.equals("II/AVFabnormalQwave（Myocardial Infarction Suspected）")){
    		return "36131";
    	}else if(result.equals("STSegment elevation")){
    		return "4038";
    	}else if(result.equals("Acute Pericarditis")){
    		return "40304";
    	}else if(result.equals("Suspicious Anterior Myocardial Ischemia")){
    		return "4164";
    	}else if(result.equals("Anterior Myocardial Ischemia")){
    		return "4165";
    	}else if(result.equals("Suspicious Lateral Myocardial Ischemia")){
    		return "4564";
    	}else if(result.equals("Lateral Myocardial Ischemia")){
    		return "4565";
    	}else if(result.equals("Suspicious Inferior Myocardial Ischemia")){
    		return "4664";
    	}else if(result.equals("Inferior wall myocardial ischemia")){
    		return "4665";
    	}else if(result.equals("Suspicious Anterior Myocardial Damage")){
    		return "4136";
    	}else if(result.equals("Anterior Myocardial Damage")){
    		return "4137";
    	}else if(result.equals("Suspicious Lateral Myocardial Damage")){
    		return "4536";
    	}else if(result.equals("Lateral Myocardial Damage")){
    		return "4537";
    	}else if(result.equals("Suspicious Inferior Myocardial Damage")){
    		return "4636";
    	}else if(result.equals("Inferior wall myocardial damage")){
    		return "4637";
    	}else if(result.equals("STLower segment，likely Digitalis Effect")){
    		return "40106";
    	}else if(result.equals("MildSTDuan low")){
    		return "4011";
    	}else if(result.equals("MildSTDuan low，likely Digitalis Effect")){
    		return "40116";
    	}else if(result.equals("ModerateSTDuan low")){
    		return "4012";
    	}else if(result.equals("ModerateSTDuan low，likely Digitalis Effect")){
    		return "40126";
    	}else if(result.equals("SignificantSTDuan low，likely Myocardial Demage")){
    		return "4016";
    	}else if(result.equals("SignificantSTDuan low，likely Myocardial Demage or Digitalis Effect")){
    		return "40166";
    	}else if(result.equals("SignificantSTDuan low，Consistent with myocardial damage")){
    		return "4017";
    	}else if(result.equals("STparagraphJPoint type reduction，likely Normal")){
    		return "4021";
    	}else if(result.equals("STparagraphJPoint type reduction")){
    		return "4023";
    	}else if(result.equals("STSegment elevation，likely ERS（Early Repolarization Syndrome）")){
    		return "40302";
    	}else if(result.equals("early repolarization syndrome")){
    		return "40303";
    	}else if(result.equals("TWave height，For hyperkalemia")){
    		return "4050";
    	}else if(result.equals("TWave anomaly")){
    		return "4068";
    	}else if(result.equals("Nonspecific.TWave anomaly，likely Digitalis Effect")){
    		return "40686";
    	}else if(result.equals("Suspicious Anteroseptal Myocardial Damage")){
    		return "4436";
    	}else if(result.equals("Anteroseptal Myocardial Damage")){
    		return "4437";
    	}else if(result.equals("Suspicious Right Atrial Hypertrophy")){
    		return "6120";
    	}else if(result.equals("Right Atrial Hypertrophy")){
    		return "6130";
    	}else if(result.equals("Suspicious Left Atrial Hypertrophy")){
    		return "6220";
    	}else if(result.equals("Left Atrial Hypertrophy")){
    		return "6230";
    	}else if(result.equals("Mild Right Axis Deviation")){
    		return "7102";
    	}else if(result.equals("Right Axis Deviation")){
    		return "7100";
    	}else if(result.equals("Mild Left Axis Deviation")){
    		return "7202";
    	}else if(result.equals("Left Axis Deviation")){
    		return "7200";
    	}else if(result.equals("Severe Right Axis Deviation")){
    		return "7300";
    	}else if(result.equals("S1-S2-S3syndrome")){
    		return "7400";
    	}else if(result.equals("QRS-TIncluded angle anomaly")){
    		return "7500";
    	}else if(result.equals("Suspicious Chronic Pulmonary Heart Disease")){
    		return "8003";
    	}else if(result.equals("low voltage")){
    		return "8100";
    	}else if(result.equals("Limb-lead Low Voltage")){
    		return "8101";
    	}else if(result.equals("Chest-lead Low Voltage")){
    		return "8102";
    	}else if(result.equals("Dextrocardia")){
    		return "8200";
    	}else if(result.equals("QTcProlongation of interval")){
    		return "8304";
    	}else if(result.equals("QTcShortened interval")){
    		return "8305";
    	}else if(result.equals("Left&right Upper Limb Electrode Reverse")){
    		return "101";
    	}else if(result.equals("ST-Tabnormal")){
    		return "4048";
    	}else if(result.equals("DDDPacing Electrocardiogram")){
    		return "16008";
    	}else if(result.equals("Pacing Electrocardiogram")){
    		return "16009";
    	}
    	return "-1";
	}
    
//    paramsMap.put("HeartRate", ecgParams[0]);
//	paramsMap.put("PAxis", ecgParams[1]);
//	paramsMap.put("QRSAxis", ecgParams[2]);
//	paramsMap.put("Taxis", ecgParams[3]);
//	paramsMap.put("PR", ecgParams[4]);
//	paramsMap.put("QRS", ecgParams[5]);
//	paramsMap.put("QT", ecgParams[6]);
//	paramsMap.put("QTc", ecgParams[7]);
//	paramsMap.put("RV5", ecgParams[8]);
//	paramsMap.put("SV1", ecgParams[9]);
//	paramsMap.put("RV5SV1", ecgParams[10]);
//	paramsMap.put("PExist", ecgParams[11]);
//	paramsMap.put("PWidth", ecgParams[12]);
    
    public static void main(String[] args){
    	
    	String xx = getCode("sdasdas");
    	System.out.println(xx);
    }
    
}