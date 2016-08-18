package com.hm.pagerepo.region;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hm.generic.GenericUtils;

public class AddRegionAndAddCityPage {
	WebDriver driver;
	@FindBy(xpath = "//area[@title='Region Hierarchy']")
	WebElement regionTab;
	@FindBy(name="sub4")
	WebElement regionName;
	@FindBy(xpath="//td[a[img[@alt='Add City']]]")
	WebElement region;
	@FindBy(xpath="(//td[a[contains(text(),'AFFILIATE')]]/a)[2]")
	WebElement hierarchyName;
	@FindBy(xpath="//td[a[img[@alt='Add Region']]]")
	WebElement addRegionTab;
	@FindBy(name = "regionNm")
	WebElement regionNameDdl;
	@FindBy(xpath = "//input[@value='Save']")
	WebElement saveBtn;
	@FindBy(name="tierOrg")
	WebElement tierOrgDdl;
	@FindBy(name="city")
	WebElement cityNameDdl;
	
	
		
	

	public AddRegionAndAddCityPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnRegionTab() {
		driver.switchTo().frame("Menu");

		regionTab.click();

	}

	public void clickonHierarchyName() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("menu");
		hierarchyName.click();
	}

	public void clickOnAddRegionTab() throws InterruptedException {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("sales");
		addRegionTab.click();
		Thread.sleep(4000);
	}

	public void selectRegionName() {
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("text");

		GenericUtils.selectDdlByIndex(regionNameDdl, 3);
		saveBtn.click();

	}
	public void clickOnRegion() throws InterruptedException
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame("menu");
		regionName.click();
		 Thread.sleep(2000);
	}
	public void clickOnAddCity() throws InterruptedException
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame("sales");
		region.click();
		Thread.sleep(3000);
		
		
	}
	public void setCityLevelInfo()
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame("text");
		GenericUtils.selectDdlByIndex(tierOrgDdl, 2);
		GenericUtils.selectDdlByIndex(cityNameDdl, 4);
		saveBtn.click();
		
		
	}

}
