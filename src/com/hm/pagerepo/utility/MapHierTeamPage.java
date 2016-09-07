package com.hm.pagerepo.utility;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hm.generic.GenericUtils;

/**
 * @author ab63599
 * 
 */
public class MapHierTeamPage {
	WebDriver driver;
	@FindBy(css = "area[title='Utility']")
	private WebElement utitlityTab;
	@FindBy(xpath = "//img[@alt='Map Team Member']")
	WebElement mapHierTeamTab;
	@FindBy(name = "hierSelect")
	private WebElement hierSelectDDl;
	@FindBy(xpath = "//input[@type='button']")
	private WebElement addBtn;
	@FindBy(xpath = "//img[@alt='Team Search']")
	private WebElement teamSearchImg;
	@FindBy(name = "roleSelect")
	private WebElement salesHierTeamddl;
	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement submitbtn;
	@FindBy(name = "startDateImage")
	private WebElement startDateimg;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement startDateOkbtn;

	@FindBy(name = "endDateImage")
	private WebElement endDateImg;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement endDateOkbtn;
	@FindBy(name = "butSave")
	private WebElement savebutton;

	public MapHierTeamPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * click on Utility Tab
	 */
	public void clickonutitltyTab() {
		driver.switchTo().frame("Menu");
		utitlityTab.click();
	}

	/**
	 * Click on MapHierTitle
	 * 
	 * @throws InterruptedException
	 */
	public void clickonMapHierTitle() throws InterruptedException {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("menu");
		mapHierTeamTab.click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);

	}

	/**
	 * Method for selecting Hierarchy Name
	 * 
	 * @throws InterruptedException
	 */
	public void selectHierName() throws InterruptedException {
		driver.switchTo().frame("utility_main");
		driver.switchTo().frame("content");
		GenericUtils.selectDdlByVisibleText(hierSelectDDl, "AFFILIATE");
		addBtn.click();
		Thread.sleep(3000);
	}

	/**
	 * Method for TeamSearch
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnTeamSearch() throws InterruptedException {

		switchToWindowByIndex(1);
		teamSearchImg.click();
		switchToWindowByIndex(2);
		GenericUtils.selectDdlByVisibleText(salesHierTeamddl,
				"AN18 BANKING - QGSI(11601)");
		Thread.sleep(4000);
		submitbtn.click();

	}

	/**
	 * Method for select Start date
	 */
	public void setStartDate() {

		switchToWindowByIndex(1);
		startDateimg.click();
		switchToWindowByIndex(2);
		startDateOkbtn.click();

	}

	/**
	 * Method for selecting End Date
	 * 
	 * @throws InterruptedException
	 */
	public void setEndDate() throws InterruptedException {

		switchToWindowByIndex(1);
		endDateImg.click();
		Thread.sleep(1000);
		switchToWindowByIndex(2);
		endDateOkbtn.click();
		Thread.sleep(2000);
	}

	/**
	 * Method for clicking on Save Button
	 */
	public void clickOnSaveButton() {
		switchToWindowByIndex(1);
		savebutton.click();
	}

	/**
	 * Switching Between Windows
	 * 
	 * @param index
	 */
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
