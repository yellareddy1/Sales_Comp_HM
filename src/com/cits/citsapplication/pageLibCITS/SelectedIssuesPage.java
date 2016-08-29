package com.citsapplication.pageLibCITS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectedIssuesPage 
{
	@FindBy(xpath = "//td/a[contains (text(), '230630')]")
	private WebElement issueLink;
	
	@FindBy(xpath = "//td/a[contains (text(), '230107')]")
	private WebElement issueToSearch;  
	
	@FindBy(xpath = "//iframe[@name = 'topframe']")
	private WebElement topFrame;
	
	@FindBy(xpath = "//iframe[@name = 'baseframe']")
	private WebElement baseFrame;
	
	@FindBy(xpath = "//a[@id = 'lnkFIRST']")
	private WebElement linkFirst;
	
	@FindBy(xpath = "//a[@id ='lnkLAST']")
	private WebElement linkLast;
	
	@FindBy(xpath = "//tr/td[contains (text(), 'Selected Issues')]")
	private WebElement selectedIssueText;

	@FindBy(xpath = "//tr/td[contains (text(), 'Sub')]") 
	private WebElement issueStatus;
	
	@FindBy(xpath = "//tr/td[contains (text(), 'Credit ')]") 
	private WebElement issueType;
	
	@FindBy(xpath = "//tr/td[contains (text(), 'AH94')]")
	private WebElement salesId;
	
	@FindBy(xpath = "//tr/td[contains (text(), 'AH94')]")
	private WebElement cUid;
	 
	@FindBy(xpath = "//tr/td[contains (text(), 'BTS FEDERAL')]")
	private WebElement channelNameText;
	
	@FindBy(xpath = "//tr/td[contains (text(), 'Yes')]")
	private WebElement yearEndCloseOutText;
	
	
	
	
	public WebElement getIssueLink() {
		return issueLink;
	}

	
	public WebElement getIssueToSearch() {
		return issueToSearch;
	}


	public WebElement getTopFrame() {
		return topFrame;
	}

	public WebElement getLinkFirst() {
		return linkFirst;
	}
	
	
	public WebElement getLinkLast() {
		return linkLast;
	}


	public WebElement getBaseFrame() {
		return baseFrame;
	}

	public WebElement getSelectedIssueText() {
		return selectedIssueText;
	}


	public WebElement getIssueStatus() {
		return issueStatus;
	}


	public WebElement getIssueType() {
		return issueType;
	}


	public WebElement getSalesId() {
		return salesId;
	}


	public WebElement getChannelNameText() {
		return channelNameText;
	}


	public WebElement getYearEndCloseOutText() {
		return yearEndCloseOutText;
	}
	
	
	

}
