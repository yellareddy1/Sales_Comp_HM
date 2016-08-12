package com.hm.pagerepo.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hm.generic.GenericUtils;

public class ResetAgentTabPage {
	WebDriver driver;
	@FindBy(xpath = "//img[@alt='Reset Agent']")
	WebElement resetAgentTab;
	@FindBy(name = "resetAgentCuId")
	WebElement salesIdTxtBox;
	@FindBy(name = "fname")
	WebElement firstNameTxtBox;
	@FindBy(name = "lname")
	WebElement lastNameTxtBox;
	@FindBy(xpath = "//img[@src='/ccshms/images/find.gif']")
	WebElement findImg;
	@FindBy(name = "agent")
	WebElement expiredAgentDdl;
	@FindBy(xpath = "//img[@src='/ccshms/images/reset.GIF']")
	WebElement resetImg;

	public ResetAgentTabPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnResetAgentTab() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("menu");
		resetAgentTab.click();
	}

	public void enterSalesIdandReset(String sId) {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("utility_main");
		driver.switchTo().frame("content");
		salesIdTxtBox.sendKeys(sId);
		resetImg.click();

	}

	public void resetByFirstByName(String fName) throws InterruptedException {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("utility_main");
		driver.switchTo().frame("content");
		firstNameTxtBox.sendKeys(fName);
		findImg.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("utility_main");
		driver.switchTo().frame("selectAgent");
		GenericUtils.selectDdlByIndex(expiredAgentDdl, 1);
		resetImg.click();

	}

	public void resetByLastName(String lName) throws InterruptedException {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("utility_main");
		driver.switchTo().frame("content");

		lastNameTxtBox.sendKeys(lName);
		findImg.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("utility_main");
		driver.switchTo().frame("selectAgent");
		GenericUtils.selectDdlByIndex(expiredAgentDdl, 2);
		resetImg.click();

	}

}
