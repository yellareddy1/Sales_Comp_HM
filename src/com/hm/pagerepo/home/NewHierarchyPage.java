package com.hm.pagerepo.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewHierarchyPage {
	public WebDriver driver;
	@FindBy(xpath = "//img[@alt='Add New Hierarchy']")
	private WebElement newHierarchyTab;
	@FindBy(name = "name")
	private WebElement hierarchyNameTxtBox;
	@FindBy(xpath = "//img[@src='/ccshms/images/show-calendar.gif']")
	private WebElement startdateImg;
	@FindBy(name = "foreignRegionHierId")
	private WebElement foreigenRegionHierId;
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement saveBtn;

	public NewHierarchyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * Method used for clicking on New Hierarchy Tab
	 */
	public void clickonNewHierarchyTab() {
		newHierarchyTab.click();
	}

	/**
	 * This method is used for Enter Hierarchy Information and Save
	 * 
	 * @param name
	 * @param hid
	 */
	public void enterNewHierarchyInformation(String name, String hid)

	{
		hierarchyNameTxtBox.sendKeys(name);
		foreigenRegionHierId.sendKeys(hid);
		saveBtn.click();

	}

}
