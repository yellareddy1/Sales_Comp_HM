package com.hm.regression;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import com.hm.generic.GenericUtils;
import com.hm.pagerepo.LoginPage;
import com.hm.pagerepo.sales.RelationShipTypePage;
import com.hm.pagerepo.sales.SearchBySalesIDPage;
import com.hm.testconfigu.TestConfigu;

public class VerifyRelationShipsTab_TS_11 extends TestConfigu {
	Logger logger = Logger.getLogger("VerifyRelationShipsTab Class");

	@Test
	public void verifyRelationShips() throws InterruptedException {
		PropertyConfigurator.configure("log4j.properties");
		LoginPage lp = new LoginPage(driver);
		String un = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 0);
		logger.info("Enter username");
		String pass = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 1);
		logger.info("Enter password");
		lp.loginSuccess(un, pass);
		logger.info("Login Successfully");
		SearchBySalesIDPage sp = new SearchBySalesIDPage(driver);
		sp.clickonABMLink();
		logger.info("click on ABMLink");
		sp.enterSalesId("CBG5");
		logger.info("Enter Sales Id");
		sp.clickonsearch();
		logger.info("Click on Search");
		Thread.sleep(3000);
		RelationShipTypePage relationTab = new RelationShipTypePage(driver);

		relationTab.clickOnCustomerNameLink();
		logger.info("Click on CustomerLink");
		relationTab.clickOnRelationShipsTab();
		logger.info("Click on RelationShipsTab");
		relationTab.clickOnAddBtn();
		logger.info("Click on Add Button");
		relationTab.clickOnSearchImg();
		logger.info("Click On SearchImg");
		relationTab.searchWindow("ADAM");
		logger.info("Enter the Customer");
		relationTab.selectDate();
		logger.info("Select Date ");
		relationTab.selectDate();

		relationTab.clickonSave();
		logger.info("Click on Save");

	}

}
