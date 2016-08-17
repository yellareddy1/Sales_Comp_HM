package com.hierarchymanager.pageLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangeSummaryDetailPage {

	@FindBy(xpath = "//frame[@name = 'agent_main']")
	private WebElement titleFrame;

	@FindBy (xpath = "//td[text()='Change Summary Detail']")
	private WebElement titleText;
	
	

	public WebElement getTitleFrame() {
		return titleFrame;
	}
		
	public WebElement getTitleText() {
		return titleText;
	}
	
}
