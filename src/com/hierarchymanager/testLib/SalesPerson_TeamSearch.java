package com.hierarchymanager.testLib;

import java.awt.AWTException;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hierarchymanager.businessLib.HMSalesComp;
import com.hierarchymanager.commonLib.ExcelLib;


public class SalesPerson_TeamSearch
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
	
	@Test
	public void searchPage()
	{
		try
		{
			String TeamID = eLib.getExcelData("Sheet1", 1, 3);
			hmObj.navigateTo2075HierSearchPage();
			hmObj.teamSearch();
			hmObj.activeTeamSearch();
			hmObj.teamIDSearch(TeamID);
		}
		catch(Exception e)
		{
			System.out.println("Navigate to search page failed");
		}
		
	}
	
 }
