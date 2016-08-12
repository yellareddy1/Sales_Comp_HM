package com.hm.regression;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import com.hm.generic.GenericUtils;
import com.hm.pagerepo.LoginPage;
import com.hm.pagerepo.home.AffiliteLinkPage;
import com.hm.pagerepo.utility.UserTitlePage;
import com.hm.testconfigu.TestConfigu;

public class UserTitle_TS_05 extends TestConfigu {
	Logger logger = Logger.getLogger("UserTitle Class");

	@Test
	public void userVerifyAddingAdimAndViewAll_TC05() {
		PropertyConfigurator.configure("log4j.properties");
		LoginPage lp = new LoginPage(driver);
		String un = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 0);
		logger.info("Enter username");
		String pass = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 1);
		logger.info("Enter password");
		lp.loginSuccess(un, pass);
		logger.info("Login Successfully");
		AffiliteLinkPage alp = new AffiliteLinkPage(driver);
		alp.affilitesimpleClick();
		logger.info("click on Affilite Tab");
		UserTitlePage utp = new UserTitlePage(driver);
		utp.clickonUtitlitytab();
		logger.info("Click on Utitlity Tab");
		utp.entercuid();
		logger.info("Enter CUID");
		utp.clickOnAddNewRole();
		logger.info("Click on AddNewRole");
		utp.checkAdminGroup();
		logger.info("Check AdminGroup");
		utp.clickonSubmit();
		logger.info("Click on Submit");

	}

}
