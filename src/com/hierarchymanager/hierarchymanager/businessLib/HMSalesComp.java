package com.hierarchymanager.businessLib;



import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Reporter;


import org.openqa.selenium.support.ui.Select;






//import com.hierarchymanager.commonLib.DBConnection;
import com.hierarchymanager.commonLib.Driver;
import com.hierarchymanager.commonLib.ExcelLib;
import com.hierarchymanager.commonLib.WebDriverLib;
import com.hierarchymanager.pageLib.AgentInfoPage;
//import com.hierarchymanager.pageLib.AgentInfoPage;
import com.hierarchymanager.pageLib.ChangeSummaryDetailPage;
import com.hierarchymanager.pageLib.ChangeSummaryPage;
import com.hierarchymanager.pageLib.CreateCityPage;
import com.hierarchymanager.pageLib.ExternalAgentInfoPage;
import com.hierarchymanager.pageLib.HomePage;
import com.hierarchymanager.pageLib.InternalAgentInfoPage;
import com.hierarchymanager.pageLib.LoginPage;
import com.hierarchymanager.pageLib.SalesPersonSearchPage;
import com.hierarchymanager.pageLib.TitlesPage;
//import com.hierarchymanager.pageLib.TitlesPage;
import com.hierarchymanager.pageLib.UtilityPage;




public class HMSalesComp {
	
	//WebDriver driver = Driver.configureDriver();
	WebDriver driver = Driver.fireFoxDriver();
	WebDriverLib wLib = new WebDriverLib();
	ExcelLib eLib = new ExcelLib();
//	DBConnection dbConn = new DBConnection();
	Actions act;
	Select sel;
	
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	HomePage homePage = PageFactory.initElements(driver, HomePage.class);
	SalesPersonSearchPage searchPage = PageFactory.initElements(driver, SalesPersonSearchPage.class);
	ChangeSummaryPage summaryPage = PageFactory.initElements(driver, ChangeSummaryPage.class);
	ChangeSummaryDetailPage detailPage = PageFactory.initElements(driver, ChangeSummaryDetailPage.class);
	AgentInfoPage infoPage = PageFactory.initElements(driver, AgentInfoPage.class);
	InternalAgentInfoPage internalAgentInfoPage = PageFactory.initElements(driver, InternalAgentInfoPage.class);
	UtilityPage utilityPage = PageFactory.initElements(driver, UtilityPage.class);
	TitlesPage titlesPage = PageFactory.initElements(driver, TitlesPage.class);
	CreateCityPage createCityPage = PageFactory.initElements(driver, CreateCityPage.class);
	ExternalAgentInfoPage externalAgentInfoPage = PageFactory.initElements(driver, ExternalAgentInfoPage.class);
	 
	
	public void driverInit(String path)
	  {
		  driver.get(path);
		  wLib.waitForPageToLoad();
		  
	  }
	  
	  public void logIn(String cUid, String psw)
	  {
		  
		  loginPage.getuNameEdt().sendKeys(cUid);
		  loginPage.getPswEdt().sendKeys(psw);
		  loginPage.getSubmitBtn().click();
		 // wLib.waitForPageToLoad();
		  			 
	  }

	  
	  
	  public void navigateTo1000HierSearchPage()
	  {
		  try
		  {
			  homePage.getHierarchy1000Link().click();
			  wLib.waitForPageToLoad();
			  System.out.println("Successfully Navigate to Secrah Page");
		  }
		  catch(Exception e)
		  {
			  System.out.println("Navigation to Search Page is Failed");
		  }
		  
	  }
	
	  
	  public void navigateTo1082HierSearchPage()
	  {
		  try
		  {
			  homePage.getHierarchy1082Link().click();
			  wLib.waitForPageToLoad();

			  System.out.println("Successfully Navigate to Secrah Page");
			  driver.switchTo().defaultContent();
		  }
		  catch(Exception e)
		  {
			  System.out.println("Navigation to Search Page is Failed");
		  }
		  
	  }
	  
	  
	  
	  
	  
	  public void navigateToExternalAgentInfoPage()
	  {
		  WebElement element = searchPage.getFrame();
		  wLib.frameHandles(element);
		 // Reporter.log("Link Frame is Present");
		  searchPage.getAddExternalAgentLink().click();
		  wLib.waitForPageToLoad();
		  driver.switchTo().defaultContent();
		  
	  }
	  
	  
	  
	  
	  public void navigateToUtilityPage()
	  {
		 try
		 {
			 WebElement webFrame = searchPage.getFrame();
			 wLib.frameHandles(webFrame);
			 searchPage.getUtilityLink().click();
			 System.out.println("Successfully Navigated to UtilityPage");
		 }
		 catch(Exception e)
		 {
			 System.out.println("Navigation to Utility Page is Failed");
		 }
	  }
	  
	  
	  public void navigateToTitlesPage()
	  {
		 try
		 {
			 WebElement webFrame = searchPage.getFrame();
			 wLib.frameHandles(webFrame);
			 searchPage.getTitleLink().click();
			 System.out.println("Successfully Navigated to TitlesPage");
		 }
		 catch(Exception e)
		 {
			 System.out.println("Navigation to TitlesPage is Failed");
		 }
	  }
	  
	  
	  
	  
	  
	  public void addChildTitle() throws InterruptedException
	  {
		  WebElement wbFrame1 = titlesPage.getFrame();
		  wLib.frameHandles(wbFrame1);
		  titlesPage.getFirstHierarchy().click();
		  driver.switchTo().defaultContent();
		  WebElement wbFrame2 = titlesPage.getSalesFrame();
		  wLib.frameHandles(wbFrame2);
		 // System.out.println("Frame");  
		  Thread.sleep(3000);
		  titlesPage.getAddChildTitleBtn().click();
		  driver.switchTo().defaultContent();
		  WebElement wbFrame3 = titlesPage.getFrameText();
		  wLib.frameHandles(wbFrame3);
		  WebElement roleTitle = titlesPage.getRoleTitleSelectBox();
		  sel = new Select(roleTitle);
		  sel.selectByValue("272 Inbound Channel");
		  WebElement statementType = titlesPage.getStatementTypeSelectBox();
		  sel = new Select(statementType);
		  sel.selectByValue("REP_B_1");
		  WebElement segmentType = titlesPage.getSegmentTypeSelectBox();
		  sel = new Select(segmentType);
		  sel.selectByValue("20");
		  Thread.sleep(3000);
		  titlesPage.getSaveButton().click();
		  wLib.acceptAlert();
		  
		  
	  }
	  
	  
	  
	  
	  public void navigateToreateCityPage() throws InterruptedException
	  {
		 try
		 {
			 WebElement wbFrame1 = utilityPage.getFrame();
			 wLib.frameHandles(wbFrame1);
			 utilityPage.getCreateCityLink().click();
			 driver.switchTo().defaultContent();
			 Thread.sleep(5000);
			 WebElement webFrame3 = createCityPage.getUtilityFrame();
			 wLib.frameHandles(webFrame3);
			 // System.out.println("3Frame successful");
			 WebElement wbFrame4 = createCityPage.getFrame();
			 wLib.frameHandles(wbFrame4);
			  //System.out.println("4Frame successful");
			 createCityPage.getNewCityLink().click();
			//  System.out.println("click successful");	 
			 System.out.println("Successfully Navigate to CreateCity Page");
			 driver.switchTo().defaultContent();
			  
		 }
		 catch(Exception e)
		 {
			 System.out.println("Navigation to CreateCity Page is Failed"); 
		 }
	  }
	  
	  
	  
	  
	
	  public void addCityInformation(String cityName)
	  {
		  try
		  {
			  WebElement webFrame = createCityPage.getUtilityFrame();
			  wLib.frameHandles(webFrame);
			  //System.out.println("3Frame successful");
			  WebElement updateFrame = createCityPage.getUpdateFrame();
			  wLib.frameHandles(updateFrame);
			 // System.out.println("frame");
			  createCityPage.getCityNameEdit().sendKeys(cityName);
			  createCityPage.getSaveButton().click();
			  wLib.acceptAlert();
			  System.out.println("The city information added successfully");
			  driver.switchTo().defaultContent();
		  }
		  catch(Exception e)
		  {
			  System.out.println("Failed to add the city information");
		  }
	  }
	  
	  
	  
	  
	  public void navigateToAgentInfoPage(String salesId)
	  {
		  try
		  {
			  WebElement salesIdFrame = searchPage.getSalesIdFrame();
			  wLib.frameHandles(salesIdFrame);
			  //System.out.println("SalesId Frame is present");
			  searchPage.getSalesIdEdt().sendKeys(salesId);
			  searchPage.getSearchBtn().click();
			  wLib.waitForPageToLoad();
			  searchPage.getLinktext().click();	
			  System.out.println("Successfully Navigated to Agent Info Page");
		  }
		  catch(Exception e)
		  {
			  System.out.println("Navigation to Agent Info Page is Failed");
		  }
	} 
	  
	  
	  public void navigateToExternalAgentInfoPage(String salesId)
	  {
		  try
		  {
			  WebElement salesIdFrame = searchPage.getSalesIdFrame();
			  wLib.frameHandles(salesIdFrame);
			  searchPage.getSalesIdEdt().sendKeys(salesId);
			  searchPage.getSearchBtn().click();
			  wLib.waitForPageToLoad();
			  searchPage.getExternalAgent().click();
			  System.out.println("Successfully Navigated to External Agent Info Page");
		  }
		  catch(Exception e)
		  {
			  System.out.println("Navigation to External Agent Info Page is Failed");
		  }
	} 
	  
	  
	  
	  
	  
	  
	  public void updateInternalAgent(int dealerCode)
	  {
		  try
		  { 
			  infoPage.getDealerCodeEdt().clear();
			  infoPage.getDealerCodeEdt().sendKeys(Integer.toString(dealerCode));
			  infoPage.getSaveBtn().click();
			  wLib.waitForPageToLoad();
			  wLib.acceptAlert();
			  System.out.println("Dealer Code is Updated Successfully");
		  }
		  catch(Exception e)
		  {
			  System.out.println("DealerCode updation is Failed");
		  }
	  }
	  
	  
	  public void updateExternalAgentToLowerValue() throws InterruptedException//(int dealerCode)
	  { 
			  wLib.waitForPageToLoad();
			  driver.switchTo().defaultContent();
			  WebElement agentInfoFrame = infoPage.getAgentInfoFrame();
			  wLib.frameHandles(agentInfoFrame);
			  externalAgentInfoPage.getSalesArea().click();
			  wLib.waitForPageToLoad();
			  wLib.multyWindowhandles();
			  WebElement menuFrame = externalAgentInfoPage.getMenuFrame();
			  wLib.frameHandles(menuFrame);
			  externalAgentInfoPage.getRegionhierarchyButn().click();
			  externalAgentInfoPage.getNestedRegionHierarchyBtn().click();
			  externalAgentInfoPage.getSelectRegionValue().click();
			  driver.switchTo().defaultContent();
			  WebElement selectFrame = externalAgentInfoPage.getSelectFrame();
			  wLib.frameHandles(selectFrame);
			  externalAgentInfoPage.getSelectBtn().click();
			  wLib.multyWindowhandles();
			  WebElement agentMainFrame = externalAgentInfoPage.getAgentMainFrame();
			  wLib.frameHandles(agentMainFrame);
			  externalAgentInfoPage.getRegionAssignDate().click();
			  wLib.multyWindowhandles();
			  Thread.sleep(3000);
			  WebElement selectBox = externalAgentInfoPage.getSelectBoxValues();
			  Select sel = new Select(selectBox);
			  sel.selectByValue("12/01/2014");
			  Thread.sleep(3000);
			  externalAgentInfoPage.getSelBoxOkBtn().click();
			  wLib.multyWindowhandles();
			  WebElement agentMainFrame2 = externalAgentInfoPage.getAgentMainFrame();
			  wLib.frameHandles(agentMainFrame2);
			  externalAgentInfoPage.getExternalAgentInfoSaveBtn().click();
			  Alert alt = driver.switchTo().alert();
			  String message = alt.getText();
			  System.out.println("ERROR MESSAGE : " + message);
			  alt.accept();		  
		  }
		 
  


public void updateExternalAgentToHigherValue() throws InterruptedException//(int dealerCode)
{
	  try
	  { 
		  wLib.waitForPageToLoad();
		  driver.switchTo().defaultContent();
		 /* WebElement agentInfoFrame = infoPage.getAgentInfoFrame();
		  wLib.frameHandles(agentInfoFrame);
		  externalAgentInfoPage.getSalesArea().click();
		  wLib.waitForPageToLoad();
		  wLib.multyWindowhandles();
		  WebElement menuFrame = externalAgentInfoPage.getMenuFrame();
		  wLib.frameHandles(menuFrame);
		  externalAgentInfoPage.getRegionhierarchyButn().click();
		  externalAgentInfoPage.getNestedRegionHierarchyBtn().click();
		  externalAgentInfoPage.getSelectRegionValue().click();
		  driver.switchTo().defaultContent();
		  WebElement selectFrame = externalAgentInfoPage.getSelectFrame();
		  wLib.frameHandles(selectFrame);
		  externalAgentInfoPage.getSelectBtn().click();
		  wLib.multyWindowhandles();*/
		  WebElement agentMainFrame = externalAgentInfoPage.getAgentMainFrame();
		  wLib.frameHandles(agentMainFrame);
		  externalAgentInfoPage.getRegionAssignDate().click();
		  wLib.multyWindowhandles();
		  Thread.sleep(3000);
		  WebElement selectBox = externalAgentInfoPage.getSelectBoxValues();
		  Select sel = new Select(selectBox);
		  sel.selectByValue("10/01/2016");
		  Thread.sleep(3000);
		  externalAgentInfoPage.getSelBoxOkBtn().click();
		  wLib.multyWindowhandles();
		  WebElement agentMainFrame2 = externalAgentInfoPage.getAgentMainFrame();
		  wLib.frameHandles(agentMainFrame2);
		  externalAgentInfoPage.getExternalAgentInfoSaveBtn().click();
		  Alert alt = driver.switchTo().alert();
		  String message = alt.getText();
		  System.out.println("Successful MESSAGE : " + message);
		  alt.accept();
		  System.out.println("Region Assign Date is Updated Successfully");
		  
	  }
	 
	  catch(Exception e)
	  {
		  System.out.println("Region Assign Date updation is Failed");
	  }
	}



public void updateDealerCode(int code)
{
	  try
	  { 
		  infoPage.getDealerCodeEdt().clear();
		  infoPage.getDealerCodeEdt().sendKeys(Integer.toString(code));
		  infoPage.getSaveBtn().click();
		  wLib.waitForPageToLoad();
		  wLib.acceptAlert();
		  System.out.println("Dealer Code is Updated Successfully");
	  }
	  catch(Exception e)
	  {
		 System.out.println("DealerCode updation is Failed");
	  }
}
}

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  /*  public void navigateTo1000HierSearchPage() 
	  {
		  try
		  {
			  homePage.getHierarchyLink().click();  
			  wLib.waitForPageToLoad();
			  Reporter.log("Successfully Navigate to SecrahPage");
		  }
		  catch(Exception e)
		  {
			  Reporter.log("Navigation to SearchPage is Failed");
		  }
		
	  }*/
	  /*public void verifyCityInList(String cityName)
	  {
		  try
		  {
			  WebElement webFrame = createCityPage.getUtilityFrame();
			  wLib.frameHandles(webFrame);
			  WebElement updateFrame = createCityPage.getUpdateFrame();
			  wLib.frameHandles(updateFrame);
			  System.out.println("frame");
			  Thread.sleep(5000);
			  String city = createCityPage.getCityName().getText();
			  System.out.println(city);
			  System.out.println("City Name is verified successfully");
		  }
		  catch(Exception e)
		  {
			  System.out.println("Failed to verify City Name");
		  }
		  
	  }*/
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  



	  
	/*  public void navigateTochangeSummary() throws AWTException, InterruptedException
	  {
		
		  WebElement element = searchPage.getFrame();
		  wLib.frameHandles(element);
		  Reporter.log("Link Frame is Present");
		  searchPage.getChangeSummaryLink().click();
		  wLib.waitForPageToLoad();
		  driver.switchTo().defaultContent();
	  }  
	  
	  
	 public void verifyPageTitle(String expected)
	  {
		  WebElement frameEle = detailPage.getTitleFrame();
		  wLib.frameHandles(frameEle);
		  Reporter.log("Title Frame is Present");
		  String actualText = detailPage.getTitleText().getText();
		  wLib.verifyText(expected, actualText);
	  }
	  
	  
	  
	  
	 
}
	 /* public void navigateToInternalAgentInfoPage(String salesId)
	  {
		  try
		  {
			  WebElement salesIdFrame = searchPage.getSalesIdFrame();
			  wLib.frameHandles(salesIdFrame);
			  Reporter.log("SalesId Frame is present");
			  searchPage.getSalesIdEdt().sendKeys(salesId);
			  searchPage.getSearchBtn().click();
			  wLib.waitForPageToLoad();
			  searchPage.getLinkTextIntenalAgent().click();	
			  Reporter.log("Successfully Navigated to Agent Info Page");
			  wLib.waitForPageToLoad();
			  internalAgentInfoPage.getRelationshipTab().click();
		  }
		  catch(Exception e)
		  {
			  Reporter.log("Navigation to Internal Agent Info Page is Failed");
		  }
	}   */
	  
		  
	 
		  
			
		
		 //river.findElement(By.xpath("//html/body/div[2]/table[2]/tbody/tr/td[6]/a/img")).click();
		  //searchPage.getChangeSummaryLink().click();
	
		  //summaryPage.getCalender().click();
		 // wLib.waitForPageToLoad();
		 // summaryPage.getDatePicking().click();
		//  wLib.waitForPageToLoad();
		//  summaryPage.getGoBtn().click();
		//  wLib.waitForPageToLoad();
		  /*homePage.getLinkText().click();
		  wLib.waitForPageToLoad();
		  wLib.multyWindowhandles();
		  window.getLinkText().click();
		  wLib.waitForPageToLoad();
		  wLib.fileDownload();
		  driver.close();
		  wLib.multyWindowhandles();
		  homePage.getReqLinkText().click();
		  wLib.waitForPageToLoad();
		  wLib.multyWindowhandles();*/
	  
	  
	
