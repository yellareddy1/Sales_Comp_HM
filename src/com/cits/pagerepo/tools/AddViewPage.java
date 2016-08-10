package com.cits.pagerepo.tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddViewPage {
	WebDriver driver;
	@FindBy(xpath = "(//input[@value='View'])")
	private WebElement addViewBtn;
	@FindBy(name = "cuid")
	private WebElement cuidTxtBox;
	@FindBy(name = "submit1")
	private WebElement saveBtn;

	public AddViewPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickOnAddViewRadioBtn() {
		driver.switchTo().frame("bottomframe");
		addViewBtn.click();
	}

	public void setCuid(String cuid) {
		cuidTxtBox.sendKeys(cuid);
		saveBtn.click();
		driver.switchTo().defaultContent();
	}

}
