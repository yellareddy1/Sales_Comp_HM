package com.hm.pagerepo.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hm.generic.GenericUtils;

/**
 * @author ab63599
 * 
 */
public class WFApprovalPage {
	WebDriver driver;
	@FindBy(xpath = "//a[img[@alt='Work Flow Approve']]")
	private WebElement wfApprovalTab;
	@FindBy(name = "SalesHierIdList")
	private WebElement hierarchyDDl;
	@FindBy(name = "Submit")
	private WebElement searchBtn;
	@FindBy(name = "Submit")
	private WebElement submitBtn;

	public WFApprovalPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * Method for clicking on WF Approval Tab
	 */
	public void clickOnWFApproval() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("menu");
		wfApprovalTab.click();
	}

	/**
	 * Method for Selecting Sales Hier By Id
	 */
	public void selectTheSalesHierId() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("utility_main");
		driver.switchTo().frame("content");
		GenericUtils.selectDdlByVisibleText(hierarchyDDl,
				"RMG CONSUMER FIELD SALES");
		searchBtn.click();

	}

	/**
	 * Method for submitting the Approval
	 */
	public void submitForApproval() {
		submitBtn.click();
	}
}
