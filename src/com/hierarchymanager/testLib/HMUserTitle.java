package com.hierarchymanager.testLib;

import java.io.IOException;
import java.util.IllegalFormatException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hierarchymanager.businessLib.HMSalesComp;
import com.hierarchymanager.commonLib.ExcelLib;

public class HMUserTitle {
	
	HMSalesComp hmObj = new HMSalesComp();
	ExcelLib eLib = new ExcelLib();
	
	@BeforeMethod
	public void login() throws IllegalFormatException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		 try {
				
				
		  		String Apppath = eLib.getExcelData("Sheet1", 1, 0);
				String cUid = eLib.getExcelData("Sheet1", 1, 1);
				String psw = eLib.getExcelData("Sheet1", 1, 2);
				hmObj.driverInit(Apppath);
				hmObj.logIn(cUid,psw);
				System.out.println("Login Successful");
		  	  }
		  catch(Exception E)
		  {
			  System.out.println("Login Failed");
		  }
	}
	
	@Test
	public void UserTitle()
	{
		try
		{
			hmObj.navigateTo2075HierSearchPage();
			hmObj.navigateTitlePage();
			System.out.println("Navigation to Title page success");
		}
		catch(Exception e)
		{
			System.out.println("Navigation to Title page Failed");
			
		}
	}

}
