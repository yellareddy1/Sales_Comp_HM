package com.citsapplication.commonLib;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelLib {
	
	
	String excelPath = "C:\\Users\\aa99840\\workspace\\CITSProject\\Data\\Data.xlsx";
	public String getExcelData(String sheetName , int rowNum , int colNum ) throws InvalidFormatException, IOException
	{
		
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);		
		Sheet sh  = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Cell cel = row.getCell(colNum);
		String data = cel.getStringCellValue();
		return data;
	}
	
	public double getExcelNumericData(String sheetName , int rowNum , int colNum  ) throws InvalidFormatException, IOException
	{
		
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);		
		Sheet sh  = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Cell cel = row.getCell(colNum);
		double value = cel.getNumericCellValue();
		return value;
	}
	

		public void setExcelData(String sheetName, int rowNum, int colNum, String data ) throws InvalidFormatException, IOException
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
			
			
	

