package com.citsapplication.pageLibCITS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IssuePreviewPage 
{
	
	@FindBy(xpath = "//td/b[contains (text(), 'ISSUE:')]")
	private WebElement issueText;
	
	@FindBy(xpath = "//a/font[text() = 'Search']")
	private WebElement searchLink;

	@FindBy(xpath = "//frame[@name = 'baseframe']")
	private WebElement baseFrame;
	
	@FindBy(xpath = "//a/font[text() = 'ITS Summary']")
	private WebElement itsSummaryLik;
	
	@FindBy(xpath = "//select[@name = 'preStatus']")
	private WebElement statusDropdownField;
	
	@FindBy(xpath = "//input[@name = 'sendemail']")
	private WebElement sendMailCheckBox;
	
	@FindBy(xpath = "//input[@id = 'submit1']")
	private WebElement saveBtn;
	

	
	
	public WebElement getIssueText() {
		return issueText;
	}

	public WebElement getSearchLink() {
		return searchLink;
	}

	
	public WebElement getBaseFrame() {
		return baseFrame;
	}

	public WebElement getItsSummaryLik() {
		return itsSummaryLik;
	}

	public WebElement getStatusDropdownField() {
		return statusDropdownField;
	}

	public WebElement getSendMailCheckBox() {
		return sendMailCheckBox;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	

}
