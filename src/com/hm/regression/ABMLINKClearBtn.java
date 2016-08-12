package com.hm.regression;

import com.hm.generic.GenericUtils;
import com.hm.pagerepo.LoginPage;
import com.hm.pagerepo.sales.SearchPage;
import com.hm.testconfigu.TestConfigu;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

public class ABMLINKClearBtn extends TestConfigu {
	Logger logger = Logger.getLogger("ABMLINKClearBtn  Class");
	@Test
	public void clearBtn() {
		PropertyConfigurator.configure("log4j.properties");
		LoginPage lp = new LoginPage(driver);
		String un = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 0);
		logger.info("Enter username");
		String pass = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 1);
		logger.info("Enter password");
		lp.loginSuccess(un, pass);
		logger.info("Login Successfully");
		
		SearchPage abml = new SearchPage(driver);

		abml.clickonABMLink();
		logger.info("click on ABMLink");
		abml.enterSalesId(GenericUtils.getData("./Test data/data.xlsx", "Sheet3", 1, 0));
		logger.info("Enter  Sales Id");
		abml.enterLastName(GenericUtils.getData("./Test data/data.xlsx", "Sheet3", 1, 1));
		logger.info("Enter LastName");
		abml.enterFirstName(GenericUtils.getData("./Test data/data.xlsx", "Sheet3", 1, 2));
		logger.info("Enter FirstName");
		abml.enterempid(GenericUtils.getData("./Test data/data.xlsx", "Sheet3", 1, 3));
		logger.info("Enter empid");
		abml.entercompanyname(GenericUtils.getData("./Test data/data.xlsx", "Sheet3", 1, 4));
		logger.info("Entercompany Name");
		abml.entercuid(GenericUtils.getData("./Test data/data.xlsx", "Sheet3", 1, 5));
		logger.info("Enter cuid");
		abml.enteraltsalescode(GenericUtils.getData("./Test data/data.xlsx", "Sheet3", 1, 6));
		logger.info("Enter Alternate SalesCode");
		abml.enterdealercode(GenericUtils.getData("./Test data/data.xlsx", "Sheet3", 1, 7));
		logger.info("Enter dealer code");
		abml.entersapid(GenericUtils.getData("./Test data/data.xlsx", "Sheet3", 1, 8));
		logger.info("Enter sapid");
		abml.clickonclear();
		logger.info("click on clear Button");

	}
}
