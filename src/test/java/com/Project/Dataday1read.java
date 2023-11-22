package com.Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;






public class Dataday1read {

	public static void main(String[] args) throws IOException
	{
	File f = new File("C:\\Users\\NEELU .S\\eclipse-workspace\\Neelu_Project\\Excel\\Book1.xlsx");
	FileInputStream fi = new FileInputStream(f);
	Workbook ws = new XSSFWorkbook(fi);
	Sheet s = ws.getSheetAt(0);
	Row r =s.getRow(1);
    Cell c = r.getCell(0);
    CellType ct = c.getCellType();
    if(ct.equals(ct.STRING)) {
    	
    	String s1 = c.getStringCellValue();
    	System.out.println(s1);
    	
    }
    else if (ct.equals(ct.NUMERIC))
    {
    	
    	double n =c.getNumericCellValue();
    	int v = (int)n;
    	System.out.println(n);
    	
    	
    }
  }

}
