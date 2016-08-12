package com.hm.regression;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import com.hm.generic.GenericUtils;
import com.hm.pagerepo.LoginPage;
import com.hm.pagerepo.sales.SearchPage;
import com.hm.pagerepo.titles.AddChildTitlePage;
import com.hm.pagerepo.titles.TitleTabPage;
import com.hm.testconfigu.TestConfigu;

public class AddChildTitleVerify_TS_06 extends TestConfigu {
	Logger logger = Logger.getLogger("ABMLINKClearBtn  Class");
	@Test(invocationCount = 1)
	public void verifyChildTitle() throws InterruptedException {
		PropertyConfigurator.configure("log4j.properties");
		LoginPage lp = new LoginPage(driver);
		String un = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 0);
		logger.info("Enter username");
		String pass = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 1);
		logger.info("Enter password");
		lp.loginSuccess(un, pass);
		logger.info("Login Successfully");
		SearchPage ab = new SearchPage(driver);
		ab.clickonsimpleABMlink();
		logger.info("click on ABMLink");
		TitleTabPage tp = new TitleTabPage(driver);
		tp.clickonTitleTab();
		logger.info("click on Title Tab");
		Thread.sleep(4000);
		AddChildTitlePage acp = new AddChildTitlePage(driver);
		acp.clickOnABMLink();
		logger.info("click on Link");
		acp.addChildTitle();
		logger.info("click on AddChildTitle");
	}

}
