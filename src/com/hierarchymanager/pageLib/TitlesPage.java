package com.hierarchymanager.pageLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TitlesPage {
	
	@FindBy(xpath = "//map[@name='Map1']/area[@title='Roles Hierarchy']")
	private WebElement TitleTab;
	
	
	@FindBy(xpath = "//frame[@name='sales']")
	private WebElement salesFrame;
	
	@FindBy(xpath = "//a/img[@alt='Add Child Title']")
	private WebElement childTitleTab;
	
	@FindBy(xpath = "//a/img[@alt='Add Parent Title']")
	private WebElement personTitleTab;

	public WebElement getTitleTab() {
		return TitleTab;
	}

	public WebElement getSalesFrame() {
		return salesFrame;
	}

	public WebElement getChildTitleTab() {
		return childTitleTab;
	}

	public WebElement getPersonTitleTab() {
		return personTitleTab;
	}
	
	
	

}
