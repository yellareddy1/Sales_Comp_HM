package com.hm.pagerepo.sales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hm.generic.GenericUtils;

/**
 * @author ab63599
 * 
 */
public class ContactandPaymentInfoTabPage {
	WebDriver driver;
	@FindBy(xpath = "html/body/table/tbody/tr/td/table/tbody/tr/td[3]/table/tbody/tr[5]/td/table/tbody/tr[1]/td[1]/a/font/b")
	private WebElement salesPersonName;
	@FindBy(xpath = "html/body/form/map/area[2]")
	private WebElement contactTab;
	@FindBy(name = "contactName")
	private WebElement nameTxtBox;
	@FindBy(name = "phoneNumber")
	private WebElement phnoneNoTxtBox;
	@FindBy(name = "faxNumber")
	private WebElement faxTxtBox;
	@FindBy(name = "emailAddress")
	private WebElement emailTxtBox;
	@FindBy(name = "address")
	private WebElement addressTxtBox;
	@FindBy(name = "city")
	private WebElement cityTxtBox;
	@FindBy(name = "hiddenState")
	private WebElement stateDDl;
	@FindBy(name = "zip")
	private WebElement zipTxtBox1;
	@FindBy(name = "taxId")
	private WebElement taxIdTxtBox;
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement saveBtn;
	@FindBy(xpath = "html/body/form/map/area[3]")
	private WebElement paymentInfo;
	@FindBy(name = "vendor")
	private WebElement venderTxtBox;
	@FindBy(name = "hiddenGlAccountNumber")
	private WebElement glDdl;
	@FindBy(name = "remittance")
	private WebElement remittanceTxtBox;
	@FindBy(name = "hiddenDirectDeposit")
	private WebElement aPFundTrsfrDDl;
	@FindBy(name = "apGlUnitCode")
	private WebElement aPGLUnitCodeTxtBox;
	@FindBy(name = "apGlDeptRcCode")
	private WebElement aPGLDeptRCCode;
	@FindBy(name = "bankAccountName")
	private WebElement bankAccnameTxtBox;
	@FindBy(name = "bankRoutingNumber")
	private WebElement bankRoutingNo;
	@FindBy(name = "bankAccountNumber")
	private WebElement bankAccTxBox;
	@FindBy(name = "bankLocation")
	private WebElement bankLocTxtBox;
	@FindBy(name = "companyCode")
	private WebElement compCodeDdl;
	@FindBy(name = "costCenter")
	private WebElement costCenterDdl;
	@FindBy(name = "geoCode")
	private WebElement geoCodeDdl;
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement saveBtnP;

	public ContactandPaymentInfoTabPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * Method for clicking on Sales Person Name
	 */
	public void ClickOnSalePersonName() {

		salesPersonName.click();

	}

	/**
	 * used for Clicking on Contact Tab
	 */
	public void clickOnContacttab() {

		contactTab.click();

	}

	/**
	 * used for clicking on Payment Tab
	 */
	public void clickOnPaymentTab() {

		paymentInfo.click();
	}

	/**
	 * Method for filling the contact info of Sales Member
	 * 
	 * @param name
	 * @param phn
	 * @param faxNo
	 * @param email
	 * @param address
	 * @param city
	 * @param zip
	 * @param taxId
	 * @throws InterruptedException
	 */
	public void contactInfoSalesMember(String name, String phn, String faxNo,
			String email, String address, String city, String zip, String taxId)
			throws InterruptedException {
		nameTxtBox.sendKeys(name);
		phnoneNoTxtBox.sendKeys(phn);
		faxTxtBox.sendKeys(faxNo);
		emailTxtBox.sendKeys(email);
		addressTxtBox.sendKeys(address);
		cityTxtBox.sendKeys(city);
		GenericUtils.selectDdlByVisibleText(stateDDl, "New York");
		zipTxtBox1.sendKeys(zip);
		taxIdTxtBox.sendKeys(taxId);
		saveBtn.click();
		Thread.sleep(4000);
	}

	/**
	 * Used for filling payment info of Sales Member
	 * 
	 * @param venName
	 * @param remit
	 * @param uncode
	 * @param rcCode
	 * @param accName
	 * @param rNumber
	 * @param acc
	 * @param loc
	 * @throws InterruptedException
	 */
	public void paymentInfoSalesMember(String venName, String remit,
			String uncode, String rcCode, String accName, String rNumber,
			String acc, String loc) throws InterruptedException {
		venderTxtBox.sendKeys(venName);
		GenericUtils.selectDdlByIndex(glDdl, 1);
		remittanceTxtBox.sendKeys(remit);
		GenericUtils.selectDdlByIndex(aPFundTrsfrDDl, 1);
		aPGLUnitCodeTxtBox.sendKeys(uncode);
		aPGLDeptRCCode.sendKeys(rcCode);
		bankAccnameTxtBox.sendKeys(accName);
		bankRoutingNo.sendKeys(rNumber);
		bankAccTxBox.sendKeys(acc);
		bankLocTxtBox.sendKeys(loc);
		Thread.sleep(4000);
		GenericUtils.selectDdlByIndex(compCodeDdl, 0);
		GenericUtils.selectDdlByIndex(geoCodeDdl, 0);
		saveBtnP.click();

	}

}
