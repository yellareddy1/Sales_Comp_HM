package com.hm.pagerepo.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author ab63599
 *
 */
public class UtilityPage {
	WebDriver driver;
	@FindBy(css = "area[title='Utility']")
	private WebElement utitlityTab;

	public UtilityPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * Method used for Clicking on Utility Tab
	 */
	public void clickonUtitlitytab() {
		driver.switchTo().frame("Menu");
		utitlityTab.click();
	}

}
