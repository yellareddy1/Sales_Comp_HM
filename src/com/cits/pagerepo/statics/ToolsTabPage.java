package com.cits.pagerepo.statics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolsTabPage {
	public WebDriver driver;
	@FindBy(linkText = "Tools")
	private WebElement toolsTab;

	public ToolsTabPage(WebDriver driver)

	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickOnToolsTab() {
		driver.switchTo().frame("topframe");
		toolsTab.click();
		driver.switchTo().defaultContent();
	}

}
