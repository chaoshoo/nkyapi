package com.net.nky.garea.vo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

import com.garea.common.util.ecg.IExporter;
import com.garea.common.util.ecg.ImageExporter;

public class App {
	public static void main(String[] args) {
		byte[] data = null;
		try {
			FileInputStream fis = new FileInputStream("E://d.txt");
			data = new byte[fis.available()];
			fis.read(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (data != null) {
			testRawImage(new String(data));
			testImagePath(new String(data));
		} else {
			System.out.print("读取心电数据失败！");
		}
	}

	public static void testImagePath(String data) {
		/*
		 * dataTo passBase64Encoded data
		 * If the original data is taken，NonBase64Encoded data，Please replace the function
		 * 
		 * Please refer to the interface documentation to confirm whether the acquired ECG data isBase64Encoded data
		 */
		IExporter exporter = new ImageExporter();
		Map<String, String> imgs = exporter.export("test/export-test", data);
		for (Map.Entry<String, String> entry : imgs.entrySet()) {
			System.out.print("心电导联 [" + entry.getKey() + "] 存储在: " + entry.getValue());
		}
	}

	public static void testRawImage(String data) {
		/*
		 * dataTo passBase64Encoded data
		 * If the original data is taken，NonBase64Encoded data，Please replace the function
		 * 
		 * Please refer to the interface documentation to confirm whether the acquired ECG data isBase64Encoded data
		 */
		Map<String, byte[]> imgs = new ImageExporter().export(data);
		for (Map.Entry<String, byte[]> entry : imgs.entrySet()) {
			printLead(entry.getKey());
			/*
			 * Save data to file，To facilitate inspection
			 */
			savePicture("test/" + entry.getKey() + ".jpg", entry.getValue());
		}
	}

	/**
	 * This function is just an example，If you want to distinguish the lead，Need to be distinguished according to the appearance of this function
	 * @param id
	 */
	private static void printLead(String id) {
		if (IExporter.ECG_LEAD_I.equals(id)) {
			System.out.print("心电导联: " + id);
		} else if (IExporter.ECG_LEAD_II.equals(id)) {
			System.out.print("心电导联: " + id);
		} else if (IExporter.ECG_LEAD_III.equals(id)) {
			System.out.print("心电导联: " + id);
		} else if (IExporter.ECG_LEAD_AVR.equals(id)) {
			System.out.print("心电导联: " + id);
		} else if (IExporter.ECG_LEAD_AVL.equals(id)) {
			System.out.print("心电导联: " + id);
		} else if (IExporter.ECG_LEAD_AVF.equals(id)) {
			System.out.print("心电导联: " + id);
		} else if (IExporter.ECG_LEAD_V1.equals(id)) {
			System.out.print("心电导联: " + id);
		} else if (IExporter.ECG_LEAD_V2.equals(id)) {
			System.out.print("心电导联: " + id);
		} else if (IExporter.ECG_LEAD_V3.equals(id)) {
			System.out.print("心电导联: " + id);
		} else if (IExporter.ECG_LEAD_V4.equals(id)) {
			System.out.print("心电导联: " + id);
		} else if (IExporter.ECG_LEAD_V5.equals(id)) {
			System.out.print("心电导联: " + id);
		} else if (IExporter.ECG_LEAD_V6.equals(id)) {
			System.out.print("心电导联: " + id);
		} 
	}

	private static void savePicture(String lead, byte[] data) {
		try {
			FileOutputStream fos = new FileOutputStream(lead);
			fos.write(data);
			fos.flush();
			fos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}