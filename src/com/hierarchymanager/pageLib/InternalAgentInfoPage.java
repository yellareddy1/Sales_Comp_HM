package com.hierarchymanager.pageLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InternalAgentInfoPage {
	
	@FindBy(xpath = "//area[@href='javascript:getRelationList(frmQwestAgent)']")
	private WebElement relationshipTab;

	public WebElement getRelationshipTab() {
		return relationshipTab;
	}
	
	
			

}
