package com.hm.pagerepo.sales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author ab63599
 * 
 */
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

	/**
	 * Method for Clicking on ABM
	 */
	public void clickonABMLink() {
		abmLink.click();
		driver.switchTo().frame("Menu");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("agent_main");
	}

	/**
	 * Method for entering Sales id under ABM
	 * 
	 * @param sid
	 */
	public void enterSalesId(String sid) {

		salesIdTxtBx.sendKeys(sid);
	}

	/**
	 * Method for Enter last Name of Agent
	 * 
	 * @param lname
	 */
	public void enterLastName(String lname) {
		lastNameTxtBx.sendKeys(lname);
	}

	/**
	 * Method for Entering First Name of Agent
	 * 
	 * @param fname
	 */
	public void enterFirstName(String fname) {
		firstNameTxtBx.sendKeys(fname);
	}

	/**
	 * Enter EMP id
	 * 
	 * @param eid
	 */
	public void enterempid(String eid) {
		empidTxtBx.sendKeys(eid);
	}

	/**
	 * Enter Company
	 * 
	 * @param cname
	 */
	public void entercompanyname(String cname) {
		compNameTxtBx.sendKeys(cname);
	}

	/**
	 * Enter Cuid
	 * 
	 * @param cuid
	 */
	public void entercuid(String cuid) {
		cuidTxtBx.sendKeys(cuid);
	}

	/**
	 * Enter Sap id
	 * 
	 * @param sid
	 */
	public void entersapid(String sid) {
		sapidTxtBx.sendKeys(sid);
	}

	/**
	 * Enter Deal code
	 * 
	 * @param dcode
	 */
	public void enterdealercode(String dcode) {
		dealerCodeTxtBx.sendKeys(dcode);

	}

	/**
	 * enter internal sale id
	 * 
	 * @param ascode
	 */
	public void enteraltsalescode(String ascode) {
		altSalesCodeTxtBx.sendKeys(ascode);
	}

	/**
	 * click on search Button
	 */
	public void clickonsearch() {
		searchBtn.click();
	}

	/**
	 * click on clear button
	 */
	public void clickonclear() {
		clearBtn.click();
	}

	/**
	 * click on only ABMlink
	 */
	public void clickonsimpleABMlink() {
		abmLink.click();
	}

}
