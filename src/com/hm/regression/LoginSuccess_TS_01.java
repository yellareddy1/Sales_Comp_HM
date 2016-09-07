package com.hm.regression;

import com.hm.generic.GenericUtils;
import com.hm.pagerepo.LoginPage;
import com.hm.testconfigu.TestConfigu;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

public class LoginSuccess_TS_01 extends TestConfigu {
	Logger logger = Logger.getLogger("AffiliateLink  Class");
	@Test
	public void loginWithValidInputTC_01() {
		PropertyConfigurator.configure("log4j.properties");
		LoginPage lp = new LoginPage(driver);
		String un = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 0);
		logger.info("Enter username");
		String pass = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 1);
		logger.info("Enter password");
		lp.loginSuccess(un, pass);
		logger.info("Login Successfully");
		lp.logoutSuccess();
		logger.info("Logout Successfully");
	
	
	}

}
