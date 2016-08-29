package com.hierarchymanager.pageLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCityPage
{
	
	@FindBy(xpath = "//frame[@name = 'content']")
	private WebElement frame;
	
	@FindBy(xpath = "//img[@src = '/ccshms/images/newcity.gif']")
	private WebElement newCityLink;

	@FindBy(xpath = "//frame[@name = 'update']")
	private WebElement updateFrame;
	
	@FindBy(xpath = "//input[@name = 'cityName']")
	private WebElement cityNameEdit;
	
	@FindBy(xpath = "//input[@value = 'Save']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//frame[@name = 'utility_main']")
	private WebElement utilityFrame;
	
	@FindBy(xpath = "//td/a[@href = '/ccshms/hmpreferencesprofileservlet?pref=city&prefName=ABCR']")
	private WebElement cityName;

	
	
	
	
	public WebElement getFrame() {
		return frame;
	}

	public WebElement getNewCityLink() {
		return newCityLink;
	}

	public WebElement getUpdateFrame() {
		return updateFrame;
	}

	public WebElement getCityNameEdit() {
		return cityNameEdit;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getUtilityFrame() {
		return utilityFrame;
	}

	public WebElement getCityName() {
		return cityName;
	}
	
	

}
