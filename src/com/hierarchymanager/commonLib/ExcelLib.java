package com.hierarchymanager.commonLib;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.IllegalFormatException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelLib {
	
	
	String excelPath = "C:\\Ramya\\Project\\WorkSpace\\HierarchyManager\\Test Data\\DataSheet.xlsx";
	public String getExcelData(String sheetName , int rowNum , int colNum ) throws IllegalFormatException, IOException, EncryptedDocumentException, InvalidFormatException
	{
		
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);		
		Sheet sh  = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(colNum).getStringCellValue();
		return data;
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
			
			
	

