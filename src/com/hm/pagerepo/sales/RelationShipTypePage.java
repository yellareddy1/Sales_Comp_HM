package com.hm.pagerepo.sales;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RelationShipTypePage {
	WebDriver driver;
	@FindBy(css = "html>body>table>tbody>tr>td>table>tbody>tr>td>table>tbody>tr>td>table>tbody>tr>td>a>font>b")
	private WebElement customerName;
	@FindBy(xpath = "html/body/map/area[1]")
	private WebElement relationshipsTab;
	@FindBy(css = "input[value*='Add']")
	private WebElement addBtn;
	@FindBy(xpath = "//img[@alt='Search']")
	private WebElement searchImg;
	@FindBy(name = "firstname")
	private WebElement firstNameTxtBox;
	@FindBy(name = "Submit")
	private WebElement savebtn;
	@FindBy(name = "img0")
	private WebElement nameLinkImg;
	@FindBy(name = "payDateImage")
	private WebElement startDateImg;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement okBtn;
	@FindBy(css = "input[value*='Save']")
	private WebElement saveBtnf;

	public RelationShipTypePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnCustomerNameLink() {
		customerName.click();
	}

	public void clickOnRelationShipsTab() {
		relationshipsTab.click();
	}

	public void clickOnAddBtn() {
		addBtn.click();
	}

	public void clickOnSearchImg() {
		searchImg.click();
	}

	public void searchWindow(String value) {
		switchToWindowByIndex(1);
		firstNameTxtBox.sendKeys(value);
		savebtn.click();
		nameLinkImg.click();

	}

	public void selectDate() {
		switchToWindowByIndex(0);
		driver.switchTo().frame("agent_main");
		startDateImg.click();
		switchToWindowByIndex(1);
		okBtn.click();
	}

	public void clickonSave() {

		switchToWindowByIndex(0);
		driver.switchTo().frame("agent_main");
		saveBtnf.click();
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
