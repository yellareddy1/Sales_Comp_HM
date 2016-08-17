package com.hierarchymanager.pageLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransferPage {
	
	@FindBy(name="selRegion")
	private WebElement selRegion;
	
	@FindBy(name="selCity")
	private WebElement selCity;
	
	
	@FindBy(name="Submit")
	private WebElement AgentSearch;
	
	@FindBy(xpath="//form[@name='frmSearchResults']//tr[2]//td[4]/a/img[@src='/ccshms/images/show-calendar.gif']")
	private WebElement EffectiveDate;
	
	@FindBy(xpath="//form[@name='frmSearchResults']//tr[2]//td[6]//input[@type='checkbox']")
	private WebElement selectCheckbox;
	
	@FindBy(xpath="//a[@href='javascript:showRegionHelpWindow()']")
	private WebElement RegionImage;
	
	@FindBy(name="datelist")
	private WebElement datelist;
	
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitDate;
	
	@FindBy(xpath ="//span[@id='root']//following::td[1]//a[1]")
	//@FindBy(xpath ="//a[contains(text(),'AFFILIATE')]")
	private WebElement parentRegion;
	
	@FindBy(xpath ="//span[@id='root']//following::td[2]//a[1]")
	//@FindBy(xpath ="//a[contains(text(),'Affiliate Region')]")
	private WebElement ChildRegion1;
	
	//@FindBy(xpath ="//span[@id='root']//following::td[3]//a[1]")
	@FindBy(xpath ="//a[contains(text(),'Affiliate Sales Area')]")
	private WebElement ChildRegion2;
	
	@FindBy(xpath="//input[@value='Select']")
	private WebElement SelectRegionButton;	
	
	@FindBy(xpath="//input[@value='Transfer']")
	private WebElement TransferButton;	
	
	@FindBy(name="menu")
	private WebElement menuFrame;
	
	@FindBy(name="select")
	private WebElement selectFrame;
	
	
	


	public WebElement getSelRegion() {
		return selRegion;
	}


	public WebElement getSelCity() {
		return selCity;
	}


	public WebElement getEffectiveDate() {
		return EffectiveDate;
	}
	
	
	
	
	public WebElement getSelectCheckbox() {
		return selectCheckbox;
	}


	public WebElement getAgentSearch() {
		return AgentSearch;
	}


	public WebElement getRegionImage() {
		return RegionImage;
	}


	public WebElement getDatelist() {
		return datelist;
	}


	public WebElement getSubmitDate() {
		return submitDate;
	}


	public WebElement getParentRegion() {
		return parentRegion;
	}


	public WebElement getChildRegion1() {
		return ChildRegion1;
	}


	public WebElement getChildRegion2() {
		return ChildRegion2;
	}


	public WebElement getSelectRegionButton() {
		return SelectRegionButton;
	}


	public WebElement getTransferButton() {
		return TransferButton;
	}


	public WebElement getMenuFrame() {
		return menuFrame;
	}


	public WebElement getSelectFrame() {
		return selectFrame;
	}


	
	
	
	
}
