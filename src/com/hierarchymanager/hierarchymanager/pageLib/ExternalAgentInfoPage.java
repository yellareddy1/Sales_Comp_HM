package com.hierarchymanager.pageLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExternalAgentInfoPage 
{
	@FindBy(xpath = "//font/a/img[@src = '/ccshms/images/find.gif']")
	private WebElement salesArea;

	@FindBy(xpath = "//frame[@name = 'menu']")
	private WebElement menuFrame;
	
	@FindBy(xpath = "//a/img[@src = '/ccshms/jsmenu/menu-images/menu_corner_plus.gif']")
	private WebElement regionhierarchyButn;
	
	@FindBy(xpath = "//a/img[@src = '/ccshms/jsmenu/menu-images/menu_tee_plus.gif']")
	private WebElement nestedRegionHierarchyBtn;
	
	@FindBy(xpath = "//td/a[@name = 'sub4']")
	private WebElement selectRegionValue;
	
	@FindBy(xpath = "//frame[@name = 'select']")
	private WebElement selectFrame;
	
	
	@FindBy(xpath = "//td/input[@value = 'Select']")
	private WebElement selectBtn;
	
	@FindBy(xpath = "//frame[@name = 'agent_main']")
	private WebElement agentMainFrame;
	
	@FindBy(xpath = "//td/a[@href = 'javascript:showAssignRegionAgentDateWindow()']")
	private WebElement regionAssignDate;
	
	@FindBy(xpath = "//td/select[@name = 'datelist']")
	private WebElement selectBoxValues;
	
	@FindBy(xpath = "//td/input[@value = '    OK   ']")
	private WebElement selBoxOkBtn;
	
	@FindBy(xpath = "//td/input[@value = 'Save']")
	private WebElement externalAgentInfoSaveBtn;
	
	
	
	
	
	public WebElement getSalesArea() {
		return salesArea;
	}
	
	public WebElement getMenuFrame() {
		return menuFrame;
	}


	public WebElement getRegionhierarchyButn() {
		return regionhierarchyButn;
	}

	public WebElement getNestedRegionHierarchyBtn() {
		return nestedRegionHierarchyBtn;
	}

	public WebElement getSelectRegionValue() {
		return selectRegionValue;
	}

	
	public WebElement getSelectFrame() {
		return selectFrame;
	}

	public WebElement getSelectBtn() {
		return selectBtn;
	}

	public WebElement getAgentMainFrame() {
		return agentMainFrame;
	}

	public WebElement getRegionAssignDate() {
		return regionAssignDate;
	}

	public WebElement getSelectBoxValues() {
		return selectBoxValues;
	}

	public WebElement getSelBoxOkBtn() {
		return selBoxOkBtn;
	}

	public WebElement getExternalAgentInfoSaveBtn() {
		return externalAgentInfoSaveBtn;
	}

			

}
