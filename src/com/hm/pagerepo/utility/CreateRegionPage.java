package com.hm.pagerepo.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hm.generic.GenericUtils;

/**
 * @author ab63599
 * 
 */
public class CreateRegionPage {
	WebDriver driver;
	@FindBy(xpath = "//img[@alt='Region List']")
	WebElement createRegionTab;
	@FindBy(xpath = "//img[@src='/ccshms/images/newregion.gif']")
	WebElement newRegionImg;
	@FindBy(name = "regionName")
	WebElement regionNameTxtBox;
	@FindBy(xpath = "//input[@value='Save']")
	WebElement saveBtn;
	@FindBy(xpath = "//a[contains(text(),'TESTING HM EVN1')]")
	WebElement regionLink;

	public CreateRegionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * Method for clicking on Create Region Tab
	 */
	public void clickonCreateRegion() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("menu");
		createRegionTab.click();
	}

	/**
	 * Method used for Add New Region
	 * 
	 * @param region
	 * @throws InterruptedException
	 */
	public void addNewRegion(String region) throws InterruptedException {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("utility_main");
		driver.switchTo().frame("content");
		newRegionImg.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("utility_main");
		driver.switchTo().frame("update");
		regionNameTxtBox.sendKeys(region);
		saveBtn.click();
	}

	/**
	 * Method for update Region
	 */
	public void updateRegion() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("utility_main");
		driver.switchTo().frame("content");
		regionLink.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("utility_main");
		driver.switchTo().frame("update");
		saveBtn.click();

	}

	/**
	 * Method for check Created Region Details
	 */
	public void checkRegion() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("utility_main");
		driver.switchTo().frame("content");
		((JavascriptExecutor) driver).executeScript("window.scroll(0,500)");
		GenericUtils gu = new GenericUtils();
		gu.moveToElment(regionLink);
	}

}
