package com.cits.pagerepo.tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAdminPage {
	WebDriver driver;
	@FindBy(xpath = "(//input[@value='Admin'])")
	private WebElement addAdminBtn;
	@FindBy(name = "cuid")
	private WebElement cuidTxtBox;
	@FindBy(name = "submit1")
	private WebElement loginBtn;

	public AddAdminPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickOnAddAdminRadioBtn() {
		driver.switchTo().frame("bottomframe");
		addAdminBtn.click();
	}

	public void setCuid(String cuid) {
		cuidTxtBox.sendKeys(cuid);
		loginBtn.click();
		driver.switchTo().defaultContent();
	}

}
