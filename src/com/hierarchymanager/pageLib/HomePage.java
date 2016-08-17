package com.hierarchymanager.pageLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(xpath = "//a[@href='/ccshms/hmsessionparamservlet?Role_HierId=ADMIN_1000_BSG CCA MEMBER SALES']")
	private WebElement hierarchyLink;
	
	
	//@FindBy(xapyh = "//a[@href='/ccshms/hmsessionparamservlet?Role_HierId=ADMIN_1082_BSG COMMERCIAL']")
	//private WebElement hierarchy
	
	@FindBy(xpath = "//a[@href='/ccshms/hmsessionparamservlet?Role_HierId=ADMIN_1082_BSG COMMERCIAL']")
	private WebElement hierarchy1082Link;
	
	@FindBy(xpath = "//a[@href='/ccshms/hmsessionparamservlet?Role_HierId=ADMIN_2075_RAMYA']")
	private WebElement hierarchy2075image;
	
	@FindBy(xpath = "//a[@href='/ccshms/hmsessionparamservlet?Role_HierId=ADMIN_2065_AFFILIATE']")
	private WebElement hierarchy2065image;
	
	
	@FindBy(xpath ="//div[@id='Layer2']/table[1]/tbody/tr/td[contains(text(),'Select Hierarchy')]")
	private WebElement selectHierarchyLabel;
	
	@FindBy(xpath ="//div[@id='Layer2']/table[1]/tbody/tr/td[contains(text(),'Select Hierarchy')]/following::td[1]/img[@src='/ccshms/images/yellowflag.gif']")
	private WebElement ViewFlag;
	
	@FindBy(xpath ="//div[@id='Layer2']/table[1]/tbody/tr/td[contains(text(),'Select Hierarchy')]/following::td[2]/img[@src='/ccshms/images/GreenFlag.gif']")
	private WebElement EditFlag;
	
	@FindBy(xpath ="//div[@id='Layer1']/table/tbody/tr[2]/td[contains(text(),'HM Help') and @align='right']")
	private WebElement HMHelp;
	
	@FindBy(xpath ="//div[@id='Layer1']/table/tbody/tr[1]/td[3]/a/img[@alt='Logout']")
	private WebElement Logout;
	
	@FindBy(xpath ="//div[@id='Layer2']/table[3]/tbody/tr/td/img[@src='/ccshms/images/newHierarchy.gif']")
	private WebElement newHierarchyButton;
	
	@FindBy(xpath ="//td[contains(text(),'Update')]/following::tr[1]/td[4]/a/img[@src='/ccshms/images/detail.gif']")
	private WebElement UpdateIcon;
	
	
	public WebElement getSelectHierarchyLabel() {
		return selectHierarchyLabel;
	}

	public WebElement getViewFlag() {
		return ViewFlag;
	}

	public WebElement getEditFlag() {
		return EditFlag;
	}

	public WebElement getHMHelp() {
		return HMHelp;
	}

	public WebElement getLogout() {
		return Logout;
	}

	public WebElement getNewHierarchyButton() {
		return newHierarchyButton;
	}

	public WebElement getUpdateIcon() {
		return UpdateIcon;
	}

	public WebElement getHierarchyLink() {
		return hierarchyLink;
	}

	public WebElement getHierarchy1082Link() {
		return hierarchy1082Link;
	}

	
	public WebElement gethierarchy2075image() {
		return hierarchy2075image;
	}
		
		
		public WebElement gethierarchy2065image() {
			return hierarchy2065image;
	}
	
}
