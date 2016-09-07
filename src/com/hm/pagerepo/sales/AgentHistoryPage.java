package com.hm.pagerepo.sales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author ab63599
 * 
 */
public class AgentHistoryPage {
	WebDriver driver;
	@FindBy(xpath = "//area[@alt='History']")
	WebElement historyTab;
	@FindBy(xpath = "//tr[td[a]]")
	WebElement agentNameLink;

	public AgentHistoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * Used for clicking on History Tab
	 */
	public void clickOnHistory() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("agent_main");
		historyTab.click();

	}

	/**
	 * Used for clicking on Selected Agent
	 */
	public void clickOnAgentLink() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("agent_main");
		agentNameLink.click();

	}

}
