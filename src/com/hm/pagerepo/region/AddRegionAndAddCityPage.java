package com.hm.pagerepo.region;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hm.generic.GenericUtils;

/**
 * @author ab63599
 * 
 */
public class AddRegionAndAddCityPage {
	WebDriver driver;
	@FindBy(xpath = "//area[@title='Region Hierarchy']")
	private WebElement regionTab;
	@FindBy(xpath = "//a[contains(text(),'1 FINANCIAL')]")
	private WebElement regionName;
	@FindBy(xpath = "//td[a[img[@alt='Add City']]]")
	private WebElement region;
	@FindBy(xpath = "(//td[a[contains(text(),'AFFILIATE')]])[1]")
	private WebElement hierarchyName;
	@FindBy(xpath = "//td[a[img[@alt='Add Region']]]")
	private WebElement addRegionTab;
	@FindBy(name = "regionNm")
	private WebElement regionNameDdl;
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement saveBtn;
	@FindBy(name = "tierOrg")
	private WebElement tierOrgDdl;
	@FindBy(name = "city")
	private WebElement cityNameDdl;

	public AddRegionAndAddCityPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * Method used for Clicking on Region Tab
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnRegionTab() throws InterruptedException {
		driver.switchTo().frame("Menu");

		regionTab.click();
		Thread.sleep(3000);

	}

	/**
	 * Method used for clicking on Hierarchy Name
	 */
	public void clickonHierarchyName() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("menu");
		hierarchyName.click();
	}

	/**
	 * Used for Clicking on Add Region Tab
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnAddRegionTab() throws InterruptedException {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("sales");
		addRegionTab.click();
		Thread.sleep(4000);
	}

	/**
	 * Method used for selecting Region
	 */
	public void selectRegionName() {

		driver.switchTo().defaultContent();
		driver.switchTo().frame("text");

		GenericUtils.selectDdlByIndex(regionNameDdl, 3);
		saveBtn.click();

	}

	/**
	 * Method used for clicking on Region Name
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnRegion() throws InterruptedException {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("menu");
		regionName.click();
		Thread.sleep(2000);
	}

	/**
	 * Method used for Clicking on Add City Tab
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnAddCity() throws InterruptedException {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("sales");
		region.click();
		Thread.sleep(3000);

	}

	/**
	 * Method is used for Set City Information
	 */
	public void setCityLevelInfo() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("text");
		GenericUtils.selectDdlByIndex(tierOrgDdl, 2);
		GenericUtils.selectDdlByIndex(cityNameDdl, 4);
		saveBtn.click();

	}

}
