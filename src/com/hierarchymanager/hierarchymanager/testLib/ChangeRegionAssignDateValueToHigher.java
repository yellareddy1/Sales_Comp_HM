package com.hierarchymanager.testLib;

import java.awt.AWTException;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hierarchymanager.businessLib.HMSalesComp;
import com.hierarchymanager.commonLib.ExcelLib;

public class ChangeRegionAssignDateValueToHigher {
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
	
	 @Test
	public void verifyUpdatingExternalAgentRegionAssignDatetoHigherValue() throws InvalidFormatException, IOException, InterruptedException 
	{
		 try
		 {
			String salesId = eLib.getExcelData("Sheet1", 1, 6);
			//System.out.println(salesId);
			hmObj.navigateTo1000HierSearchPage();
			hmObj.navigateToExternalAgentInfoPage(salesId);
			hmObj.updateExternalAgentToHigherValue();
			System.out.println("Region Assign Date to higher value is added successfully");
		 }
		 catch(Exception e)
		 {
			 System.out.println("Adding Region Assign Date to higher value is Failed");
		 }
		  
	}
}
