package com.hm.regression;

import com.hm.pagerepo.sales.SearchPage;
import com.hm.generic.GenericUtils;
import com.hm.pagerepo.LoginPage;
import com.hm.pagerepo.home.AffiliteLinkPage;
import com.hm.testconfigu.TestConfigu;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

public class AffiliateLink_TS_03 extends TestConfigu{
	Logger logger = Logger.getLogger("AffiliateLink  Class");
	@Test
	public void affiliteLink_TC_03()
	{
		PropertyConfigurator.configure("log4j.properties");
		LoginPage lp = new LoginPage( driver);
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
		abml.enterempid(GenericUtils.getData("./Test data/data.xlsx", "Sheet3", 1, 3));
		logger.info("Enter EMPID");
		abml.enteraltsalescode(GenericUtils.getData("./Test data/data.xlsx", "Sheet3", 1, 6));
		logger.info("Enter Sales Code");
		abml.enterdealercode(GenericUtils.getData("./Test data/data.xlsx", "Sheet3", 1, 7));
		logger.info("Enter Dealer Code");
		abml.entersapid(GenericUtils.getData("./Test data/data.xlsx", "Sheet3", 1, 8));
		logger.info("Enter Sapid");
		abml.clickonsearch();
		logger.info("Click on Search Button");
	}

}
