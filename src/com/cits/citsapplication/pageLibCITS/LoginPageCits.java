package com.citsapplication.pageLibCITS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageCits {
	
	@FindBy(xpath = "//input[@name = 'user']")
	private WebElement userNameEdt;

	@FindBy(xpath = "//input[@name = 'password']")
	private WebElement pswEdt;

	@FindBy(xpath = "//input[@value = '  Log In  ']")
	private WebElement submitBtn;
	
	
	

	public WebElement getUserNameEdt() {
		return userNameEdt;
	}

	public WebElement getPswEdt() {
		return pswEdt;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	
}
