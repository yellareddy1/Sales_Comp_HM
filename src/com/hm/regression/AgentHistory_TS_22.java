package com.hm.regression;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import com.hm.generic.GenericUtils;
import com.hm.pagerepo.LoginPage;
import com.hm.pagerepo.sales.AgentHistoryPage;
import com.hm.pagerepo.sales.SearchPage;
import com.hm.testconfigu.TestConfigu;

public class AgentHistory_TS_22 extends TestConfigu {
	
	Logger logger = Logger.getLogger("AgentHistory  Class");
	@Test(invocationCount=4)
	public void VerifyAgentHistoryTab_TC_28()
	{
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
		abml.enterSalesId(GenericUtils.getData("./Test data/data.xlsx", "Sheet3", 4, 0));
		logger.info("Enter  Sales Id");
		abml.clickonsearch();
		logger.info("Click on Search Button");
		AgentHistoryPage history = new AgentHistoryPage(driver);
		history.clickOnAgentLink();
		history.clickOnHistory();
		logger.info("Click on AgentLink");
		GenericUtils.takeScreenshot(driver, "AgentHistory");
		logger.info("ScreenShot taken for Agent History");
	}

}
