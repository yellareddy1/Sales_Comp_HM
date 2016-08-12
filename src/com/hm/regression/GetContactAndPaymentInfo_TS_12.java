package com.hm.regression;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import com.hm.generic.GenericUtils;
import com.hm.pagerepo.LoginPage;
import com.hm.pagerepo.home.AffiliteLinkPage;
import com.hm.pagerepo.sales.ContactandPaymentInfoTabPage;
import com.hm.pagerepo.sales.SearchPage;
import com.hm.testconfigu.TestConfigu;

public class GetContactAndPaymentInfo_TS_12 extends TestConfigu {
	Logger logger = Logger.getLogger("GetContactAndPaymentInfo  Class");
	@Test
	public void getInfo_TC_12() throws InterruptedException {
		PropertyConfigurator.configure("log4j.properties");
		LoginPage lp = new LoginPage(driver);
		String un = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 0);
		logger.info("Enter username");
		String pass = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 1);
		logger.info("Enter password");
		lp.loginSuccess(un, pass);
		logger.info("Login Successfully");
		AffiliteLinkPage al = new AffiliteLinkPage(driver);
		al.clickOnAffilite();
		logger.info("click on Affilite Tab");
		SearchPage abml = new SearchPage(driver);
		abml.enterFirstName("ADAM");
		logger.info("Enter First Name of Sales Person");
		abml.clickonsearch();
		logger.info("Click on Search Button");
		ContactandPaymentInfoTabPage info = new ContactandPaymentInfoTabPage(driver);
		info.ClickOnSalePersonName();
		logger.info("Click on Sales Person");
		info.clickOnContacttab();
		logger.info("Click on Contact Tab");
		info.contactInfoSalesMember("John", "234567812", "12345", "john@gmail.com", "32/1 11 Street", "Vegas",
				"1000123", "123sr");
		logger.info("Enter all the vale");
		GenericUtils.acceptAlert(driver);
		logger.info("handle the Alert");
		info.clickOnPaymentTab();
		logger.info("Click on Payment Tab ");
		info.paymentInfoSalesMember("Pankaj", "1324", "12345", "12334", "citibankacc", "12346", "12345678912",
				"New York");
		logger.info("Enter all the payment form value");

	}

}
