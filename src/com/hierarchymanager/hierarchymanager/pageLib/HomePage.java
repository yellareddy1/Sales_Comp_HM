package com.hierarchymanager.pageLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	

	
	@FindBy(xpath = "//a[@href='/ccshms/hmsessionparamservlet?Role_HierId=ADMIN_1082_BTS INSIDE SALES']")
	private WebElement hierarchy1082Link;

	
	@FindBy(xpath ="//td/a[@href = '/ccshms/hmsessionparamservlet?Role_HierId=ADMIN_1000_BTS CCA MEMBER SALES']")
	private WebElement hierarchy1000Link;
	
	
	
	

	public WebElement getHierarchy1000Link() {
		return hierarchy1000Link;
	}


	public WebElement getHierarchy1082Link() {
		return hierarchy1082Link;
	}

	
}
