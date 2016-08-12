package com.hm.pagerepo.utility;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hm.generic.GenericUtils;

public class MapDetailTitlePage {
	WebDriver driver;
	@FindBy(css = "area[title='Utility']")
	private WebElement utitlityTab;
	@FindBy(xpath = "//img[@src='/ccshms/images/MapHierRole_Off.GIF']")
	private WebElement mapHierTitleTab;
	@FindBy(name = "hierSelect")
	private WebElement salesHierarchyNameDdl;
	@FindBy(name = "itemSelect")
	private WebElement hierarchyItemsDdl;
	@FindBy(css = ".formlabelbold")
	private WebElement addBtn;

	@FindBy(name = "selTitle")
	private WebElement detailedTitleDdl;
	@FindBy(name = "startDateImage")
	private WebElement startDateimg;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement startDateOkbtn;

	@FindBy(name = "endDateImage")
	private WebElement endDateImg;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement endDateOkbtn;

	@FindBy(name = "butSave")
	private WebElement saveBtn;

	public MapDetailTitlePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickonUtitlitytab() {
		driver.switchTo().frame("Menu");
		utitlityTab.click();

	}

	public void clickOnMapDetialTitleTab() throws InterruptedException {

		driver.switchTo().defaultContent();
		driver.switchTo().frame("menu");
		mapHierTitleTab.click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
	}

	public void selectSalesHierarchyName() throws InterruptedException {

		driver.switchTo().frame("utility_main");

		driver.switchTo().frame("content");
		GenericUtils.selectDdlByVisibleText(salesHierarchyNameDdl, "AFFILIATE");
	}

	public void selectHierarchyItems() {
		GenericUtils.selectDdlByVisibleText(hierarchyItemsDdl, "12345NEW(15039)");
	}

	public void clickOnAdd() {
		addBtn.click();
	}

	public void selectDetailedTitle() {

	}

	public void setStartDate() throws InterruptedException {

		switchToWindowByIndex(1);
		startDateimg.click();
		Thread.sleep(2000);
		switchToWindowByIndex(2);
		startDateOkbtn.click();

	}

	public void setEndDate() throws InterruptedException {

		switchToWindowByIndex(1);
		endDateImg.click();
		Thread.sleep(1000);
		switchToWindowByIndex(2);
		endDateOkbtn.click();
		Thread.sleep(2000);
	}

	public void clickOnSaveBtn() {

		switchToWindowByIndex(1);
		saveBtn.click();
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
