package com.hm.pagerepo.titles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TitleTabPage {
	WebDriver driver;
	@FindBy(xpath = "//area[@href='f_sales_hier.htm']")
	private WebElement titleTab;

	public TitleTabPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickonTitleTab() {
		driver.switchTo().frame("Menu");

		titleTab.click();
	}

}
