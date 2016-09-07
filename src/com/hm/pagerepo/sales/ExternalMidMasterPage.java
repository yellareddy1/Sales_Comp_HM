package com.hm.pagerepo.sales;

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
public class ExternalMidMasterPage {
	WebDriver driver;
	@FindBy(name = "payDateImage")
	private WebElement startDateImg;
	@FindBy(name = "datelist")
	private WebElement dateListDDl;
	@FindBy(name = "deleteCheckBox_1")
	private WebElement ckb;

	public ExternalMidMasterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * Method for Select Stard Date
	 * 
	 * @throws InterruptedException
	 */
	public void startDate() throws InterruptedException {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("agent_main");
		startDateImg.click();
		Thread.sleep(2000);
		switchToWindowByIndex(1);
		GenericUtils.selectDdlByIndex(dateListDDl, 4);
		switchToWindowByIndex(0);

	}

	/**
	 * Method for Deleting Mid Master RelationShip
	 */
	public void deleteMidMasterRel() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("agent_main");
		ckb.click();
	}

	/**
	 * Method for Switching between windows
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
