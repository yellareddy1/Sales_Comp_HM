package com.citsapplication.testLib;

import java.awt.AWTException;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.citsapplication.businessLib.CITSSalesComp;
import com.citsapplication.commonLib.ExcelLib;


public class IssuePreviewPage 
{
	
	CITSSalesComp citsObj = new CITSSalesComp();
	ExcelLib eLib = new ExcelLib();
	
	
  @BeforeMethod
  public void LoginToApp() throws InvalidFormatException, IOException, AWTException, InterruptedException, ClassNotFoundException, SQLException 
	{
		  		String Apppath = eLib.getExcelData("Sheet1", 1, 0);
				String cUid = eLib.getExcelData("Sheet1", 1, 1);
				String psw = eLib.getExcelData("Sheet1", 1, 2);
				citsObj.driverInit(Apppath);
				citsObj.logInCits(cUid, psw);
				System.out.println("Login Successful");
	}
		  	
  
  @Test
  public void navigationToIssuePreviewPage() throws InvalidFormatException, IOException
  {
		 String expectedIssueText = eLib.getExcelData("Sheet1", 1, 4);
		 System.out.println(expectedIssueText);
		 citsObj.selectedIssuePreviewPage();
		 citsObj.verifyissuePreviewPage(expectedIssueText);
		 System.out.println("Successfully navigated to Issue Preview Page");
  }
  
  @AfterMethod
  public void logOut()
  {
	    citsObj.PreviewPageLogout();
		  System.out.println("Logout Successfully"); 
	 
  }

}
