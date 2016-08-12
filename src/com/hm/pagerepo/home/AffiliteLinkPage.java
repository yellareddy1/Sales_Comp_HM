package com.hm.pagerepo.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AffiliteLinkPage {
	WebDriver driver;
	@FindBy(xpath = "//a[@href='/ccshms/hmsessionparamservlet?Role_HierId=ADMIN_2065_AFFILIATE']")
	private WebElement affiliteLink;

	public AffiliteLinkPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnAffilite() {
		affiliteLink.click();
		driver.switchTo().frame("Menu");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("agent_main");
	}

	public void affilitesimpleClick() {
		affiliteLink.click();
	
	}

}
