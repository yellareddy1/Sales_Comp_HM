package com.hierarchymanager.commonLib;



import java.io.*;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;




public class ExcelLib {
	
	
	//String excelPath = new File("/HMAppAutomation/TestData/DataSheet.xlsx").getAbsolutePath();
	String excelPath = "C:\\Users\\aa99840\\workspace2\\HMAppAutomation\\TestData\\DataSheet.xlsx";
	public String getExcelData(String sheetName , int rowNum , int colNum ) throws InvalidFormatException, IOException
	{
		
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);		
		Sheet sh  = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(colNum).getStringCellValue();
		return data;
	}
	
	public double getExcelNumericData(String sheetName , int rowNum , int colNum  ) throws InvalidFormatException, IOException
	{
		
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);		
		Sheet sh  = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		double value = row.getCell(colNum).getNumericCellValue();
		return value;
	}
	

		public void setExcelData(String sheetName, int rowNum, int colNum,String data ) throws InvalidFormatException, IOException
		{
				FileInputStream fis = new FileInputStream(excelPath);
				Workbook wb = WorkbookFactory.create(fis);
				Sheet sh = wb.getSheet(sheetName);
				Row row = sh.getRow(rowNum);
				Cell cel = row.createCell(colNum);
				cel.setCellType(Cell.CELL_TYPE_STRING);	
				cel.setCellValue(data);
				FileOutputStream fos = new FileOutputStream(excelPath);
				wb.write(fos);
				
		
		}

	
	
} 
			
			
	

