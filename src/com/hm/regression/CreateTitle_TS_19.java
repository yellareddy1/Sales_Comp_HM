package com.hm.regression;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import com.hm.generic.GenericUtils;
import com.hm.pagerepo.LoginPage;
import com.hm.pagerepo.home.AffiliteLinkPage;
import com.hm.pagerepo.home.UtilityPage;
import com.hm.pagerepo.utility.CreateTitlePage;
import com.hm.testconfigu.TestConfigu;

public class CreateTitle_TS_19 extends TestConfigu {
	Logger logger = Logger.getLogger("CreateTitle  Class");

	@Test
	public void verifyCreateTitle_NewTitle_TC_22() throws InterruptedException {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("verifyCreateTitle_NewTitle started");
		LoginPage lp = new LoginPage(driver);
		logger.info("Add Regio TC_16 Started");
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
		CreateTitlePage newTitle = new CreateTitlePage(driver);
		newTitle.clickOnCreateTitle();
		logger.info("Click on Create Title Tab");
		newTitle.clickOnNewTitle();
		logger.info("Clcik on New Title Tab");
		newTitle.enterTheNewTitle("pankaj");
		logger.info("Enter the new Ttitle and Save it");
		String msg = GenericUtils.getAlertText(driver);
		System.out.println(msg);
		GenericUtils.acceptAlert(driver);
		logger.info("verifyCreateTitle_NewTitle ended");

	}

	@Test
	public void verifyCreateTitle_UpdateTitle_TC_23()
			throws InterruptedException {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("verifyCreateTitle_UpdateTitle started");
		LoginPage lp = new LoginPage(driver);
		logger.info("Add Regio TC_16 Started");
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
		CreateTitlePage updateTitle = new CreateTitlePage(driver);
		updateTitle.clickOnCreateTitle();
		logger.info("Click on Create Title Tab");
		updateTitle.clickonTitleName();
		logger.info("click on Title and Update");
		String msg = GenericUtils.getAlertText(driver);
		System.out.println(msg);
		GenericUtils.acceptAlert(driver);
		logger.info("verifyCreateTitle_UpdateTitle ended");

	}

	@Test
	public void verifyCreateTitle_NoDisplayInd_TC_24()
			throws InterruptedException {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("verifyCreateTitle_NoDisplayInd started");
		LoginPage lp = new LoginPage(driver);
		logger.info("Add Regio TC_16 Started");
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
		CreateTitlePage noDisplayIndTitle = new CreateTitlePage(driver);
		noDisplayIndTitle.clickOnCreateTitle();
		logger.info("click on CreateTitle");
		noDisplayIndTitle.clickonTileNameNo();
		logger.info("clcik on no Radio Button And Save Title");
		String msg = GenericUtils.getAlertText(driver);
		System.out.println(msg);
		GenericUtils.acceptAlert(driver);
		logger.info("verifyCreateTitle_NoDisplayInd ended");

	}

}
