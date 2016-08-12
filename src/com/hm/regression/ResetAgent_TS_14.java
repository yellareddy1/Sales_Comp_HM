package com.hm.regression;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import com.hm.generic.GenericUtils;
import com.hm.pagerepo.LoginPage;
import com.hm.pagerepo.home.AffiliteLinkPage;
import com.hm.pagerepo.home.UtilityPage;
import com.hm.pagerepo.utility.ResetAgentTabPage;
import com.hm.testconfigu.TestConfigu;

public class ResetAgent_TS_14 extends TestConfigu {
	Logger logger = Logger.getLogger(" ResetAgent");

	@Test
	public void resetAgentBySalesId_TC_14() {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("ResetAgentBySalesId_TC_14 is Start ");
		LoginPage lp = new LoginPage(driver);
		String un = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 0);
		logger.info("Enter username");
		String pass = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 1);
		logger.info("Enter password");
		lp.loginSuccess(un, pass);
		logger.info("Login Successfully");
		AffiliteLinkPage al = new AffiliteLinkPage(driver);
		al.affilitesimpleClick();
		logger.info("click on Affilite Tab");

		UtilityPage ul = new UtilityPage(driver);
		ul.clickonUtitlitytab();
		logger.info("Click on Utitlity Tab");
		ResetAgentTabPage agentpage = new ResetAgentTabPage(driver);
		agentpage.clickOnResetAgentTab();
		logger.info("Click on ResetAgentTab");
		agentpage.enterSalesIdandReset("bq56");
		logger.info("Enter Sales Id and Reset");
		GenericUtils.acceptAlert(driver);
		logger.info("Handle Alert Pop-ups");
		logger.info("ResetAgentBySalesId_TC_14 is Ended");
	}

	@Test()
	public void resetAgentByFirstName_TC_15() throws InterruptedException {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("ResetAgentByFirstName_TC_15 is Started ");
		LoginPage lp = new LoginPage(driver);
		String un = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 0);
		logger.info("Enter username");
		String pass = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 1);
		logger.info("Enter password");
		lp.loginSuccess(un, pass);
		logger.info("Login Successfully");
		
		AffiliteLinkPage al = new AffiliteLinkPage(driver);
		al.affilitesimpleClick();
		logger.info("click on Affilite Tab");
		
		UtilityPage ul = new UtilityPage(driver);
		ul.clickonUtitlitytab();
		logger.info("Click on Utitlity Tab");
		ResetAgentTabPage agentpage = new ResetAgentTabPage(driver);
		agentpage.clickOnResetAgentTab();
		logger.info("Click on ResetAgentTab");
		agentpage.resetByFirstByName("ADAM");
		logger.info("Reset Agent By FirstName");
		GenericUtils.acceptAlert(driver);
		logger.info("ResetAgentByFirstName_TC_15 is Ended");
		

	}

	@Test()
	public void resetAgentByLastName_TC_16() throws InterruptedException {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("ResetAgentByLastName_TC_16 is Started ");
		LoginPage lp = new LoginPage(driver);
		String un = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 0);
		logger.info("Enter username");
		String pass = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 1);
		logger.info("Enter password");
		lp.loginSuccess(un, pass);
		logger.info("Login Successfully");
		AffiliteLinkPage al = new AffiliteLinkPage(driver);
		al.affilitesimpleClick();
		logger.info("click on Affilite Tab");
		UtilityPage ul = new UtilityPage(driver);
		ul.clickonUtitlitytab();
		logger.info("Click on Utitlity Tab");
		ResetAgentTabPage agentpage = new ResetAgentTabPage(driver);
		agentpage.clickOnResetAgentTab();
		logger.info("Click on ResetAgentTab");
		agentpage.resetByLastName("singh");
		logger.info("Reset Agent By LastName");
		GenericUtils.acceptAlert(driver);
		logger.info("ResetAgentByLastName_TC_16 is Ended");
		
	}

}
