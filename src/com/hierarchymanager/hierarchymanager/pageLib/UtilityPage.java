package com.hierarchymanager.pageLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UtilityPage
{
	@FindBy(xpath = "//frame[@name = 'menu']")
	private WebElement frame;

	@FindBy(xpath = "//a[@href = 'f_preferences_city.htm']")
	private WebElement createCityLink;
	
	
	
	
	public WebElement getFrame() {
		return frame;
	}

	public WebElement getCreateCityLink() {
		return createCityLink;
	}
	
	

}
