package com.citsapplication.businessLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Reporter;

import com.citsapplication.commonLib.Driver;
import com.citsapplication.commonLib.ExcelLib;
import com.citsapplication.commonLib.WebDriverLib;
import com.citsapplication.pageLibCITS.HomePageCits;
import com.citsapplication.pageLibCITS.ITSSummaryPage;
import com.citsapplication.pageLibCITS.IssuePreviewPage;
import com.citsapplication.pageLibCITS.LoginPageCits;
import com.citsapplication.pageLibCITS.SearchPage;
import com.citsapplication.pageLibCITS.SelectedIssuesPage;
import com.citsapplication.pageLibCITS.UpdateStatusIdPage;

public class CITSSearchPage 
{
	WebDriver driver = Driver.configureDriver();
	//WebDriver driver = Driver.fireFoxDriver();
	WebDriverLib wLib = new WebDriverLib();
	ExcelLib eLib = new ExcelLib();

	
	
	
	
	
	LoginPageCits loginPageCits = PageFactory.initElements(driver, LoginPageCits.class);
	HomePageCits homePageCits = PageFactory.initElements(driver, HomePageCits.class);
	IssuePreviewPage previewPage = PageFactory.initElements(driver, IssuePreviewPage.class);
	UpdateStatusIdPage statusIdPage = PageFactory.initElements(driver, UpdateStatusIdPage.class);
	SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
	SelectedIssuesPage selectedissuePage = PageFactory.initElements(driver, SelectedIssuesPage.class);
	//IssueDetailsPage issueDetailPage = PageFactory.initElements(driver, IssueDetailsPage.class);
	ITSSummaryPage itsSummaryPage = PageFactory.initElements(driver, ITSSummaryPage.class);
	
	
	public void searchWithIssueNumber(int expectedIssueNo) throws InterruptedException
	  {
		  WebElement topFrame1 = homePageCits.getTopFrame();
		  driver.switchTo().frame(topFrame1);
		  homePageCits.getSearchLink().click();
		  WebElement searchPageBaseFrames = searchPage.getBaseFrame();
		  driver.switchTo().frame(searchPageBaseFrames);
		  String expectedIssueNumber = String.valueOf(expectedIssueNo);
		  searchPage.getIssueNoEdt().sendKeys(expectedIssueNumber);
		  searchPage.getSearchButton().click();
		  Thread.sleep(10000);
		  WebElement issuePageBaseFrame = selectedissuePage.getBaseFrame();
		  driver.switchTo().frame(issuePageBaseFrame);
		  String actualIssueNo = selectedissuePage.getIssueToSearch().getText();
		  boolean flag =  wLib.verifyText(expectedIssueNumber, actualIssueNo);
		  if(flag)
		  {
			  System.out.println("IssueNo: " + actualIssueNo + " :: IssueNo Successfully verified ");
		  }
		  else 
		  {
			System.out.println("IssueNo: " +  actualIssueNo + " :: IssueNo Verification Failed");
		  }
	  }
	  
	  
	 public void logout()
	  {
		  driver.switchTo().defaultContent();
		  WebElement topFrame = homePageCits.getTopIFrame();
		  driver.switchTo().frame(topFrame);
		  homePageCits.getLogOutBtn().click();
		
		  
	  }
	  
	  public void searchWithIssueStatus(String expectedStatus) throws InterruptedException
	  {
		  wLib.waitForPageToLoad();
		  WebElement topFrame1 = homePageCits.getTopFrame();
		  driver.switchTo().frame(topFrame1);
		  homePageCits.getSearchLink().click();
		  WebElement searchPageBaseFrames = searchPage.getBaseFrame();
		  driver.switchTo().frame(searchPageBaseFrames);
		  WebElement statusSelectBox =  searchPage.getIssueStatus();
		  Select sel = new Select(statusSelectBox);
		  sel.selectByValue("2");
		  searchPage.getSearchButton().click();
		  Thread.sleep(10000);
		  WebElement issuePageBaseFrame = selectedissuePage.getBaseFrame();
		  driver.switchTo().frame(issuePageBaseFrame);
		//  System.out.println("frame navigation");
		  String actualStatus = selectedissuePage.getIssueStatus().getText();
		 // System.out.println(actualStatus);
		  boolean flag =  wLib.verifyText(expectedStatus, actualStatus);
		  if(flag)
		  {
			  System.out.println("Status: " + actualStatus + " :: Status Successfully verified ");
		  }
		  else 
		  {
			System.out.println("Status: " +  actualStatus + " :: Status Verification Failed");
		  }
	  }
	  

	  
	  
	  public void searchWithSalesID(String expectedID) throws InterruptedException
	  {
		  WebElement topFrame1 = homePageCits.getTopFrame();
		  driver.switchTo().frame(topFrame1);
		  homePageCits.getSearchLink().click();
		  WebElement searchPageBaseFrames = searchPage.getBaseFrame();
		  driver.switchTo().frame(searchPageBaseFrames);
		  searchPage.getSalesIdEdt().sendKeys(expectedID);
		  searchPage.getSearchButton().click();
		  Thread.sleep(10000);
		  WebElement issuePageBaseFrame = selectedissuePage.getBaseFrame();
		  driver.switchTo().frame(issuePageBaseFrame);
		  String actualID = selectedissuePage.getSalesId().getText();
		  boolean flag =  wLib.verifyText(expectedID, actualID);
		  if(flag)
		  {
			 System.out.println("SalesId: " + actualID + " :: SalesId Successfully verified ");
		  }
		  else 
		  {
			  System.out.println("SalesId: " +  actualID + " :: SalesId Verification Failed");
		  }
	  }
	  
	  
	  
	  public void searchWithCuid(String expectedCuid, String expectedPage) throws InterruptedException
	  {
		  WebElement topFrame1 = homePageCits.getTopFrame();
		  driver.switchTo().frame(topFrame1);
		  homePageCits.getSearchLink().click();
		  WebElement searchPageBaseFrames = searchPage.getBaseFrame();
		  driver.switchTo().frame(searchPageBaseFrames);
		  searchPage.getcUidEdt().sendKeys(expectedCuid);
		  searchPage.getSearchButton().click();
		  Thread.sleep(10000);
		  WebElement issuePageTopFrame2 = selectedissuePage.getTopFrame();
		  driver.switchTo().frame(issuePageTopFrame2);	  
		  String actualPageText = selectedissuePage.getSelectedIssueText().getText();
		 // System.out.println(actualPageText);
		  boolean flag =  wLib.verifyText(expectedPage, actualPageText);
		  if(flag)
		  {
			  System.out.println( actualPageText + " :: Successfully verified ");
		  }
		  else 
		  {
			System.out.println( actualPageText + " :: Verification Failed");
		  }  
	 
	  }
	  

	  
	  
	  public void searchWithIssueType(String expectedType) throws InterruptedException
	  {
		  WebElement topFrame1 = homePageCits.getTopFrame();
		  driver.switchTo().frame(topFrame1);
		  homePageCits.getSearchLink().click();
		  WebElement searchPageBaseFrames = searchPage.getBaseFrame();
		  driver.switchTo().frame(searchPageBaseFrames);
		  WebElement statusSelectBox =  searchPage.getIssueType();
		  Select sel = new Select(statusSelectBox);
		  sel.selectByValue("7");
		  searchPage.getSearchButton().click();
		  Thread.sleep(10000);
		  WebElement issuePageBaseFrame = selectedissuePage.getBaseFrame();
		  driver.switchTo().frame(issuePageBaseFrame);
		  String actualType = selectedissuePage.getIssueType().getText();
		//  System.out.println(actualType);
		  boolean flag =  wLib.verifyText(expectedType, actualType);
		  if(flag)
		  {
			  System.out.println("Status: " + actualType + " :: Status Successfully verified ");
		  }
		  else 
		  {
			System.out.println("Status: " +  actualType + " :: Status Verification Failed");
		  }
	  }
	  
	  
	  
	  
	  
	  
	  public void searchWithChannelName(String expectedChannelName) throws InterruptedException
	  {
		  WebElement topFrame1 = homePageCits.getTopFrame();
		  driver.switchTo().frame(topFrame1);
		  homePageCits.getSearchLink().click();
		  WebElement searchPageBaseFrames = searchPage.getBaseFrame();
		  driver.switchTo().frame(searchPageBaseFrames);
		  WebElement statusSelectBox =  searchPage.getChannelName();
		  Select sel = new Select(statusSelectBox);
		  sel.selectByValue("50073");
		  Thread.sleep(3000);
		  searchPage.getSearchButton().click();
		  Thread.sleep(10000);
		  WebElement issuePageBaseFrame = selectedissuePage.getBaseFrame();
		  driver.switchTo().frame(issuePageBaseFrame);
		//  System.out.println("frame navigation");
		  String actualChannelName = selectedissuePage.getChannelNameText().getText();
		//  System.out.println(actualChannelName);
		  boolean flag =  wLib.verifyText(expectedChannelName, actualChannelName);
		  if(flag)
		  {
			  System.out.println("Status: " + actualChannelName + " :: Status Successfully verified ");
		  }
		  else 
		  {
			System.out.println("Status: " +  actualChannelName + " :: Status Verification Failed");
		  }
	  }
	  
	
	  
	  
	  
	  public void searchWithRevenueYearAndCloseOutValue(String expectedYECloseValue) throws InterruptedException
	  {
		  Select sel ;
		  WebElement topFrame1 = homePageCits.getTopFrame();
		  driver.switchTo().frame(topFrame1);
		  homePageCits.getSearchLink().click();
		  WebElement searchPageBaseFrames = searchPage.getBaseFrame();
		  driver.switchTo().frame(searchPageBaseFrames);
		  WebElement effDateSelectBox =  searchPage.getRevenueYear();
		  sel = new Select(effDateSelectBox);
		  sel.selectByValue("2015");
		  WebElement yearEdnIndSelectBox =  searchPage.getClosuOutValue();
		  sel = new Select(yearEdnIndSelectBox);
		  sel.selectByValue("Y");
		  Thread.sleep(3000);
		  searchPage.getSearchButton().click();
		  Thread.sleep(10000);
		  WebElement issuePageBaseFrame = selectedissuePage.getBaseFrame();
		  driver.switchTo().frame(issuePageBaseFrame);
		//  System.out.println("frame navigation");
		  String actualYECloseValue = selectedissuePage.getYearEndCloseOutText().getText();
		 // System.out.println(actualYECloseValue);
		  boolean flag =  wLib.verifyText(expectedYECloseValue, actualYECloseValue);
		  if(flag)
		  {
			  System.out.println("Status: " + actualYECloseValue + " :: Status Successfully verified ");
		  }
		  else 
		  {
			System.out.println("Status: " +  actualYECloseValue + " :: Status Verification Failed");
		  }
	  }
}
