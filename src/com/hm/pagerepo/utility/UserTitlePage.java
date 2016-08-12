package com.hm.pagerepo.utility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserTitlePage {
	WebDriver driver;
	@FindBy(css = "area[title='Utility']")
	private WebElement utitlityTab;
	@FindBy(xpath = "(//a[@target='utility_main']/img)[1]")
	private WebElement userTittlesTab;
	@FindBy(name = "cuid")
	private WebElement cuidTxtBox;
	@FindBy(xpath = "//img[@alt='Add User Role']")
	private WebElement AddUserRoleImg;
	@FindBy(name = "allrole")
	private WebElement AdminGroupRadioBtn;
	@FindBy(xpath = "//img[@alt='Submit selection']")
	private WebElement submitBtn;

	public UserTitlePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickonUtitlitytab() {
		driver.switchTo().frame("Menu");
		utitlityTab.click();

		driver.switchTo().defaultContent();
		driver.switchTo().frame("menu");
		userTittlesTab.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("utility_main");
		driver.switchTo().frame("content");

	}

	public void entercuid() {

		cuidTxtBox.sendKeys("ab63599", Keys.ENTER);
		driver.switchTo().defaultContent();

	}

	public void clickOnAddNewRole() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("utility_main");

		driver.switchTo().frame("update");
		AddUserRoleImg.click();
	}

	public void checkAdminGroup() {
		AdminGroupRadioBtn.click();
	}

	public void clickonSubmit() {
		submitBtn.click();
	}

}
