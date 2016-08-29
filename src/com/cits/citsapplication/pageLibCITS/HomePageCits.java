package com.citsapplication.pageLibCITS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePageCits {

	@FindBy(xpath = "//a[@href = 'f_ItsBulk.htm']")
	private WebElement bulkUploadLinkText;

	@FindBy(xpath = "//iframe[@name = 'topframe']")
	private WebElement topFrame;
	
	@FindBy(xpath = "//a[@href= 'DisplayIssueFrame.jsp?cache=no&summaryScreen=N']")
	private WebElement selectedIssueLinkText;
	
	@FindBy(xpath = "//a[@href= 'f_IssueOption.jsp?Option=IssueSearch']")
	private WebElement searchLink;
	
	@FindBy(xpath = "//td/a[contains (text(), 'ALL')]")
	private WebElement allLink;
	
	
	//@FindBy(xpath = "//a[@target = '_parent' and text()= 'ALL']")
	//private WebElement allIssueLink;
	
	@FindBy(xpath = "//td/a[contains (text(), 'NOT SUBMITTED')]")
	private WebElement notSubmittedLink;
	
	@FindBy(xpath = "//frame[@name = 'baseframe']")
	private WebElement baseFrame;
	
	
	@FindBy(xpath = "//td/a[contains (text(), 'Contact ITS')]")
	private WebElement contactITSLink;
	
	@FindBy(xpath = "//iframe[@name = 'topframe']")
	private WebElement topIFrame;
	
	@FindBy(xpath = "//td/a[contains(text(), 'Logout')]")
	private WebElement logOutBtn;
	
	
	
	
	public WebElement getBulkUploadLinkText() {
		return bulkUploadLinkText;
	}


	public WebElement getTopFrame() {
		return topFrame;
	}

	public WebElement getSelectedIssueLinkText() {
		return selectedIssueLinkText;
	}


	public WebElement getSearchLink() {
		return searchLink;
	}

	

	public WebElement getAllLink() {
		return allLink;
	}


	public WebElement getNotSubmittedLink() {
		return notSubmittedLink;
	}


	public WebElement getBaseFrame() {
		return baseFrame;
	}

	public WebElement getContactITSLink() {
		return contactITSLink;
	}


	public WebElement getLogOutBtn() {
		return logOutBtn;
	}


	public WebElement getTopIFrame() {
		return topIFrame;
	}


	
	
	
	//public WebElement getAllIssueLink(){
	//	return allIssueLink;
	//}
	
}
	

	
	
	
