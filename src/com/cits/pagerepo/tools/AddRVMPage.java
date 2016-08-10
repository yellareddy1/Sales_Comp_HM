package com.cits.pagerepo.tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRVMPage {
	WebDriver driver;
	@FindBy(xpath = "(//input[@value='RBM'])[1]")
	private WebElement addRBMBtn;
	@FindBy(name = "cuid")
	private WebElement cuidTxtBox;
	@FindBy(name = "salesId")
	private WebElement rvmSalesidTxtBox;
	@FindBy(id = "submit1")
	private WebElement saveBtn;

	public AddRVMPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickOnAddRVMRadioBtn() {
		driver.switchTo().frame("bottomframe");
		addRBMBtn.click();
	}

	public void setValue(String cuid, String sId) {
		cuidTxtBox.sendKeys(cuid);
		rvmSalesidTxtBox.sendKeys(sId);
		saveBtn.click();
		driver.switchTo().defaultContent();
	}

}
