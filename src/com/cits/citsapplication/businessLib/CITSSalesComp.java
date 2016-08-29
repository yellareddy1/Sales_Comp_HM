package com.citsapplication.businessLib;




import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;




import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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



public class CITSSalesComp {
	
	
	
	
	WebDriver driver = Driver.configureDriver();
	//WebDriver driver = Driver.fireFoxDriver();
	WebDriverLib wLib = new WebDriverLib();
	ExcelLib eLib = new ExcelLib();

	
	
	
	
	
	LoginPageCits loginPageCits = PageFactory.initElements(driver, LoginPageCits.class);
	HomePageCits homePageCits = PageFactory.initElements(driver, HomePageCits.class);
	IssuePreviewPage previewPage = PageFactory.initElements(driver, IssuePreviewPage.class);
	UpdateStatusIdPage statusIdPage = PageFactory.initElements(driver, UpdateStatusIdPage.class);
	SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
	SelectedIssuesPage issuePage = PageFactory.initElements(driver, SelectedIssuesPage.class);
	//IssueDetailsPage issueDetailPage = PageFactory.initElements(driver, IssueDetailsPage.class);
	ITSSummaryPage itsSummaryPage = PageFactory.initElements(driver, ITSSummaryPage.class);
	
	
	
	
	
	
	public void driverInit(String path)
	  {
		  driver.get(path);
		  wLib.waitForPageToLoad();
		  
	  }
	
	
	
	
	  
	  public void logInCits(String cUid, String psw)
	  {
		 loginPageCits.getUserNameEdt().sendKeys(cUid);
		 loginPageCits.getPswEdt().sendKeys(psw);
		 loginPageCits.getSubmitBtn().click();
		 //wLib.waitForPageToLoad();
			  			 
	  }
	  
	  
	  public void allLink(String expectedText) throws InterruptedException
	  {  
		  wLib.waitForPageToLoad();
		  WebElement baseFrame =  homePageCits.getBaseFrame();
		  driver.switchTo().frame(baseFrame);
		  homePageCits.getAllLink().click();
		  System.out.println("successfully navigated to issue page");
		  WebElement topFrame = issuePage.getTopFrame();
		  driver.switchTo().frame(topFrame);
		  issuePage.getLinkFirst().click();
		  driver.switchTo().defaultContent();
		  WebElement issuePageTopFrame2 = issuePage.getTopFrame();
		  driver.switchTo().frame(issuePageTopFrame2);	  
		  String actualText = issuePage.getSelectedIssueText().getText();
		  System.out.println(actualText);
		  boolean flag =  wLib.verifyText(expectedText, actualText);
		  if(flag)
		  {
			  System.out.println("Issue Text: " + expectedText + " :: Successfully verified ");
		  }
		  else 
		  {
			System.out.println("Isssue Text: " +  expectedText + " :: Verification Failed");
		  }  
	  }
	  
	  
	  
	  
	  
	  public void contactITSLink() throws AWTException, InterruptedException
	  {
		WebElement topFrame = homePageCits.getTopFrame();
		driver.switchTo().frame(topFrame);
		homePageCits.getContactITSLink().click();
	
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_LEFT);
		robot.keyRelease(KeyEvent.VK_LEFT);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
	  }
	  
	  
	  
	   
	  public void logout()
	  {
		  driver.switchTo().defaultContent();
		  WebElement topFrame = homePageCits.getTopFrame();
		  driver.switchTo().frame(topFrame);
		  homePageCits.getLogOutBtn().click();	  
	  }
	  
	  
	  public void PreviewPageLogout()
	  {
		  driver.switchTo().defaultContent();
		  homePageCits.getLogOutBtn().click();	  
	  }
	  
	  
	  
	  
	  
	 public void selectedIssuesPageFirstLink(String expectedText) throws InterruptedException
	  {  
		  wLib.waitForPageToLoad();
		  WebElement topFrame1 = homePageCits.getTopFrame();
		  driver.switchTo().frame(topFrame1);
		  WebElement selectedIssueLink = homePageCits.getSelectedIssueLinkText();
		  selectedIssueLink.click(); 
		  WebElement topFrame = issuePage.getTopFrame();
		  driver.switchTo().frame(topFrame);
		  issuePage.getLinkFirst().click();
		  System.out.println("successfully navigated to First link page");
		  driver.switchTo().defaultContent();
		  WebElement issuePageTopFrame2 = issuePage.getTopFrame();
		  driver.switchTo().frame(issuePageTopFrame2);	  
		  String actualText = issuePage.getSelectedIssueText().getText();
		//  System.out.println(actualText);
		  boolean flag =  wLib.verifyText(expectedText, actualText);
		  if(flag)
		  {
			  System.out.println("Issue Text: " + expectedText + " :: Successfully verified ");
		  }
		  else 
		  {
			System.out.println("Isssue Text: " +  expectedText + " :: Verification Failed");
		  }  
	  }
	 
	 
	 public void selectedIssuesPageLastLink(String expectedText) throws InterruptedException
	  {  
		  wLib.waitForPageToLoad();
		  WebElement topFrame1 = homePageCits.getTopFrame();
		  driver.switchTo().frame(topFrame1);
		  WebElement selectedIssueLink = homePageCits.getSelectedIssueLinkText();
		  selectedIssueLink.click(); 
		  WebElement topFrame = issuePage.getTopFrame();
		  driver.switchTo().frame(topFrame);
		  issuePage.getLinkLast().click();
		  System.out.println("successfully navigated to Last link page");
		  driver.switchTo().defaultContent();
		  WebElement issuePageTopFrame2 = issuePage.getTopFrame();
		  driver.switchTo().frame(issuePageTopFrame2);	  
		  String actualText = issuePage.getSelectedIssueText().getText();
		 // System.out.println(actualText);
		  boolean flag =  wLib.verifyText(expectedText, actualText);
		  if(flag)
		  {
			  System.out.println("Issue Text: " + expectedText + " :: Successfully verified ");
		  }
		  else 
		  {
			System.out.println("Isssue Text: " +  expectedText + " :: Verification Failed");
		  }  
	  }
	 
	 
	 
	 
	 
	  
	  
	  public void selectedIssuePreviewPage()
	  {
		  
		  WebElement baseFrame =  homePageCits.getBaseFrame();
		  driver.switchTo().frame(baseFrame);
		  homePageCits.getNotSubmittedLink().click();
		  System.out.println("successfully navigated to issue page");
		  WebElement issuePageBaseFrame = issuePage.getBaseFrame();
		  driver.switchTo().frame(issuePageBaseFrame);
		  issuePage.getIssueLink().click();
		  wLib.waitForPageToLoad();
		  driver.switchTo().defaultContent();
	  }
	  
	  
	  
	  
	  public void verifyissuePreviewPage(String expectedIssueText)
	  {
		  String actualIssueText = previewPage.getIssueText().getText();
		  //System.out.println(actualIssueText);
		  boolean flag =  wLib.verifyText(expectedIssueText, actualIssueText);
		  if(flag)
		  {
			  System.out.println("Text: " + actualIssueText + " :: Successfully verified ");
		  }
		  else 
		  {
			System.out.println("Text: " +  actualIssueText + " :: Verification Failed");
		  }
		  
		  
	  }
	  
	  
	  
	  
	 public void previewPageSearchLink(String expectedText)
	 {  
		  //wLib.waitForPageToLoad();
		  previewPage.getSearchLink().click();
		  System.out.println("successfully navigated to search page");
		  WebElement searchPageBaseFrame = searchPage.getBaseFrame();
		  driver.switchTo().frame(searchPageBaseFrame);
		  String actualText = searchPage.getSearchText().getText();
		  //System.out.println(actualText);
		  boolean flag =  wLib.verifyText(expectedText, actualText);
		  if(flag)
		  {
			  System.out.println("Text: " + actualText + " :: Successfully verified ");
		  }
		  else 
		  {
			System.out.println("Text: " +  actualText + " :: Verification Failed");
		  }
	  }
	  
	  
	  
	  
	 
	 public void previewPageITSSummaryLink(String expectedText)
	 {  
		  previewPage.getItsSummaryLik().click();
		  System.out.println("successfully navigated to ITS Summary page");  
		  WebElement itssummaryPageBaseFrame = itsSummaryPage.getItsBaseFrame();
		  driver.switchTo().frame(itssummaryPageBaseFrame);
		  String actualText = itsSummaryPage.getItsSummaryText().getText();
		 // System.out.println(actualText);
		  boolean flag =  wLib.verifyText(expectedText, actualText);
		  if(flag)
		  {
			  System.out.println("Text: " + actualText + " :: Successfully verified ");
		  }
		  else 
		  {
			System.out.println("Text: " +  actualText + " :: Verification Failed");
		  }
	  }
	 
	  
	  
	  
	
	  
	  
	  public void changeITSStatus() throws InterruptedException
		 {  
			 WebElement dropdownField =  previewPage.getStatusDropdownField();
			 Select sel = new Select(dropdownField);
			 sel.selectByValue("2");
			// System.out.println("Dropdown value is selected");
			 Thread.sleep(3000);
			 previewPage.getSendMailCheckBox().click();
			 Thread.sleep(3000);
			 previewPage.getSaveBtn().click();
			 wLib.acceptAlert();	  
		  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	/*  public void searchPreviewPage()
	  {
		  WebElement topFrame = issuePage.getTopFrame();
		  driver.switchTo().frame(topFrame);
		  issuePage.getLinkFirst().click();
		  System.out.println("successfully navigated to First link page");
		  driver.switchTo().defaultContent();
		  WebElement baseFrame = issuePage.getBaseFrame();
		  driver.switchTo().frame(baseFrame);
		  wLib.waitForPageToLoad();
		  issuePage.getIssueLink().click();
		  wLib.waitForPageToLoad();
		  String searchText = previewPage.getSearchLink().getText();
		  System.out.println(searchText);
		//  String itsSummaryText = previewPage.getItsSummaryLink().getText();
		//  System.out.println(itsSummaryText);
			  
	  }*/
		  
	  public void navigateToBulkUploadPage() throws AWTException, InterruptedException
	  {
		  WebElement topFrame = homePageCits.getTopFrame();
		  driver.switchTo().frame(topFrame);
		  homePageCits.getBulkUploadLinkText().click();
		  wLib.waitForPageToLoad();
		  
	  }
	  
	  public void uploadFile(String filePath) throws InvalidFormatException, IOException, AWTException, InterruptedException
	  {
		  WebElement bottomFrame = statusIdPage.getBottomframe();
		  driver.switchTo().frame(bottomFrame);
		  statusIdPage.getBrowseButton().click();
		  wLib.specifyFilePathToUpload(filePath);
		  wLib.fileUpload();
		  driver.switchTo().defaultContent();
		  
		  
	  }
	  
	 /*public void updateIssueStatus() throws InvalidFormatException, IOException, InterruptedException 
	  {
	  	WebElement bottomFrame = statusIdPage.getBottomframe();
		driver.switchTo().frame(bottomFrame);
		WebElement dropdwnField = statusIdPage.getDropdownField();
		Select sel = new Select(dropdwnField);
		sel.selectByValue("10");
		System.out.println("Dropdown value is selected");
		Thread.sleep(3000);
		statusIdPage.getUpdateButton().click();
		wLib.acceptAlert();
		
	  }
	 
	 public void navigateToIssueDetailsPage(String issueNo) throws InterruptedException
	 {
		 WebElement topFrame = homePageCits.getTopFrame();
		  driver.switchTo().frame(topFrame);
		  searchPage.getSearchLinkText().click();
		  wLib.waitForPageToLoad();
		  System.out.println("Successfully navigated to search page");
		  WebElement baseFrame = searchPage.getBaseFrame();
		  driver.switchTo().frame(baseFrame);
		  searchPage.getIssueNoEdt().sendKeys(issueNo);
		  searchPage.getSearchButton().click();
		  System.out.println("Successfully navigated to isssue details page");
		  Thread.sleep(4000);
	 }
	 
	 public void verifyIssueStatus(String expectedIsuueStatus)
	 {
		try
		{
			WebElement baseIframe = issueDetailPage.getBaseIframe();
			 driver.switchTo().frame(baseIframe);
			 System.out.println("Successfully navigate to iFrame");
			 String actualIssueStatus = issueDetailPage.getStatusText().getText();
			 wLib.verifyText(expectedIsuueStatus, actualIssueStatus);
			 if(true)
			 {
				 System.out.println("Issue status updated successfully");
			 }		 
		}
		catch(Exception e)
		{
			System.out.println("Issue status updation failed");
		}
	 }*/
	 
}
	