package com.hm.pagerepo.addinternalsalesperson;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddIntenalAgentPage {
	WebDriver driver;
	@FindBy(xpath = "//a[@href='/ccshms/hmsessionparamservlet?Role_HierId=ADMIN_1044_NBA - GENERAL (CUSTOMER CARE)']")
	private WebElement link;
	@FindBy(xpath = "//a[@href='/ccshms/HMaddqwestagentservlet']")
	private WebElement addInternalSalesPersonTab;
	@FindBy(name = "cuId")
	private WebElement cuidTxtBox;
	@FindBy(xpath = "//a[img[@src='/ccshms/images/MNet.gif']]")
	private WebElement mNetImg;
	@FindBy(css = "input[value*='Ok']")
	private WebElement newAgentOkBtn;
	@FindBy(xpath = "//a[img[@alt='Sales Area Search']]")
	private WebElement salesAreaSearchimg;
	@FindBy(xpath = "//td[a[contains(text(),'Nba External - Telemarketing')]]/following::a[1]")
	private WebElement agentRegion;
	@FindBy(xpath = "//td[input[@value='Select']]")
	private WebElement agentRegionOkBtn;
	@FindBy(xpath = "//a[img[@alt='Agent Title Search']]")
	private WebElement titleSearchImg;
	@FindBy(xpath = "//a[contains(text(),'Telemarketing Vp')]")
	private WebElement agentRole;
	@FindBy(xpath = "//a[img[@alt='Superior Search']]")
	private WebElement superiorSearchImg;
	@FindBy(name = "firstname")
	private WebElement firstNameTxtBx;
	@FindBy(name = "Submit")
	private WebElement submitbtn;
	@FindBy(xpath = "html/body/table/tbody/tr/td/table/tbody/tr/td[4]/table/tbody/tr[3]/td/table/tbody/tr/td[1]/a")
	private WebElement selectSuperior;
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement saveBtn;

	public AddIntenalAgentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/**
	 * This method is used to click on Add Internal Sales Person Tab
	 */
	public void clickonAddInternalSalesPerson() {
		link.click();
		driver.switchTo().frame("Menu");
		addInternalSalesPersonTab.click();
		driver.switchTo().defaultContent();
	}

	/**
	 * This is used Search MNet and Select the Agent
	 * @param cuid
	 * @throws InterruptedException
	 */
	public void searchMNet(String cuid) throws InterruptedException {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("agent_main");
		cuidTxtBox.sendKeys(cuid);
		mNetImg.click();
		Thread.sleep(2000);
		switchToWindowByIndex(1);

		newAgentOkBtn.click();

		switchToWindowByIndex(0);

	}

	/**
	 * used for Search Agent Region and Select the Region
	 * @throws InterruptedException
	 */
	public void searchAgentRegion() throws InterruptedException {
		driver.switchTo().frame("agent_main");
		salesAreaSearchimg.click();
		switchToWindowByIndex(1);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("menu");
		agentRegion.click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();

		driver.switchTo().frame("select");
		((JavascriptExecutor) driver).executeScript("passValue()");
		Thread.sleep(2000);

		switchToWindowByIndex(0);

	}

	/**
	 * used for Search Agent Role and Select the Role
	 * @throws InterruptedException
	 */
	public void searchAgentRole() throws InterruptedException {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("agent_main");
		titleSearchImg.click();
		switchToWindowByIndex(1);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("menu");
		agentRole.click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();

		driver.switchTo().frame("select");
		((JavascriptExecutor) driver).executeScript("passValue()");
		Thread.sleep(2000);
		switchToWindowByIndex(0);

	}

	/**
	 * used for Select Superior 
	 * @param fName
	 * @throws InterruptedException
	 */
	public void searchSuperior(String fName) throws InterruptedException {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("agent_main");
		superiorSearchImg.click();
		switchToWindowByIndex(1);
		firstNameTxtBx.sendKeys(fName);
		submitbtn.click();
		Thread.sleep(2000);
		selectSuperior.click();
		switchToWindowByIndex(0);

	}

	/**
	 * used for save the created Agent
	 */
	public void createIntenalAgent() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("agent_main");
		saveBtn.click();
		driver.switchTo().defaultContent();
	}

	/**
	 * This method used for Switching Between Windows
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
