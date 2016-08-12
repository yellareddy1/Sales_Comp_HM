package com.hm.regression;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import com.hm.generic.GenericUtils;
import com.hm.pagerepo.LoginPage;
import com.hm.pagerepo.sales.SearchBySalesIDPage;
import com.hm.testconfigu.TestConfigu;

public class SearchBySalesIdVerif_TS_07 extends TestConfigu {
	Logger logger = Logger.getLogger("ABMLINKClearBtn  Class");
	@Test
	public void verifySearch_TC_06() {
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
		sp.enterSalesId(GenericUtils.getData("./Test data/data.xlsx", "Sheet3", 2, 1));
		logger.info("Enter  Sales Id");
		sp.clickonsearch();
		logger.info("Click on Search Button");
		sp.clickOnRMGLink();
		logger.info("Click on Customer");
	
		

	}

}
