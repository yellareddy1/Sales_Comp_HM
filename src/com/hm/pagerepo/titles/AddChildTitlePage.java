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
public class AddChildTitlePage {
	WebDriver driver;
	@FindBy(name = "sub1")
	private WebElement abmLink;
	@FindBy(partialLinkText = "ABM")
	private WebElement aBmLink;
	@FindBy(xpath = "//img[@alt='Add Child Title']")
	private WebElement addChildTitleTab;
	@FindBy(name = "role")
	private WebElement roleTitleDdl;
	@FindBy(name = "repManager")
	private WebElement managerRBtn;
	@FindBy(name = "type")
	private WebElement stmTypeDdl;
	@FindBy(name = "abbTitle")
	private WebElement abbTitleDdl;
	@FindBy(name = "repTitleSegmentId")
	private WebElement segmentTypeDdl;
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement saveBtn;

	public AddChildTitlePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * Method for clicking on ABM Link
	 */
	public void clickOnABMLink() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("menu");
		aBmLink.click();

	}

	/**
	 * Method for AddChildTitle
	 */
	public void addChildTitle() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("sales");
		addChildTitleTab.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("text");
		GenericUtils.selectDdlByIndex(roleTitleDdl, 2);
		managerRBtn.click();
		GenericUtils.selectDdlByIndex(stmTypeDdl, 3);
		GenericUtils.selectDdlByIndex(abbTitleDdl, 1);
		GenericUtils.selectDdlByIndex(segmentTypeDdl, 2);
		saveBtn.click();

	}

}
