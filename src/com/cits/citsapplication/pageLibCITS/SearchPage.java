package com.citsapplication.pageLibCITS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
	

	@FindBy(xpath = "//iframe[@name = 'baseframe']")
	private WebElement baseFrame;
	
	@FindBy(xpath = "//input[@name = 'issueNo']")
	private WebElement issueNoEdt;
	
	@FindBy(xpath = "//input[@name = 'salesId']")
	private WebElement salesIdEdt;
	
	@FindBy(xpath = "//input[@name = 'searchCUID']")
	private WebElement cUidEdt;
	
	@FindBy(xpath = "//input[@class = 'FormButton']")
	private WebElement searchButton;
	
	@FindBy(xpath = "//td/font[text() = 'Search']")
	private WebElement searchText;
	
	@FindBy(xpath = "//select[@name = 'filterStatus']")
	private WebElement issueStatus;

	@FindBy(xpath = "//select[@name = 'filterItsTypes']") 
	private WebElement issueType;
	
	@FindBy(xpath = "//select[@name = 'filterChannel']")
	private WebElement channelName;
	
	@FindBy(xpath = "//select[@name = 'fromEffDate']")
	private WebElement revenueYear;
	
	@FindBy(xpath = "//select[@name = 'yearEndInd']")
	private WebElement closuOutValue;
	
	
	
	
	
	
	public WebElement getcUidEdt() {
		return cUidEdt;
	}

	public WebElement getBaseFrame() {
		return baseFrame;
	}

	public WebElement getIssueNoEdt() {
		return issueNoEdt;
	}

	public WebElement getSalesIdEdt() {
		return salesIdEdt;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getSearchText() {
		return searchText;
	}

	public WebElement getIssueStatus() {
		return issueStatus;
	}

	public WebElement getIssueType() {
		return issueType;
	}

	public WebElement getChannelName() {
		return channelName;
	}

	public WebElement getRevenueYear() {
		return revenueYear;
	}

	public WebElement getClosuOutValue() {
		return closuOutValue;
	}
	
	
	
}
