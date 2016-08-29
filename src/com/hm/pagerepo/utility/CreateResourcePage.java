package com.hm.pagerepo.utility;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hm.generic.GenericUtils;

public class CreateResourcePage {
	WebDriver driver;
	@FindBy(xpath = "//a[img[@alt='Create Resource']]")
	private WebElement createResourceTab;
	@FindBy(xpath = "//input[@value='Add']")
	private WebElement addButton;
	@FindBy(name = "resourceType")
	private WebElement resourceTypeDDl;
	@FindBy(xpath = "//img[@src='/ccshms/images/MNet.gif']")
	private WebElement mNetImg;
	@FindBy(name = "cuId")
	private WebElement cuidTxtBox;
	@FindBy(name = "endDateImage")
	private WebElement startDateimg;
	@FindBy(name = "datelist")
	WebElement startdateDDl;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement startDateOkbtn;
	@FindBy(name = "endDateImage")
	private WebElement endDateImg;
	@FindBy(name = "datelist")
	WebElement endDateDDl;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement endDateOkbtn;
	@FindBy(name = "channelName")
	private WebElement channelNameDDl;
	@FindBy(name = "tierOrg")
	private WebElement tierOrgDDl;
	@FindBy(name = "butSave")
	private WebElement saveBtn;
	@FindBy(xpath = "//tr[td[contains(text(),'PANKAJ KUMAR SINGH(433105)')]]/td/a[img[@src='/ccshms/images/detail.gif']]")
	private WebElement detailsImg;

	public CreateResourcePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOncreateResource() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("menu");
		createResourceTab.click();
		driver.switchTo().defaultContent();
	}

	public void addResource(String cuid) throws InterruptedException {
		driver.switchTo().frame("utility_main");
		driver.switchTo().frame("content");
		addButton.click();
		switchToWindowByIndex(1);
		GenericUtils.selectDdlByIndex(resourceTypeDDl, 3);
		cuidTxtBox.sendKeys(cuid);
		mNetImg.click();
		switchToWindowByIndex(2);
		((JavascriptExecutor) driver).executeScript("okPressed(this)");
		Thread.sleep(2000);

	}

	public void setStartDate() throws InterruptedException {
		switchToWindowByIndex(1);
		startDateimg.click();
		switchToWindowByIndex(2);
		Thread.sleep(2000);
		GenericUtils.selectDdlByIndex(startdateDDl, 15);
		startDateOkbtn.click();
		Thread.sleep(2000);

	}

	public void setEndDate() throws InterruptedException {
		switchToWindowByIndex(1);
		endDateImg.click();
		switchToWindowByIndex(2);
		Thread.sleep(2000);
		GenericUtils.selectDdlByIndex(endDateDDl, 16);
		endDateOkbtn.click();

	}

	public void setChannelAndOrg() throws InterruptedException {
		switchToWindowByIndex(1);
		Thread.sleep(2000);
		GenericUtils.selectDdlByIndex(channelNameDDl, 3);
		GenericUtils.selectDdlByIndex(tierOrgDDl, 3);
		saveBtn.click();
		Thread.sleep(2000);
	}

	public void closeBrowser() {
		switchToWindowByIndex(0);

	}

	public void details() {

		driver.switchTo().frame("utility_main");
		driver.switchTo().frame("content");
		detailsImg.click();
	}

	private void switchToWindowByIndex(int index) {
		int count = 0;
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			driver.switchTo().window(window);
			if (count == index) {
				System.out.println("Switched into window :: " + index);
				break;
			}
			count++;
		}
	}
}
