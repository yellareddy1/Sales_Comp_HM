package com.hm.pagerepo.sales;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hm.generic.GenericUtils;

public class SuperAssignDateChangePage {
	WebDriver driver;
	@FindBy(xpath = "(//img[@src='/ccshms/images/show-calendar.gif'])[2]")
	private WebElement superAssignDateImg;
	@FindBy(name = "datelist")
	private WebElement selectDateDdl;
	@FindBy(css = "input[value*='OK']")
	private WebElement okBtn;
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement saveBtn;

	public SuperAssignDateChangePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void selectsuperAssDate1() throws InterruptedException {
		superAssignDateImg.click();
		switchToWindowByIndex(1);
		GenericUtils.selectDdlByIndex(selectDateDdl, 2);
		okBtn.click();
		switchToWindowByIndex(0);
		Thread.sleep(2000);
        driver.switchTo().frame("agent_main");
		saveBtn.click();

	}

	public void selectsuperAssDate2() throws InterruptedException {

		superAssignDateImg.click();
		switchToWindowByIndex(1);
		GenericUtils.selectDdlByIndex(selectDateDdl, 2);
		okBtn.click();
		switchToWindowByIndex(0);
		Thread.sleep(2000);
        driver.switchTo().frame("agent_main");
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
