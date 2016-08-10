package com.cits.pagerepo.tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddSuperPage {
	WebDriver driver;
	@FindBy(xpath = "(//input[@value='Super'])")
	private WebElement addSuperBtn;
	@FindBy(name = "cuid")
	private WebElement cuidTxtBox;
	@FindBy(id = "submit1")
	private WebElement saveBtn;

	public AddSuperPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnAddSuperRadioBtn() {
		driver.switchTo().frame("bottomframe");
		addSuperBtn.click();
	}

	public void setCuid(String cuid) {
		cuidTxtBox.sendKeys(cuid);
		saveBtn.click();
		driver.switchTo().defaultContent();
	}

}
