package com.hm.pagerepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HMHelpAndDataHelpPage {
	WebDriver driver;
	@FindBy(xpath = "//img[@alt='HM IT HelpDesk']")
	private WebElement hmHelpImg;
	@FindBy(xpath = "//img[@alt='Data Help']")
	private WebElement dataHelpImg;

	public HMHelpAndDataHelpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnHMHelp() {
		hmHelpImg.click();
	}

	public void clickOnDataHelp() {
		dataHelpImg.click();
	}

}
