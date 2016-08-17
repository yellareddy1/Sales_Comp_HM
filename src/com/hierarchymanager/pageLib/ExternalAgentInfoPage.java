package com.hierarchymanager.pageLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExternalAgentInfoPage {
	
	@FindBy (xpath = "//frame[@name = 'agent_main']")
	private WebElement agentInfoFrame;
	
	@FindBy(xpath = "//input[@name='dealerCode']")
	private WebElement dealerCodeEdt;
	
	@FindBy(xpath = "//input[@value = 'Save']")
	private WebElement saveBtn;
	
	public WebElement getAgentInfoFrame() {
		return agentInfoFrame;
	}

	public WebElement getDealerCodeEdt() {
		return dealerCodeEdt;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
 
	
	
	
	
	
}
