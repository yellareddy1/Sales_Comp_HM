package com.hm.regression;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import com.hm.generic.GenericUtils;
import com.hm.pagerepo.LoginPage;
import com.hm.pagerepo.addinternalsalesperson.AddIntenalAgentPage;
import com.hm.testconfigu.TestConfigu;

public class AddInternalAgent_TS_16 extends TestConfigu{
	Logger logger = Logger.getLogger("AddInternalAgent  Class");
	@Test
	public void addInternalAgentVerify_TC_18() throws InterruptedException
	{
		PropertyConfigurator.configure("log4j.properties");
		LoginPage lp = new LoginPage( driver);
		String un = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 0);
		logger.info("Enter username");
		String pass = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 1);
		logger.info("Enter password");
		lp.loginSuccess(un, pass);
		logger.info("Login Successfully");
		AddIntenalAgentPage internalAgent = new AddIntenalAgentPage(driver);
		internalAgent.clickonAddInternalSalesPerson();
		logger.info("Click on AddInternalSales PersonTab");
		internalAgent.searchMNet("aa97834");
		logger.info("Enter Cuid and Search MNet");
		
		internalAgent.searchAgentRegion();
		logger.info("Search AgentRegion ");
		internalAgent.searchAgentRole();
		logger.info("Search Agent Role");
		internalAgent.searchSuperior("%%");
		logger.info("Search Agent by First Nmae");
		
		internalAgent.createIntenalAgent();
		logger.info("Add New Internal Agent");
		GenericUtils.acceptAlert(driver);
		
	}

}
