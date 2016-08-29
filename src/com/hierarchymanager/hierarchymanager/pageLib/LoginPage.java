package com.hierarchymanager.pageLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(name = "user")
	private WebElement uNameEdt;
	
	@FindBy(name = "password")
	private WebElement pswEdt;
	
	@FindBy(xpath = "//input[@value=' OK ']")
	private WebElement submitBtn;

	
	public WebElement getuNameEdt() {
		return uNameEdt;
	}

	public WebElement getPswEdt() {
		return pswEdt;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	

	
	
}
