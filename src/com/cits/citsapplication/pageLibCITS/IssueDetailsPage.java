package com.citsapplication.pageLibCITS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IssueDetailsPage {

	@FindBy(xpath = "//iframe[@name = 'baseframe']")
	private WebElement baseIframe;
	
	@FindBy(xpath = "//iframe[@name = 'topframe']")
	private WebElement topframe;
	
	@FindBy(xpath = "//td[text() = 'Denied ']")
	private WebElement statusText;


	public WebElement getBaseIframe() {
		return baseIframe;
	}
	

	public WebElement getTopframe() {
		return topframe;
	}


	public WebElement getStatusText() {
		return statusText;
	}
	
	
	
	
	
	
}
