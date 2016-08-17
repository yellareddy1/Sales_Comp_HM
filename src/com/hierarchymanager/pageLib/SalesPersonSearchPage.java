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
	
	@FindBy(linkText = "AB&T")
	private WebElement linktext;
	
	@FindBy(xpath = "//a[@href='/ccshms/HMhierarchychangeservlet?displayAgentId=384823&salesHierId=1082&salesHierName=BSG COMMERCIAL&updateFlag=search']")
	private WebElement linkTextIntenalAgent;
	
	@FindBy(xpath = "//td/map/area[@href = 'f_support_system.htm']")
	private WebElement utilityLink;
	
	@FindBy(xpath="//a/img[@src='http://hierarchymanager-test1.test.intranet/ccshms/images/AgentSearch_On.GIF']")
	private WebElement searchOnTab;
	
	@FindBy(xpath ="//map[@name='Map1']/area[@href='f_sales_agent.htm']")
	private WebElement 	salesPerson;
	
	@FindBy(xpath = "//a[@href='HMTeamMemberSearch.jsp']")
	private WebElement 	TeamSearch;
	
	//
	@FindBy(xpath = "//a/img[@src='/ccshms/images/AgentTransfer_Off.GIF']")
	private WebElement 	TransferLink;
	
	
	public WebElement getTransferLink() {
		return TransferLink;
	}
	
	public WebElement getTeamSearch() {
		return TeamSearch;
	}


	public WebElement getSearchOnTab() {
		return searchOnTab;
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
	
	
	public WebElement getsalesPerson() {
		return searchOnTab;
	}

  
}


