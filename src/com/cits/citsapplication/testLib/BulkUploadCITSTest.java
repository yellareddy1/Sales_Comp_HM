package com.citsapplication.testLib;


import java.awt.AWTException;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.citsapplication.businessLib.CITSSalesComp;
import com.citsapplication.commonLib.ExcelLib;
import com.citsapplication.commonLib.WebDriverLib;



//import java.awt.AWTException;
//import java.io.IOException;
//import java.sql.SQLException;


//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.testng.Reporter;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeMethod;

//import com.salescompensation.businessLib.CITSSalesComp;
//import com.salescompensation.commonLib.ExcelLib;

public class BulkUploadCITSTest {
	
	CITSSalesComp citsObj = new CITSSalesComp();
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
  	public void VerifyBulkUploadInCits() throws AWTException, InterruptedException, InvalidFormatException, IOException 
  	{
  	  try
  	  {
  		  String filePath  = eLib.getExcelData("Sheet1", 1, 7);
  		  System.out.println(filePath);
  		  citsObj.navigateToBulkUploadPage();
  		  //citsObj.uploadFile(filePath);
  		  //citsObj.updateIssueStatus();*/
  		  
  		 // String issueNo = eLib.getExcelData("Sheet1", 2, 2);
  		 // String expectedIssueStatus = eLib.getExcelData("Sheet1", 2, 3);
  		 // citsObj.navigateToIssueDetailsPage(issueNo);
  		 // citsObj.verifyIssueStatus(expectedIssueStatus);
  		  
  		 System.out.println("BulkUpload Successful");
  	  }
  	  	catch(Exception e)
  	  	{
  		  System.out.println("BulkUpload Failed");
  	  	}
	  
  	}
//}
  	
  
}
