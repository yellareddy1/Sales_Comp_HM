package com.cits.pagerepo.statics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	@FindBy(name = "user")
	private WebElement usernameTxtBx;
	@FindBy(name = "password")
	private WebElement passwordTxtBx;
	@FindBy(name = "Submit223")
	private WebElement loginbtn;
	@FindBy(partialLinkText="Logout")
	WebElement logoutLink;
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void unamepass(String un, String pass) {
		usernameTxtBx.sendKeys(un);
		passwordTxtBx.sendKeys(pass);

	}

	public void submit() {
		loginbtn.click();
	}
	public void logoutSuccess()
	{
		driver.switchTo().frame("topframe");
		logoutLink.click();
	}

}
