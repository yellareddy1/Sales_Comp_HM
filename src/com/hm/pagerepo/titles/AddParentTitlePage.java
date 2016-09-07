package com.hm.pagerepo.titles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hm.generic.GenericUtils;

/**
 * @author ab63599
 * 
 */
public class AddParentTitlePage {
	WebDriver driver;
	@FindBy(xpath = "//a[@href='/ccshms/HMsalesaddnewitemforwardservlet?addFlag=Parent']")
	private WebElement addparenttitletab;
	@FindBy(xpath = "(//tr[td[a[contains(text(),'272 CONSUMER INBOUND')]]]/td)[1]")
	private WebElement customerLink;
	@FindBy(name = "type")
	private WebElement statementType;
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement saveBtn;
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement addSaveBtn;

	public AddParentTitlePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * Used for Clicking on AddParent Title
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnAddparentTitle() throws InterruptedException {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("sales");
		addparenttitletab.click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("text");
		addSaveBtn.click();

	}

	/**
	 * Method to Click on Agent Link
	 * 
	 * @throws InterruptedException
	 */
	public void clickOncoustmerLink() throws InterruptedException {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("menu");
		customerLink.click();
		Thread.sleep(3000);
	}

	/**
	 * Method for selecting Statement type
	 */
	public void selectStatementType() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("text");

		GenericUtils.selectDdlByVisibleText(statementType, "Rmg_Sales_Rep");
	}

	/**
	 * Method for clicking on Save Button
	 */
	public void clickOnSave() {
		saveBtn.click();
	}

}
