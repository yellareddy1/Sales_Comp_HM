package com.hm.pagerepo.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author ab63599
 * 
 */
public class CreateTitlePage {
	WebDriver driver;
	@FindBy(xpath = "//a[img[@alt='Title List']]")
	private WebElement createTitleTab;
	@FindBy(xpath = "//td[img[@src='/ccshms/images/newtitle.gif']]")
	private WebElement newTitleTab;
	@FindBy(name = "titleName")
	private WebElement titleNameTxtBox;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement savebtn;
	@FindBy(xpath = "//a[text()='12345NEW']")
	private WebElement titleNameLink;
	@FindBy(xpath = "//input[@value='N']")
	private WebElement displayIndNobtn;

	public CreateTitlePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * Method for clicking on Create Tilte Tab
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnCreateTitle() throws InterruptedException {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("menu");
		createTitleTab.click();
		Thread.sleep(2000);
	}

	/**
	 * Method for clicking on New Title Tab
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnNewTitle() throws InterruptedException {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("utility_main");
		driver.switchTo().frame("content");
		newTitleTab.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);

	}

	/**
	 * Method for Enter new Title Info
	 * 
	 * @param name
	 */
	public void enterTheNewTitle(String name) {

		driver.switchTo().frame("utility_main");
		driver.switchTo().frame("update");
		titleNameTxtBox.sendKeys(name);
		savebtn.click();

	}

	/**
	 * Method for click on Title Name
	 * 
	 * @throws InterruptedException
	 */
	public void clickonTitleName() throws InterruptedException {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("utility_main");
		driver.switchTo().frame("content");
		titleNameLink.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame("utility_main");
		driver.switchTo().frame("update");
		savebtn.click();
	}

	/**
	 * Click on TitleName without Info
	 * 
	 * @throws InterruptedException
	 */
	public void clickonTileNameNo() throws InterruptedException {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("utility_main");
		driver.switchTo().frame("content");
		titleNameLink.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("utility_main");
		driver.switchTo().frame("update");
		displayIndNobtn.click();
		savebtn.click();

	}

}
