package com.hierarchymanager.pageLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TitlesPage 
{
	
	@FindBy(xpath = "//frame[@name = 'menu']")
	private WebElement frame;
	
	@FindBy(xpath = "//frame[@name = 'sales']")
	private WebElement salesFrame;
	
	@FindBy(xpath = "//img[@src = '/ccshms/jsmenu/menu-images/menu_corner_plus.gif']")
	private WebElement firstHierarchy;
	
	@FindBy(xpath ="//td/a[@href = '/ccshms/HMsalesaddnewitemforwardservlet?addFlag=Child']")
	private WebElement addChildTitleBtn;		
			
	@FindBy(xpath = "//frame[@name = 'text']")
	private WebElement frameText;
	
	@FindBy(xpath = "//select[@name = 'role']")
	private WebElement roleTitleSelectBox;
	
	@FindBy(xpath = "//select[@name = 'type']")
	private WebElement statementTypeSelectBox;
	
	
	@FindBy(xpath = "//select[@name = 'repTitleSegmentId']")
	private WebElement segmentTypeSelectBox;
	
	
	@FindBy(xpath = "//input[@type = 'BUTTON']")
	private WebElement saveButton;

	
	
	
	
	public WebElement getFrame() {
		return frame;
	}

	public WebElement getSalesFrame() {
		return salesFrame;
	}

	public WebElement getFirstHierarchy() {
		return firstHierarchy;
	}

	public WebElement getAddChildTitleBtn() {
		return addChildTitleBtn;
	}

	public WebElement getFrameText() {
		return frameText;
	}

	public WebElement getRoleTitleSelectBox() {
		return roleTitleSelectBox;
	}

	public WebElement getStatementTypeSelectBox() {
		return statementTypeSelectBox;
	}

	public WebElement getSegmentTypeSelectBox() {
		return segmentTypeSelectBox;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	
}
