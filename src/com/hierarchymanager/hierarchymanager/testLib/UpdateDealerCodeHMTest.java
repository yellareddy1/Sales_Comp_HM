package com.hierarchymanager.testLib;

import java.awt.AWTException;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Test;
import org.testng.annotations.BeforeMethod;

import com.hierarchymanager.businessLib.HMSalesComp;
import com.hierarchymanager.commonLib.ExcelLib;

public class UpdateDealerCodeHMTest {
	
	HMSalesComp hmObj = new HMSalesComp();
	ExcelLib eLib = new ExcelLib();


	@BeforeMethod
	public void LoginToApp() throws InvalidFormatException, IOException, AWTException, InterruptedException, ClassNotFoundException, SQLException 
	{
		  try {
		
	
		  		String Apppath = eLib.getExcelData("Sheet1", 1, 0);
		  		System.out.println(Apppath);
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
	public void verifyUpdatingDealerCode() throws InvalidFormatException, IOException 
	{
		  String salesId = eLib.getExcelData("Sheet1", 1, 4);
		  double cd = eLib.getExcelNumericData("Sheet1", 1, 5);
		  hmObj.navigateTo1000HierSearchPage();
		  hmObj.navigateToExternalAgentInfoPage(salesId);
		  hmObj.updateDealerCode((int)cd);
		  
	}
 
}