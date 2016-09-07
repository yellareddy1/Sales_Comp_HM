package com.hm.regression;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import com.hm.generic.GenericUtils;
import com.hm.pagerepo.LoginPage;
import com.hm.pagerepo.home.AffiliteLinkPage;
import com.hm.pagerepo.home.UtilityPage;
import com.hm.pagerepo.utility.CreateResourcePage;
import com.hm.testconfigu.TestConfigu;

public class CreateResource_TS_20 extends TestConfigu {
	Logger logger = Logger.getLogger("CreateResource  Class");

	@Test(enabled = true)
	public void createNewResource_TC_24() throws InterruptedException {
		PropertyConfigurator.configure("log4j.properties");
		LoginPage lp = new LoginPage(driver);
		logger.info("createNewResource_TC_24 Started");
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
		CreateResourcePage resource = new CreateResourcePage(driver);
		resource.clickOncreateResource();
		logger.info("Click on Create Resource Tab");
		resource.addResource(GenericUtils.getData("./Test data/data.xlsx",
				"Sheet3", 1, 5));
		logger.info("click on add Button and add new Resource");
		resource.setStartDate();
		logger.info("Set the Start Date");
		resource.setEndDate();
		logger.info("Set the End Date");
		resource.setChannelAndOrg();
		logger.info("Select the channel and tierOrg and Save ");
		String msg = GenericUtils.getAlertText(driver);
		System.out.println(msg);
		GenericUtils.acceptAlert(driver);
		logger.info("createNewResource_TC_24 ended");
	}

	@Test(enabled = true)
	public void resourceDetails_TC_25() throws InterruptedException {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("resourceDetails_TC_25 started");
		LoginPage lp = new LoginPage(driver);
		logger.info("createNewResource_TC_24 Started");
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
		CreateResourcePage resource1 = new CreateResourcePage(driver);
		resource1.clickOncreateResource();
		resource1.details();
		logger.info("Click on Resource Details");
		GenericUtils.takeScreenshot(driver, "Resource Details");
	}

}
