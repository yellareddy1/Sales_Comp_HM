package com.hm.pagerepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(name = "user")
	private WebElement usernameTxtBox;
	@FindBy(name = "password")
	private WebElement passwordTxtBox;
	@FindBy(xpath = "//input[@type='SUBMIT']")
	private WebElement submittBtn;
	@FindBy(xpath = "//img[@alt='Logout']")
	private WebElement logoutTab;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginSuccess(String un, String pwd) {

		usernameTxtBox.sendKeys(un);
		passwordTxtBox.sendKeys(pwd);
		submittBtn.click();

	}

	public void logoutSuccess() {

		logoutTab.click();

	}

}
