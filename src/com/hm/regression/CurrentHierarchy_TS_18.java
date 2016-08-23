package com.hm.regression;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import com.hm.generic.GenericUtils;
import com.hm.pagerepo.LoginPage;
import com.hm.pagerepo.home.AffiliteLinkPage;
import com.hm.pagerepo.home.SalesTabPage;
import com.hm.testconfigu.TestConfigu;

public class CurrentHierarchy_TS_18 extends TestConfigu {
	Logger logger = Logger.getLogger("CurrentHierarchy  Class");

	@Test
	public void verifyCurrentHierarchy_TC_21() {
		PropertyConfigurator.configure("log4j.properties");
		LoginPage lp = new LoginPage(driver);
		logger.info("Add Regio TC_16 Started");
		String un = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1,
				0);
		logger.info("Enter username");
		String pass = GenericUtils.getData("./Test data/data.xlsx", "Sheet2",
				1, 1);
		logger.info("Enter password");
		lp.loginSuccess(un, pass);
		logger.info("Login Successfully");
		AffiliteLinkPage al = new AffiliteLinkPage(driver);
		al.affilitesimpleClick();
		logger.info("click on Affilite Tab");
		SalesTabPage sales = new SalesTabPage(driver);
		sales.clickOnSalesPersonTab();
		logger.info("click on Sales Person Tab");
		GenericUtils.takeScreenshot(driver, "current Hierarchy Details");
		logger.info("Screen Shot taken");

	}

}
