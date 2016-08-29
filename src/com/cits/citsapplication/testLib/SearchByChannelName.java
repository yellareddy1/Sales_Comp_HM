package com.citsapplication.testLib;

import java.awt.AWTException;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.citsapplication.businessLib.CITSSalesComp;
import com.citsapplication.businessLib.CITSSearchPage;
import com.citsapplication.commonLib.ExcelLib;
import com.citsapplication.commonLib.WebDriverLib;

public class SearchByChannelName 
{
	
	CITSSalesComp citsObj = new CITSSalesComp();
	CITSSearchPage searchPageObj = new CITSSearchPage();
	ExcelLib eLib = new ExcelLib();
	WebDriverLib wLib = new WebDriverLib();
	
	@BeforeMethod
	public void LoginToApp() throws InvalidFormatException, IOException, AWTException, InterruptedException, ClassNotFoundException, SQLException 
	{
		  try 
		  	{
		  		String Apppath = eLib.getExcelData("Sheet1", 1, 0);
				String cUid = eLib.getExcelData("Sheet1", 1, 1);
				String psw = eLib.getExcelData("Sheet1", 1, 2);
				citsObj.driverInit(Apppath);
				citsObj.logInCits(cUid, psw);
				System.out.println("Login Successful");
		  	  }
		  catch(Exception E)
		  	{
			  System.out.println("Login Failed");
		  	}			
	} 
	
	
	
	

	@Test
	public void searchIssueByChannelName() throws InvalidFormatException, IOException, InterruptedException
	  {
		  try
		  {
			String expectedChannelName = eLib.getExcelData("Sheet1", 1, 11);
		//	System.out.println(expectedChannelName);
			searchPageObj.searchWithChannelName(expectedChannelName);
			System.out.println("Successfully navigated to Issue Page");
				
		  }
		  catch(Exception e)
		  {
			  System.out.println("Navigation failed to Issue Page"); 
		  }
	  }
	
	
	@AfterMethod
	  public void logOut()
	  {
		try
		  {
			  searchPageObj.logout();
			  System.out.println("Logout Successfully"); 
		  }
		  catch(Exception e)
		  {
			  System.out.println("Logout Failed"); 
		  }
	  }
}
