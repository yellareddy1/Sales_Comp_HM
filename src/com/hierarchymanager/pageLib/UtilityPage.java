package com.hierarchymanager.pageLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UtilityPage
{
	@FindBy(xpath = "//frame[@name = 'menu']")
	private WebElement frame;

	@FindBy(xpath = "//a[@href = 'f_preferences_city.htm']")
	private WebElement createCityLink;
	
	@FindBy(xpath = "//map[@name='Map1']/area[@title='Utility']")
	private WebElement UtilityTab;
	
	@FindBy(xpath = "//a/img[@alt='Work Flow Approve']")
	private WebElement WFAppTab;
	
	@FindBy(xpath = "//option[text()='AGENT TITLE']")
	private WebElement agentTitle;
	
	@FindBy(name="SalesHierIdList")
	private WebElement HierList;
	
	@FindBy(name="Submit")
	private WebElement searchWF;
	
	
	
	
	public WebElement getFrame() {
		return frame;
	}
	
	

	public WebElement getUtilityTab() {
		return UtilityTab;
	}


	

	public WebElement getWFAppTab() {
		return WFAppTab;
	}



	public WebElement getCreateCityLink() {
		return createCityLink;
	}

	public WebElement getAgentTitle() {
		return agentTitle;
	}

	public WebElement getHierList() {
		return HierList;
	}

	public WebElement getSearchWF() {
		return searchWF;
	}
	
	
	
	

}
