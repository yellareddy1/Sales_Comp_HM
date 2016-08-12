package com.hm.pagerepo.sales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;
	@FindBy(xpath = "//a[@href='/ccshms/hmsessionparamservlet?Role_HierId=ADMIN_2078_ABM']")
	private WebElement abmLink;
	@FindBy(xpath = "//input[@name='agentid']")
	private WebElement salesIdTxtBx;
	@FindBy(name = "lastname")
	private WebElement lastNameTxtBx;
	@FindBy(name = "firstname")
	private WebElement firstNameTxtBx;
	@FindBy(name = "employeeid")
	private WebElement empidTxtBx;
	@FindBy(name = "companyname")
	private WebElement compNameTxtBx;
	@FindBy(name = "agentCUID")
	private WebElement cuidTxtBx;
	@FindBy(name = "secondaryCUID")
	private WebElement sapidTxtBx;
	@FindBy(name = "dealerCode")
	private WebElement dealerCodeTxtBx;
	@FindBy(name = "localSalesCode")
	private WebElement altSalesCodeTxtBx;
	@FindBy(name = "Submit")
	private WebElement searchBtn;
	@FindBy(name = "reset")
	private WebElement clearBtn;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickonABMLink() {
		abmLink.click();
		driver.switchTo().frame("Menu");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("agent_main");
	}

	public void enterSalesId(String sid) {

		salesIdTxtBx.sendKeys(sid);
	}

	public void enterLastName(String lname) {
		lastNameTxtBx.sendKeys(lname);
	}

	public void enterFirstName(String fname) {
		firstNameTxtBx.sendKeys(fname);
	}

	public void enterempid(String eid) {
		empidTxtBx.sendKeys(eid);
	}

	public void entercompanyname(String cname) {
		compNameTxtBx.sendKeys(cname);
	}

	public void entercuid(String cuid) {
		cuidTxtBx.sendKeys(cuid);
	}

	public void entersapid(String sid) {
		sapidTxtBx.sendKeys(sid);
	}

	public void enterdealercode(String dcode) {
		dealerCodeTxtBx.sendKeys(dcode);

	}

	public void enteraltsalescode(String ascode) {
		altSalesCodeTxtBx.sendKeys(ascode);
	}

	public void clickonsearch() {
		searchBtn.click();
	}

	public void clickonclear() {
		clearBtn.click();
	}

	public void clickonsimpleABMlink() {
		abmLink.click();
	}

}
