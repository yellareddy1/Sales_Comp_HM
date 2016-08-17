package com.hierarchymanager.businessLib;




import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Reporter;











import org.openqa.selenium.support.ui.Select;

import com.hierarchymanager.commonLib.DBConnection;
import com.hierarchymanager.commonLib.Driver;
import com.hierarchymanager.commonLib.ExcelLib;
import com.hierarchymanager.commonLib.WebDriverLib;
import com.hierarchymanager.pageLib.ChangeSummaryDetailPage;
import com.hierarchymanager.pageLib.ChangeSummaryPage;
import com.hierarchymanager.pageLib.CreateCityPage;
import com.hierarchymanager.pageLib.ExternalAgentInfoPage;
import com.hierarchymanager.pageLib.HomePage;
import com.hierarchymanager.pageLib.InternalAgentInfoPage;
import com.hierarchymanager.pageLib.LoginPage;
import com.hierarchymanager.pageLib.SalesPersonSearchPage;
import com.hierarchymanager.pageLib.TeamSearchPage;
import com.hierarchymanager.pageLib.TitlesPage;
import com.hierarchymanager.pageLib.TransferPage;
import com.hierarchymanager.pageLib.UtilityPage;




public class HMSalesComp {
	
	//WebDriver driver = Driver.configureDriver();
	WebDriver driver = Driver.fireFoxDriver();
	WebDriverLib wLib = new WebDriverLib();
	ExcelLib eLib = new ExcelLib();
	DBConnection dbConn = new DBConnection();
	Actions act;
	
	
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	HomePage homePage = PageFactory.initElements(driver, HomePage.class);
	SalesPersonSearchPage searchPage = PageFactory.initElements(driver, SalesPersonSearchPage.class);
	ChangeSummaryPage summaryPage = PageFactory.initElements(driver, ChangeSummaryPage.class);
	ChangeSummaryDetailPage detailPage = PageFactory.initElements(driver, ChangeSummaryDetailPage.class);
	ExternalAgentInfoPage infoPage = PageFactory.initElements(driver, ExternalAgentInfoPage.class);
	InternalAgentInfoPage internalAgentInfoPage = PageFactory.initElements(driver, InternalAgentInfoPage.class);
	UtilityPage utilityPage = PageFactory.initElements(driver, UtilityPage.class);
	CreateCityPage createCityPage = PageFactory.initElements(driver, CreateCityPage.class);
	TeamSearchPage teamPage = PageFactory.initElements(driver, TeamSearchPage.class);
	TitlesPage titlePage = PageFactory.initElements(driver, TitlesPage.class);
	TransferPage transPage = PageFactory.initElements(driver, TransferPage.class);
	
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
		  wLib.waitForPageToLoad();
		  			 
	  }

	
	  public void navigateTo2075HierSearchPage()
	  {
		  try
		  {
			  System.out.println("homepage");
			  homePage.gethierarchy2075image().click();
			 //driver.switchTo().defaultContent();
			  WebElement MenuFrame = searchPage.getFrame();
			  wLib.frameHandles(MenuFrame);
			  System.out.println("Successfully Navigate to Sales Page");
			  
			  
		  }
		  catch(Exception e)
		  {
			  System.out.println("Navigation to Sales Page is Failed");
		  }
		  
	  }
	  
	  public void navigateTo2065HierSearchPage()
	  {
		  try
		  {
			  System.out.println("homepage");
			  homePage.gethierarchy2065image().click();
			 //driver.switchTo().defaultContent();
			  WebElement MenuFrame = searchPage.getFrame();
			  wLib.frameHandles(MenuFrame);
			  System.out.println("Successfully Navigate to Sales Page");
			  
			  
		  }
		  catch(Exception e)
		  {
			  System.out.println("Navigation to Sales Page is Failed");
		  }
		  
	  }
	  
	  public void NavigateSalesPerson()
	  {
		  try
		  {
			  searchPage.getsalesPerson().click();
			  System.out.println("Successfully Navigate to SalesPerson");
			 			  
			  if(searchPage.getSearchOnTab().isDisplayed())
			  {
				  System.out.println("Search Page is displayed in sales person tab");
				  
			  }
			  
		  }
		  catch(Exception e)
		  {
			  System.out.println("Navigation to Search Page is Failed");
		  }
		  
	  }
	  
	  public void teamSearch()
	  {
		  try
		  {
			  searchPage.getTeamSearch().click();
			  searchPage.getTeamSearch().click();
			  System.out.println("Successfully Navigate to Team Search");
			  driver.switchTo().defaultContent();
			  WebElement AgentFrame = searchPage.getSalesIdFrame();
			  wLib.frameHandles(AgentFrame);
			  System.out.println("Successfully Navigate to Agent Frame");
		  }
		  catch(Exception e)
		  {
			  System.out.println("Failed to Navigate to Team Search");
		  }
	  }
	  
	  public void NavigateTransfer()
	  {
		  try
		  {
			  searchPage.getTransferLink().click();
			  //searchPage.getTransferLink().click();
			  System.out.println("Successfully Navigate to Transfer Search");
			  driver.switchTo().defaultContent();
			  WebElement AgentFrame = searchPage.getSalesIdFrame();
			  wLib.frameHandles(AgentFrame);
			  System.out.println("Successfully Navigate to Agent Frame");
		  }
		  catch(Exception e)
		  {
			  System.out.println("Failed to Navigate to Transfer Search");
		  }
	  }
	  
	  
	  public void transferSearch()
	  {
		  try
		  {
			 
			  
			  Select selRegion = new Select(transPage.getSelRegion());
			  selRegion.selectByVisibleText("AFFILIATE REGION");
			  Select selCity = new Select(transPage.getSelCity());
			  selCity.selectByVisibleText("AFFILIATE SALES AREA");
			  transPage.getAgentSearch().click();
			  transPage.getSelectCheckbox().click();
			  transPage.getEffectiveDate().click();
			  driver.switchTo().defaultContent();
			  
			  //Switch to Effective date child window
			
			  String parentWindow = driver.getWindowHandle();
			  System.out.println(parentWindow);
				Set<String> handles =  driver.getWindowHandles();
				 for(String windowHandle  : handles)
				 {
				   if(!windowHandle.equals(parentWindow))
				    {
				     driver.switchTo().window(windowHandle);
				     System.out.println("successfully switched to next window");
				    }
				  }
			  transPage.getSubmitDate().click();
			  System.out.println("Effective date selected successfully");
			  
			 driver.switchTo().defaultContent();
			 
			 //Switch to main window
			
			  WebElement AgentFrame = searchPage.getSalesIdFrame();
			  wLib.frameHandles(AgentFrame);
			  transPage.getRegionImage().click();
			  
			//Switch to Region child window
			  System.out.println("Region window opened successfully");
			  driver.switchTo().defaultContent();
			  Thread.sleep(2000);
			  wLib.SwitchWindow();
			 
			WebElement menuFrame = transPage.getMenuFrame();
			wLib.frameHandles(menuFrame);
			  transPage.getParentRegion().click();
			  transPage.getChildRegion1().click();
			  transPage.getChildRegion2().click();
			  driver.switchTo().defaultContent();
			  WebElement SelectFrame = transPage.getSelectFrame();
				 wLib.frameHandles(SelectFrame);
			  transPage.getSelectRegionButton().click();
			  
			// Switch to main Window
			  Thread.sleep(2000);
			 driver.switchTo().window(parentWindow);
			driver.switchTo().defaultContent();
			 
			  WebElement AgentFrame1 = searchPage.getSalesIdFrame();
			  wLib.frameHandles(AgentFrame1);
			  transPage.getTransferButton().click();
			  System.out.println("Successfully Transfered");
			 
			  
		  }
		  catch(Exception e)
		  {
			  System.out.println("Failed to Transfer");
		  }
	  }
	  public void activeTeamSearch()
	  {
		  try
		  {
			  teamPage.getRadioActiveTeam().click();
			  teamPage.getGoButton().click();
			  teamPage.getGoButton().click();
			  String appFilter = teamPage.getAppliedFilter().getAttribute("value");
			  if(appFilter.equals("ACTIVE"))
			  	{
				  System.out.println("Successfully Team search with Active Team members");
			  	}
		  
		  }
		  catch(Exception e)
		  {
			  System.out.println("Failed Team search with Active Team members");
		  }
	  }
	  
	  
	  public void teamIDSearch(String TeamID)
	  {
		  try
		  {
			  teamPage.getTeamId().sendKeys(TeamID);
			  teamPage.getGoButton().click();
			  String TeamIdresult = teamPage.getteamIdResult().getText();
			  if(TeamIdresult.equals("10040"))
			  	{
			  System.out.println("Successfully Team search with team ID");
			  	}
		  }
		  catch(Exception e)
		  {
			  System.out.println("Failed Team search with Team ID");
		  }
	  }
	 
	  
	  public void navigateTitlePage()
	  {
		  try
		  {
			  titlePage.getTitleTab().click();
			  driver.switchTo().defaultContent();
			  WebElement salesFrame =titlePage.getSalesFrame();
			  wLib.frameHandles(salesFrame);
			  if(titlePage.getChildTitleTab().isDisplayed() && titlePage.getPersonTitleTab().isDisplayed())
			  {
				  System.out.println("Child and Persons tab present in Titles page"); 
			  }
		  }
		  catch(Exception e)
		  {
			  System.out.println("Child and Persons tab not present in Titles page");
		  }
	  }
	  
	  
	  
	  public void VerifyLookFeelHomePage()
	  {
		  try
		  {
			  if(homePage.getViewFlag().isDisplayed())
			  {
				  System.out.println("View Flag is displayed");
			  }
			  else
			  {
				  System.out.println("View Flag is not displayed");
			  }
			  if(homePage.getEditFlag().isDisplayed())
			  {
				  System.out.println("Edit Flag is displayed");
			  }
			  else
			  {
				  System.out.println("Edit Flag is not displayed");
			  }
			  if(homePage.getHMHelp().isDisplayed())
			  {
				  System.out.println("HM Help image is displayed");
			  }
			  else
			  {
				  System.out.println("HM Help image is not displayed");
			  }
			  if(homePage.getNewHierarchyButton().isDisplayed())
			  {
				  System.out.println("New Hierarchy Button is displayed");
			  }
			  else
			  {
				  System.out.println("New Hierarchy Button is not displayed");
			  }
			  if(homePage.getUpdateIcon().isDisplayed())
			  {
				  System.out.println("Update Icon is displayed");
			  }
			  else
			  {
				  System.out.println("Update Icon is not displayed");
			  }
			  if(homePage.getLogout().isDisplayed())
			  {
				  System.out.println("Logout image is displayed");
			  }
			  else
			  {
				  System.out.println("Logout image is not displayed");
			  }
		  }
		  catch(Exception e)
		  {
			  System.out.println("HomePage elements are missing or not properly aligned");
		  }
	  }
	  
	  
	  public void verifyWFApproval()
	  {
		  try
		  {
			  WebElement UtilityFrame = utilityPage.getFrame();
			  wLib.frameHandles(UtilityFrame);
			  utilityPage.getUtilityTab().click();
			  utilityPage.getWFAppTab().click();
			  WebElement agentTitle = utilityPage.getAgentTitle();
			  Select TransType = new Select(agentTitle);
			  TransType.selectByVisibleText("");
			  WebElement HierList = utilityPage.getHierList();
			  Select Hierarchy = new Select(agentTitle);
			  Hierarchy.selectByVisibleText("");
			  utilityPage.getSearchWF().click();
			  System.out.println("WF Apporval successfull");
			  
			 
		  }
		  catch(Exception e)
		  {
			  System.out.println("Failed WF Approval");
		  }
		  
	  }
	  
	
	 /* public void addCityInformation(String cityName)
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
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }



	  
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
	  
	  
	  public void navigateToExternalAgentInfoPage(String salesId)
	  {
		  try
		  {
			  WebElement salesIdFrame = searchPage.getSalesIdFrame();
			  wLib.frameHandles(salesIdFrame);
			  Reporter.log("SalesId Frame is present");
			  searchPage.getSalesIdEdt().sendKeys(salesId);
			  searchPage.getSearchBtn().click();
			  wLib.waitForPageToLoad();
			  searchPage.getLinktext().click();	
			  Reporter.log("Successfully Navigated to Agent Info Page");
		  }
		  catch(Exception e)
		  {
			  Reporter.log("Navigation to External Agent Info Page is Failed");
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
			  Reporter.log("Dealer Code is Updated Successfully");
		  }
		  catch(Exception e)
		  {
			 Reporter.log("DealerCode updation is Failed");
		  }
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
	  
	  
	
