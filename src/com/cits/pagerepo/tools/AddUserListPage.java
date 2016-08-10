package com.cits.pagerepo.tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserListPage {
	WebDriver driver;
	@FindBy(xpath = "//input[@value='User']")
	private WebElement usetListRadioBtn;

	public AddUserListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickOnUserList() {
		driver.switchTo().frame("bottomframe");
		usetListRadioBtn.click();
		driver.switchTo().defaultContent();
	}

}
