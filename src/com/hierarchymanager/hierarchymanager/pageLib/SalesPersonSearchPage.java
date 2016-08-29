package com.hierarchymanager.pageLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesPersonSearchPage {
	
	@FindBy(xpath = "//img[contains(@src,'ChangeSummary')]")
	private WebElement changeSummaryLink;
	
	@FindBy(xpath = "//iframe[@name = 'Menu']")
	private WebElement frame;
	
	@FindBy(xpath = "//iframe[@name = 'agent_main']")
	private WebElement salesIdFrame;
	
	@FindBy(xpath = "//input[@name= 'agentid']")
	private WebElement salesIdEdt;
	
	@FindBy(xpath = "//input[@name= 'Submit']")
	private WebElement searchBtn;
	
	@FindBy(linkText = "STRANZ, MICHELLE")
	private WebElement linktext;
	
	@FindBy(linkText = "ABC")
	private WebElement externalAgent;
	
	@FindBy(xpath = "//a[@href='/ccshms/HMhierarchychangeservlet?displayAgentId=384823&salesHierId=1082&salesHierName=BSG COMMERCIAL&updateFlag=search']")
	private WebElement linkTextIntenalAgent;
	
	@FindBy(xpath = "//img[contains(@src,'AddExternalAgent')]")
	private WebElement addExternalAgentLink;
	
	@FindBy(xpath = "//td/map/area[@href = 'f_support_system.htm']")
	private WebElement utilityLink;
	
	@FindBy(xpath = "//td/map/area[@href = 'f_sales_hier.htm']")
	private WebElement titleLink;
	
	
	
	
	
	
	
	public WebElement getExternalAgent() {
		return externalAgent;
	}


	public WebElement getAddExternalAgentLink() {
		return addExternalAgentLink;
	}


	public WebElement getChangeSummaryLink() {
		return changeSummaryLink;
	}


	public WebElement getFrame() {
		return frame;
	}

	public WebElement getSalesIdFrame() {
		return salesIdFrame;
	}

	public WebElement getSalesIdEdt() {
		return salesIdEdt;
	}


	public WebElement getSearchBtn() {
		return searchBtn;
	}


	public WebElement getLinktext() {
		return linktext;
	}
	
	public WebElement getLinkTextIntenalAgent() {
		return linkTextIntenalAgent;
	}


	public WebElement getUtilityLink() {
		return utilityLink;
	}


	public WebElement getTitleLink() {
		return titleLink;
	}

  
}


