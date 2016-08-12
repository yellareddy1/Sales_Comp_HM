package com.hm.regression;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import com.hm.generic.GenericUtils;
import com.hm.pagerepo.LoginPage;
import com.hm.pagerepo.home.NewHierarchyPage;
import com.hm.testconfigu.TestConfigu;

public class NewHierarchyVerify_TS_09 extends TestConfigu {
	Logger logger = Logger.getLogger("NewHierarchyVerify");

	@Test
	public void verifyNewHierarchy_TC_09() {
		PropertyConfigurator.configure("log4j.properties");
		LoginPage lp = new LoginPage(driver);
		String un = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 0);
		logger.info("Enter username");
		String pass = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 1);
		logger.info("Enter password");
		lp.loginSuccess(un, pass);
		logger.info("Login Successfully");
		NewHierarchyPage newHier = new NewHierarchyPage(driver);
		newHier.clickonNewHierarchyTab();
		logger.info("Click on NewHierarchyTab");
		newHier.enterNewHierarchyInformation(GenericUtils.getData("./Test data/data.xlsx", "Sheet3", 1, 2),
				GenericUtils.getData("./Test data/data.xlsx", "Sheet3", 1, 3));
		logger.info("Enter NewHierarchy Information");
		GenericUtils.acceptAlert(driver);
		logger.info("Handle Alert Pop-Ups");
		lp.logoutSuccess();
		logger.info("Logout Successfully");

	}

}
