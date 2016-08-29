package com.citsapplication.pageLibCITS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateStatusIdPage {

	@FindBy(xpath = "//input[@name = 'my_file']")
	private WebElement browseButton;
	
	@FindBy(xpath = "//frame[@name = 'bottomframe']")
	private WebElement bottomframe;

	@FindBy(xpath = "//select[@name = 'StatusId']")
	private WebElement dropdownField;

	@FindBy(xpath = "//input[@class = 'FormButton']")
	private WebElement updateButton;
	
	
	public WebElement getBrowseButton() {
		return browseButton;
	}

	public WebElement getBottomframe() {
		return bottomframe;
	}

	public WebElement getDropdownField() {
		return dropdownField;
	}

	public WebElement getUpdateButton() {
		return updateButton;
	}

}
