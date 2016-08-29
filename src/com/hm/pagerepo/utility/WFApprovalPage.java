package com.hm.pagerepo.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hm.generic.GenericUtils;

public class WFApprovalPage {
	WebDriver driver;
	@FindBy(xpath="//a[img[@alt='Work Flow Approve']]")
	private WebElement wfApprovalTab;
	@FindBy(name="SalesHierIdList")
	private WebElement hierarchyDDl;
	@FindBy(name="Submit")
	private WebElement searchBtn;
	@FindBy(name="Submit")
	private WebElement submitBtn;
	public WFApprovalPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnWFApproval()
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame("menu");
		wfApprovalTab.click();
	}
	public void selectTheSalesHierId()
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame("utility_main");
		driver.switchTo().frame("content");
		GenericUtils.selectDdlByVisibleText(hierarchyDDl, "RMG CONSUMER FIELD SALES");
		searchBtn.click();
		
	}
	public void submitForApproval()
	{
		submitBtn.click();
	}
}
