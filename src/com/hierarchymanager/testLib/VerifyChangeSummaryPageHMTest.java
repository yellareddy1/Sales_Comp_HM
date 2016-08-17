package com.hierarchymanager.testLib;

import java.awt.AWTException;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hierarchymanager.businessLib.HMSalesComp;
import com.hierarchymanager.commonLib.ExcelLib;

public class VerifyChangeSummaryPageHMTest
{
	
	HMSalesComp hmObj = new HMSalesComp();
	ExcelLib eLib = new ExcelLib();
	

	 @BeforeMethod
	  public void LoginToApp() throws InvalidFormatException, IOException, AWTException, InterruptedException, ClassNotFoundException, SQLException 
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
	  
/*	 @Test
	  public void verifyChangeSummeryDetailPage() throws AWTException, InterruptedException, InvalidFormatException, IOException
	 
	  {
		  try 
		  {
			  boolean flag = true;
			  String expectedText = eLib.getExcelData("Sheet1", 1, 3);
			  hmObj.navigateTo1000HierSearchPage();
			  hmObj.navigateTochangeSummary();
			  hmObj.verifyPageTitle(expectedText);
			  if(flag)
			  {
				  Reporter.log("Page is Verified");
			  }
		  }
		  catch(Exception e)
		  {
			  Reporter.log("Error Page");
		  }
		  	  
	  }*/
	  
} 
		
 /* @Test
  public void addRelationshipForInternalAgent() throws InvalidFormatException, IOException
  {
	  String salesId = eLib.getExcelData("Sheet1", 1, 6);
	  hmObj.navigateTo1082HierSearchPage();
	  hmObj.navigateToInternalAgentInfoPage(salesId);
  }*/
  

		
			
  
  //}

