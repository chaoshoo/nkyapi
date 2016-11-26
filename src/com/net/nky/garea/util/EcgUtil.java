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
			return "Arrhythmia,Conduction block,Miocardial infarction,ST & Tabnormal,ventricular hypertrophy,Atrial hypertrophy,心电轴abnormal";
		case 1100:
			return "Sinus rhythm";
		case 1120:
			return "Tachycardia of sinus";
		case 1130:
			return "Sinus tachycardia, sinus";
		case 1102:
			return "Sinus arrhythmia";
		case 1108:
			return "Extreme sinus arrhythmia";
		case 1200:
			return "Atrial rhythm";
		case 1220:
			return "Paroxysmal atrial tachycardia";
		case 1210:
			return "Atrial fibrillation";
		case 12101:
			return "Tachycardia atrial fibrillation";
		case 12102:
			return "Bradycardia and atrial fibrillation";
		case 12103:
			return "Atrial fibrillation and ventricular premature contraction or difference in conduction";
		case 12108:
			return "Paroxysmal atrial fibrillation with ventricular premature contraction or differential conduction";
		case 12109:
			return "Bradycardia and atrial fibrillation and ventricular extrasystoles or aberrant ventricular conduction";
		case 1250:
			return "Atrial flutter";
		case 12503:
			return "Atrial flutter and ventricular extrasystoles or aberrant ventricular conduction";
		case 12505:
			return "Atrial flutter row";
		case 1300:
			return "junctional rhythm";
		case 1320:
			return "The borderline tachycardia";
		case 1330:
			return "Borderline ventricular tachycardia";
		case 1400:
			return "Ventricular rhythm";
		case 1420:
			return "Paroxysmal ventricular tachycardia";
		case 1430:
			return "Paroxysmal ventricular tachycardia";
		case 1470:
			return "Occasional ventricular premature contraction";
		case 1474:
			return "Frequent premature ventricular contraction";
		case 1475:
			return "Frequency of premature ventricular contraction before the formation of the two law";
		case 1500:
			return "Ventricular rhythm";
		case 1520:
			return "Ventricular tachycardia, ventricular tachycardia";
		case 1570:
			return "Episodic ventricular premature contraction";
		case 1574:
			return "Frequent premature ventricular contractions";
		case 1575:
			return "Frequent premature ventricular contraction and the formation of the two joint law";
		case 1970:
			return "Episodic ectopic period before contraction";
		case 1974:
			return "Recurrent ectopic period before contraction";
		case 1975:
			return "Two laws of the formation of the premature contraction of the recurrent ectopic phase";
		case 16006:
			return "AAIpacing electrocardiogram";
		case 16007:
			return "VVIpacing electrocardiogram";
		case 1901:
			return "Unable to determine the rules of the rhythm of the heart";
		case 1902:
			return "Unable to determine the rhythm of the heart";
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
			return "IDegree atrioventricular block";
		case 2232:
			return "IIDegree atrioventricular block，MorseIGender";
		case 2233:
			return "IIDegree atrioventricular block，MorseIIGender";
		case 2420:
			return "Right ventricular conduction delay";
		case 2440:
			return "Incomplete right bundle branch block";
		case 2450:
			return "Complete right bundle branch block";
		case 24501:
			return "Complete right bundle branch block with right ventricular hypertrophy";
		case 2540:
			return "Incomplete left bundle branch block";
		case 2550:
			return "Complete left bundle branch block";
		case 2630:
			return "Left anterior branch block";
		case 2730:
			return "Left posterior branch block";
		case 2320:
			return "Intra ventricular conduction delay";
		case 2330:
			return "Ventricular conduction block";
		case 9110:
			return "** Normal ECG **";
		case 9120:
			return "** Atypical electrocardiogram **";
		case 9130:
			return "** Suspicious ECG **";
		case 9140:
			return "** Abnormal ECG **";
		case 5120:
			return "Suspected right ventricular hypertrophy";
		case 5130:
			return "Right ventricular hypertrophy";
		case 5134:
			return "Right ventricular hypertrophy，companionST-Tchange";
		case 5211:
			return "Left ventricular hypertrophy";
		case 5220:
			return "Left ventricular hypertrophy";
		case 5222:
			return "Suspected left ventricular hypertrophy";
		case 5233:
			return "left ventricular hypertrophy";
		case 5234:
			return "left ventricular hypertrophy，companionST-Tchange";
		case 3113:
			return "Old anterior wall myocardial infarction";
		case 3112:
			return "Subacute anterior wall myocardial infarction";
		case 3111:
			return "Acute anterior wall myocardial infarction";
		case 3123:
			return "Suspected old anterior wall myocardial infarction";
		case 3122:
			return "Suspected subacute anterior wall myocardial infarction";
		case 3121:
			return "Suspected acute anterior wall myocardial infarction";
		case 3133:
			return "Old anterior myocardial infarction";
		case 3132:
			return "Subacute anterior myocardial infarction";
		case 3131:
			return "Acute anterior myocardial infarction";
		case 3413:
			return "Old anteroseptal myocardial infarction after discharge";
		case 3412:
			return "Sub acute myocardial infarction after discharge";
		case 3411:
			return "Acute myocardial infarction after discharge";
		case 3423:
			return "Suspicious of old myocardial infarction";
		case 3422:
			return "Suspicious sub acute myocardial infarction";
		case 3421:
			return "Suspected acute myocardial infarction";
		case 3433:
			return "Old anteroseptal myocardial infarction";
		case 3432:
			return "Subacute myocardial infarction";
		case 3431:
			return "Acute myocardial infarction";
		case 3513:
			return "Old side wall myocardial infarction";
		case 3512:
			return "Subacute side wall myocardial infarction";
		case 3511:
			return "Acute side wall myocardial infarction";
		case 3523:
			return "Suspected old myocardial infarction";
		case 3522:
			return "Suspected subacute myocardial infarction";
		case 3521:
			return "Suspected acute myocardial infarction";
		case 3533:
			return "Old myocardial infarction";
		case 3532:
			return "Subacute side wall myocardial infarction";
		case 3531:
			return "Acute myocardial infarction";
		case 3613:
			return "Old inferior myocardial infarction";
		case 3612:
			return "Sub acute inferior myocardial infarction";
		case 3611:
			return "Acute inferior myocardial infarction";
		case 3623:
			return "Suspected old inferior myocardial infarction";
		case 3622:
			return "Suspected subacute inferior myocardial infarction";
		case 3621:
			return "Suspected acute inferior myocardial infarction";
		case 3633:
			return "Old inferior myocardial infarction";
		case 3632:
			return "Sub acute inferior myocardial infarction";
		case 3631:
			return "Acute inferior myocardial infarction";
		case 36132:
			return "Old inferior wall and posterior wall myocardial infarction";
		case 36122:
			return "Subacute inferior wall and posterior wall myocardial infarction";
		case 36112:
			return "Acute inferior wall and posterior wall myocardial infarction";
		case 36232:
			return "Suspected old inferior wall and posterior wall myocardial infarction";
		case 36222:
			return "Suspected subacute inferior wall and posterior wall myocardial infarction";
		case 36212:
			return "Suspected acute inferior wall and posterior wall myocardial infarction";
		case 36332:
			return "Old inferior wall and posterior wall myocardial infarction";
		case 36322:
			return "Subacute inferior wall and posterior wall myocardial infarction";
		case 36312:
			return "Acute inferior wall and posterior wall myocardial infarction";
		case 31131:
			return "V3/V4abnormalQwave（The possibility of myocardial infarction to be discharged）";
		case 34131:
			return "V1/V2abnormalQwave（The possibility of myocardial infarction to be discharged）";
		case 35131:
			return "I/AVL/V5/V6abnormalQwave（The possibility of myocardial infarction to be discharged）";
		case 36131:
			return "II/AVFabnormalQwave（The possibility of myocardial infarction to be discharged）";
		case 4038:
			return "STSegment elevation";
		case 40304:
			return "Acute pericarditis";
		case 4164:
			return "Suspected anterior myocardial ischemia";
		case 4165:
			return "Anterior wall myocardial ischemia";
		case 4564:
			return "Suspected side wall myocardial ischemia";
		case 4565:
			return "Side wall myocardial ischemia";
		case 4664:
			return "Suspected inferior myocardial ischemia";
		case 4665:
			return "Inferior wall myocardial ischemia";
		case 4136:
			return "Suspected anterior wall myocardial injury";
		case 4137:
			return "Anterior wall myocardial injury";
		case 4536:
			return "Suspected lateral wall myocardial injury";
		case 4537:
			return "Lateral wall myocardial injury";
		case 4636:
			return "Suspected inferior myocardial injury";
		case 4637:
			return "Inferior wall myocardial damage";
		case 40106:
			return "STLower segment，May be the role of the";
		case 4011:
			return "MildSTDuan low";
		case 40116:
			return "MildSTDuan low，May be the role of the";
		case 4012:
			return "ModerateSTDuan low";
		case 40126:
			return "ModerateSTDuan low，May be the role of the";
		case 4016:
			return "SignificantSTDuan low，Myocardial injury may be";
		case 40166:
			return "SignificantSTDuan low，May be the effect of myocardial injury or the role of the";
		case 4017:
			return "SignificantSTDuan low，Myocardial injury";
		case 4021:
			return "STparagraphJPoint type reduction，May be normal";
		case 4023:
			return "STparagraphJPoint type reduction";
		case 40302:
			return "STSegment elevation，As of early repolarization syndrome";
		case 40303:
			return "early repolarization syndrome";
		case 4050:
			return "TWave height，For hyperkalemia";
		case 4068:
			return "TWave anomaly";
		case 40686:
			return "Nonspecific.TWave anomaly，May be the role of the";
		case 4436:
			return "Suspected myocardial injury";
		case 4437:
			return "Anteroseptal myocardial injury";
		case 6120:
			return "Suspected right atrial hypertrophy";
		case 6130:
			return "Right atrial hypertrophy";
		case 6220:
			return "Suspected left atrial hypertrophy";
		case 6230:
			return "Left atrial hypertrophy";
		case 7102:
			return "Mild right deviation of electric axis";
		case 7100:
			return "Electric axis right deviation";
		case 7202:
			return "Mild left deviation of electric axis";
		case 7200:
			return "Electric axis left deviation";
		case 7300:
			return "Severe right deviation of electric axis";
		case 7400:
			return "S1-S2-S3syndrome";
		case 7500:
			return "QRS-TIncluded angle anomaly";
		case 8003:
			return "Suspected chronic pulmonary heart disease";
		case 8100:
			return "low voltage";
		case 8101:
			return "Limb lead low voltage";
		case 8102:
			return "Chest lead low voltage";
		case 8200:
			return "Right heart";
		case 8304:
			return "QTcProlongation of interval";
		case 8305:
			return "QTcShortened interval";
		case 101:
			return "Left and right upper limb electrodes";
		case 4048:
			return "ST-Tabnormal";
		case 16008:
			return "DDDpacing electrocardiogram";
		case 16009:
			return "pacing electrocardiogram";
		}
		return null;
	}
    
    public static String getCode(String result) {

    	if(result.equals("Arrhythmia,Conduction block,Miocardial infarction,ST & Tabnormal,ventricular hypertrophy,Atrial hypertrophy,心电轴abnormal")){
    		return "0";
    	}else if(result == null || result == ""){
    		return "-1";
    	}else if(result.equals("Sinus rhythm")){
    		return "1100";
    	}else if(result.equals("Tachycardia of sinus")){
    		return "1120";
    	}else if(result.equals("Sinus tachycardia, sinus")){
    		return "1130";
    	}else if(result.equals("Sinus arrhythmia")){
    		return "1102";
    	}else if(result.equals("Extreme sinus arrhythmia")){
    		return "1108";
    	}else if(result.equals("Atrial rhythm")){
    		return "1200";
    	}else if(result.equals("Paroxysmal atrial tachycardia")){
    		return "1220";
    	}else if(result.equals("Atrial fibrillation")){
    		return "1210";
    	}else if(result.equals("Tachycardia atrial fibrillation")){
    		return "12101";
    	}else if(result.equals("Bradycardia and atrial fibrillation")){
    		return "12102";
    	}else if(result.equals("Atrial fibrillation and ventricular premature contraction or difference in conduction")){
    		return "12103";
    	}else if(result.equals("Paroxysmal atrial fibrillation with ventricular premature contraction or differential conduction")){
    		return "12108";
    	}else if(result.equals("Bradycardia and atrial fibrillation and ventricular extrasystoles or aberrant ventricular conduction")){
    		return "12109";
    	}else if(result.equals("Atrial flutter")){
    		return "1250";
    	}else if(result.equals("Atrial flutter and ventricular extrasystoles or aberrant ventricular conduction")){
    		return "12503";
    	}else if(result.equals("Atrial flutter row")){
    		return "12505";
    	}else if(result.equals("junctional rhythm")){
    		return "1300";
    	}else if(result.equals("The borderline tachycardia")){
    		return "1320";
    	}else if(result.equals("Borderline ventricular tachycardia")){
    		return "1330";
    	}else if(result.equals("Ventricular rhythm")){
    		return "1400";
    	}else if(result.equals("Paroxysmal ventricular tachycardia")){
    		return "1420";
    	}else if(result.equals("Paroxysmal ventricular tachycardia")){
    		return "1430";
    	}else if(result.equals("Occasional ventricular premature contraction")){
    		return "1470";
    	}else if(result.equals("Frequent premature ventricular contraction")){
    		return "1474";
    	}else if(result.equals("Frequency of premature ventricular contraction before the formation of the two law")){
    		return "1475";
    	}else if(result.equals("Ventricular rhythm")){
    		return "1500";
    	}else if(result.equals("Ventricular tachycardia, ventricular tachycardia")){
    		return "1520";
    	}else if(result.equals("Episodic ventricular premature contraction")){
    		return "1570";
    	}else if(result.equals("Frequent premature ventricular contractions")){
    		return "1574";
    	}else if(result.equals("Frequent premature ventricular contraction and the formation of the two joint law")){
    		return "1575";
    	}else if(result.equals("Episodic ectopic period before contraction")){
    		return "1970";
    	}else if(result.equals("Recurrent ectopic period before contraction")){
    		return "1974";
    	}else if(result.equals("Two laws of the formation of the premature contraction of the recurrent ectopic phase")){
    		return "1975";
    	}else if(result.equals("AAIpacing electrocardiogram")){
    		return "16006";
    	}else if(result.equals("VVIpacing electrocardiogram")){
    		return "16007";
    	}else if(result.equals("Unable to determine the rules of the rhythm of the heart")){
    		return "1901";
    	}else if(result.equals("Unable to determine the rhythm of the heart")){
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
    	}else if(result.equals("IDegree atrioventricular block")){
    		return "2231";
    	}else if(result.equals("IIDegree atrioventricular block，MorseIGender")){
    		return "2232";
    	}else if(result.equals("IIDegree atrioventricular block，MorseIIGender")){
    		return "2233";
    	}else if(result.equals("Right ventricular conduction delay")){
    		return "2420";
    	}else if(result.equals("Incomplete right bundle branch block")){
    		return "2440";
    	}else if(result.equals("Complete right bundle branch block")){
    		return "2450";
    	}else if(result.equals("Complete right bundle branch block with right ventricular hypertrophy")){
    		return "24501";
    	}else if(result.equals("Incomplete left bundle branch block")){
    		return "2540";
    	}else if(result.equals("Complete left bundle branch block")){
    		return "2550";
    	}else if(result.equals("Left anterior branch block")){
    		return "2630";
    	}else if(result.equals("Left posterior branch block")){
    		return "2730";
    	}else if(result.equals("Intra ventricular conduction delay")){
    		return "2320";
    	}else if(result.equals("Ventricular conduction block")){
    		return "2330";
    	}else if(result.equals("** Normal ECG **")){
    		return "9110";
    	}else if(result.equals("** Atypical electrocardiogram **")){
    		return "9120";
    	}else if(result.equals("** Suspicious ECG **")){
    		return "9130";
    	}else if(result.equals("** Abnormal ECG **")){
    		return "9140";
    	}else if(result.equals("Suspected right ventricular hypertrophy")){
    		return "5120";
    	}else if(result.equals("Right ventricular hypertrophy")){
    		return "5130";
    	}else if(result.equals("Right ventricular hypertrophy，companionST-Tchange")){
    		return "5134";
    	}else if(result.equals("Left ventricular hypertrophy")){
    		return "5211";
    	}else if(result.equals("Left ventricular hypertrophy")){
    		return "5220";
    	}else if(result.equals("Suspected left ventricular hypertrophy")){
    		return "5222";
    	}else if(result.equals("left ventricular hypertrophy")){
    		return "5233";
    	}else if(result.equals("left ventricular hypertrophy，companionST-Tchange")){
    		return "5234";
    	}else if(result.equals("Old anterior wall myocardial infarction")){
    		return "3113";
    	}else if(result.equals("Subacute anterior wall myocardial infarction")){
    		return "3112";
    	}else if(result.equals("Acute anterior wall myocardial infarction")){
    		return "3111";
    	}else if(result.equals("Suspected old anterior wall myocardial infarction")){
    		return "3123";
    	}else if(result.equals("Suspected subacute anterior wall myocardial infarction")){
    		return "3122";
    	}else if(result.equals("Suspected acute anterior wall myocardial infarction")){
    		return "3121";
    	}else if(result.equals("Old anterior myocardial infarction")){
    		return "3133";
    	}else if(result.equals("Subacute anterior myocardial infarction")){
    		return "3132";
    	}else if(result.equals("Acute anterior myocardial infarction")){
    		return "3131";
    	}else if(result.equals("Old anteroseptal myocardial infarction after discharge")){
    		return "3413";
    	}else if(result.equals("Sub acute myocardial infarction after discharge")){
    		return "3412";
    	}else if(result.equals("Acute myocardial infarction after discharge")){
    		return "3411";
    	}else if(result.equals("Suspicious of old myocardial infarction")){
    		return "3423";
    	}else if(result.equals("Suspicious sub acute myocardial infarction")){
    		return "3422";
    	}else if(result.equals("Suspected acute myocardial infarction")){
    		return "3421";
    	}else if(result.equals("Old anteroseptal myocardial infarction")){
    		return "3433";
    	}else if(result.equals("Subacute myocardial infarction")){
    		return "3432";
    	}else if(result.equals("Acute myocardial infarction")){
    		return "3431";
    	}else if(result.equals("Old side wall myocardial infarction")){
    		return "3513";
    	}else if(result.equals("Subacute side wall myocardial infarction")){
    		return "3512";
    	}else if(result.equals("Acute side wall myocardial infarction")){
    		return "3511";
    	}else if(result.equals("Suspected old myocardial infarction")){
    		return "3523";
    	}else if(result.equals("Suspected subacute myocardial infarction")){
    		return "3522";
    	}else if(result.equals("Suspected acute myocardial infarction")){
    		return "3521";
    	}else if(result.equals("Old myocardial infarction")){
    		return "3533";
    	}else if(result.equals("Subacute side wall myocardial infarction")){
    		return "3532";
    	}else if(result.equals("Acute myocardial infarction")){
    		return "3531";
    	}else if(result.equals("Old inferior myocardial infarction")){
    		return "3613";
    	}else if(result.equals("Sub acute inferior myocardial infarction")){
    		return "3612";
    	}else if(result.equals("Acute inferior myocardial infarction")){
    		return "3611";
    	}else if(result.equals("Suspected old inferior myocardial infarction")){
    		return "3623";
    	}else if(result.equals("Suspected subacute inferior myocardial infarction")){
    		return "3622";
    	}else if(result.equals("Suspected acute inferior myocardial infarction")){
    		return "3621";
    	}else if(result.equals("Old inferior myocardial infarction")){
    		return "3633";
    	}else if(result.equals("Sub acute inferior myocardial infarction")){
    		return "3632";
    	}else if(result.equals("Acute inferior myocardial infarction")){
    		return "3631";
    	}else if(result.equals("Old inferior wall and posterior wall myocardial infarction")){
    		return "36132";
    	}else if(result.equals("Subacute inferior wall and posterior wall myocardial infarction")){
    		return "36122";
    	}else if(result.equals("Acute inferior wall and posterior wall myocardial infarction")){
    		return "36112";
    	}else if(result.equals("Suspected old inferior wall and posterior wall myocardial infarction")){
    		return "36232";
    	}else if(result.equals("Suspected subacute inferior wall and posterior wall myocardial infarction")){
    		return "36222";
    	}else if(result.equals("Suspected acute inferior wall and posterior wall myocardial infarction")){
    		return "36212";
    	}else if(result.equals("Old inferior wall and posterior wall myocardial infarction")){
    		return "36332";
    	}else if(result.equals("Subacute inferior wall and posterior wall myocardial infarction")){
    		return "36322";
    	}else if(result.equals("Acute inferior wall and posterior wall myocardial infarction")){
    		return "36312";
    	}else if(result.equals("V3/V4abnormalQwave（The possibility of myocardial infarction to be discharged）")){
    		return "31131";
    	}else if(result.equals("V1/V2abnormalQwave（The possibility of myocardial infarction to be discharged）")){
    		return "34131";
    	}else if(result.equals("I/AVL/V5/V6abnormalQwave（The possibility of myocardial infarction to be discharged）")){
    		return "35131";
    	}else if(result.equals("II/AVFabnormalQwave（The possibility of myocardial infarction to be discharged）")){
    		return "36131";
    	}else if(result.equals("STSegment elevation")){
    		return "4038";
    	}else if(result.equals("Acute pericarditis")){
    		return "40304";
    	}else if(result.equals("Suspected anterior myocardial ischemia")){
    		return "4164";
    	}else if(result.equals("Anterior wall myocardial ischemia")){
    		return "4165";
    	}else if(result.equals("Suspected side wall myocardial ischemia")){
    		return "4564";
    	}else if(result.equals("Side wall myocardial ischemia")){
    		return "4565";
    	}else if(result.equals("Suspected inferior myocardial ischemia")){
    		return "4664";
    	}else if(result.equals("Inferior wall myocardial ischemia")){
    		return "4665";
    	}else if(result.equals("Suspected anterior wall myocardial injury")){
    		return "4136";
    	}else if(result.equals("Anterior wall myocardial injury")){
    		return "4137";
    	}else if(result.equals("Suspected lateral wall myocardial injury")){
    		return "4536";
    	}else if(result.equals("Lateral wall myocardial injury")){
    		return "4537";
    	}else if(result.equals("Suspected inferior myocardial injury")){
    		return "4636";
    	}else if(result.equals("Inferior wall myocardial damage")){
    		return "4637";
    	}else if(result.equals("STLower segment，May be the role of the")){
    		return "40106";
    	}else if(result.equals("MildSTDuan low")){
    		return "4011";
    	}else if(result.equals("MildSTDuan low，May be the role of the")){
    		return "40116";
    	}else if(result.equals("ModerateSTDuan low")){
    		return "4012";
    	}else if(result.equals("ModerateSTDuan low，May be the role of the")){
    		return "40126";
    	}else if(result.equals("SignificantSTDuan low，Myocardial injury may be")){
    		return "4016";
    	}else if(result.equals("SignificantSTDuan low，May be the effect of myocardial injury or the role of the")){
    		return "40166";
    	}else if(result.equals("SignificantSTDuan low，Myocardial injury")){
    		return "4017";
    	}else if(result.equals("STparagraphJPoint type reduction，May be normal")){
    		return "4021";
    	}else if(result.equals("STparagraphJPoint type reduction")){
    		return "4023";
    	}else if(result.equals("STSegment elevation，As of early repolarization syndrome")){
    		return "40302";
    	}else if(result.equals("early repolarization syndrome")){
    		return "40303";
    	}else if(result.equals("TWave height，For hyperkalemia")){
    		return "4050";
    	}else if(result.equals("TWave anomaly")){
    		return "4068";
    	}else if(result.equals("Nonspecific.TWave anomaly，May be the role of the")){
    		return "40686";
    	}else if(result.equals("Suspected myocardial injury")){
    		return "4436";
    	}else if(result.equals("Anteroseptal myocardial injury")){
    		return "4437";
    	}else if(result.equals("Suspected right atrial hypertrophy")){
    		return "6120";
    	}else if(result.equals("Right atrial hypertrophy")){
    		return "6130";
    	}else if(result.equals("Suspected left atrial hypertrophy")){
    		return "6220";
    	}else if(result.equals("Left atrial hypertrophy")){
    		return "6230";
    	}else if(result.equals("Mild right deviation of electric axis")){
    		return "7102";
    	}else if(result.equals("Electric axis right deviation")){
    		return "7100";
    	}else if(result.equals("Mild left deviation of electric axis")){
    		return "7202";
    	}else if(result.equals("Electric axis left deviation")){
    		return "7200";
    	}else if(result.equals("Severe right deviation of electric axis")){
    		return "7300";
    	}else if(result.equals("S1-S2-S3syndrome")){
    		return "7400";
    	}else if(result.equals("QRS-TIncluded angle anomaly")){
    		return "7500";
    	}else if(result.equals("Suspected chronic pulmonary heart disease")){
    		return "8003";
    	}else if(result.equals("low voltage")){
    		return "8100";
    	}else if(result.equals("Limb lead low voltage")){
    		return "8101";
    	}else if(result.equals("Chest lead low voltage")){
    		return "8102";
    	}else if(result.equals("Right heart")){
    		return "8200";
    	}else if(result.equals("QTcProlongation of interval")){
    		return "8304";
    	}else if(result.equals("QTcShortened interval")){
    		return "8305";
    	}else if(result.equals("Left and right upper limb electrodes")){
    		return "101";
    	}else if(result.equals("ST-Tabnormal")){
    		return "4048";
    	}else if(result.equals("DDDpacing electrocardiogram")){
    		return "16008";
    	}else if(result.equals("pacing electrocardiogram")){
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