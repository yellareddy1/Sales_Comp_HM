package com.hm.regression;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import com.hm.generic.GenericUtils;
import com.hm.pagerepo.LoginPage;
import com.hm.pagerepo.home.AffiliteLinkPage;
import com.hm.pagerepo.home.UtilityPage;
import com.hm.pagerepo.utility.CreateRegionPage;
import com.hm.testconfigu.TestConfigu;

public class CreateRegion_TS_21 extends TestConfigu {
	Logger logger = Logger.getLogger(" CreateRegion  Class");
	
	@Test(enabled=true)
	public void verifyAddNewRegion_TC_26() throws InterruptedException
	{
		PropertyConfigurator.configure("log4j.properties");
		LoginPage lp = new LoginPage(driver);
		logger.info("verifyAddNewRegion_TC_26 Started");
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
		UtilityPage utilty = new UtilityPage(driver);
		utilty.clickonUtitlitytab();
		logger.info("click on UtilityTab");
		CreateRegionPage region = new CreateRegionPage(driver);
		region.clickonCreateRegion();
		logger.info("click on Create Region Tab");
		region.addNewRegion("Testing HM EVN1");
		logger.info("added new Region");
		String msg= GenericUtils.getAlertText(driver);
		System.out.println(msg);
		GenericUtils.acceptAlert(driver);
		logger.info("verifyAddNewRegion_TC_26 Ended");
	}
	@Test(enabled = true)
	public void verifyRegionUpdate_TC_27() throws InterruptedException
	{
		PropertyConfigurator.configure("log4j.properties");
		LoginPage lp = new LoginPage(driver);
		logger.info("verifyRegionUpdate_TC_27 Started");
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
		UtilityPage utilty = new UtilityPage(driver);
		utilty.clickonUtitlitytab();
		logger.info("click on UtilityTab");
		CreateRegionPage region = new CreateRegionPage(driver);
		region.clickonCreateRegion();
		logger.info("click on Create Region Tab");
		region.updateRegion();
		logger.info("Region is Updated");
		String msg= GenericUtils.getAlertText(driver);
		System.out.println(msg);
		GenericUtils.acceptAlert(driver);
		logger.info("verifyRegionUpdate_TC_27 Ended");
		
		
	}
	
}
