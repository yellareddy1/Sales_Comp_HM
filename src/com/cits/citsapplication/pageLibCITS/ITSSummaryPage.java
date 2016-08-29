package com.citsapplication.pageLibCITS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ITSSummaryPage 
{
	
	@FindBy(xpath = "//frame[@name = 'baseframe']")
	private WebElement itsBaseFrame;
	
	@FindBy(xpath = "//tr/td[text() = 'ITS Summary ']")
	private WebElement itsSummaryText;
	
	
	

	public WebElement getItsBaseFrame() {
		return itsBaseFrame;
	}

	public WebElement getItsSummaryText() {
		return itsSummaryText;
	}
	 
	
	
}
