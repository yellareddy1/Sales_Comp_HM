package com.citsapplication.testLib;

import java.awt.AWTException;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.citsapplication.businessLib.CITSSalesComp;
import com.citsapplication.businessLib.CITSSearchPage;
import com.citsapplication.commonLib.ExcelLib;
import com.citsapplication.commonLib.WebDriverLib;



public class SearchByCuid
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
  public void searchIssueByCuid() throws AWTException, InvalidFormatException, IOException, InterruptedException
  {
	  try
	  {
		String expectedCuid = eLib.getExcelData("Sheet1", 1, 14);
		String expectedPage = eLib.getExcelData("Sheet1", 1, 3);
		System.out.println(expectedCuid);
		System.out.println(expectedPage);
		searchPageObj.searchWithCuid(expectedCuid, expectedPage);
		System.out.println("Successfully navigated to Issue Page");		
	}
	  catch(Exception e)
	  {
		  System.out.println("Navigation failed to Issue Page"); 
	  }
  }

  
  /*@AfterMethod
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
  }*/
  
}
