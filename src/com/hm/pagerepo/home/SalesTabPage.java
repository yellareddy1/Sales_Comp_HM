package com.hm.pagerepo.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesTabPage {
	WebDriver driver;
	@FindBy(xpath = "//area[@title='Sales Agent']")
	private WebElement salesPersonTab;

	public SalesTabPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/**
	 * used for clicking on Sales Person Tab
	 */
	public void clickOnSalesPersonTab() {
		driver.switchTo().frame("Menu");
		salesPersonTab.click();
	}
}
