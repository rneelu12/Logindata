package com.Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dataday2 {

	public static void main(String[] args) throws Exception {
		
		File f = new File("C:\\\\Users\\\\NEELU .S\\\\OneDrive\\\\Documents\\mybook2.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		w.createSheet("log").createRow(0).createCell(0).setCellValue("process");
		w.getSheet("log").getRow(0).createCell(1).setCellValue("Testcase");
		w.getSheet("log").getRow(0).createCell(2).setCellValue("no");
		w.getSheet("log").getRow(0).createCell(3).setCellValue("step");
		w.getSheet("log").getRow(0).createCell(4).setCellValue("description");
		w.getSheet("log").getRow(0).createCell(5).setCellValue("status");
		FileOutputStream o = new FileOutputStream(f);
		w.write(o);
		w.close();
		System.out.println("done");
	}

}
