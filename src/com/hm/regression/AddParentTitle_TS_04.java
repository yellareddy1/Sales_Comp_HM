package com.hm.regression;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;
import com.hm.generic.GenericUtils;
import com.hm.pagerepo.LoginPage;
import com.hm.pagerepo.home.AffiliteLinkPage;
import com.hm.pagerepo.titles.AddParentTitlePage;
import com.hm.pagerepo.titles.TitleTabPage;
import com.hm.testconfigu.TestConfigu;

public class AddParentTitle_TS_04 extends TestConfigu {
	Logger logger = Logger.getLogger("AddParentTitle  Class");
	@Test(invocationCount=1)
	public void clickOnTitleTab() throws InterruptedException {
		PropertyConfigurator.configure("log4j.properties");
		LoginPage lp = new LoginPage(driver);
		
		String un = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 0);
		logger.info("Enter username");
		String pass = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 1);
		logger.info("Enter password");
		lp.loginSuccess(un, pass);
		logger.info("Login Successfully");

		AffiliteLinkPage ap = new AffiliteLinkPage(driver);
		ap.affilitesimpleClick();
		logger.info("click onAffilite Link");
		TitleTabPage tp = new TitleTabPage(driver);
		tp.clickonTitleTab();
		logger.info("click on Title Tab");
		
		Thread.sleep(4000);
		AddParentTitlePage apt = new AddParentTitlePage(driver);
		apt.clickOncoustmerLink();
		logger.info("Click on Customer Link");
		apt.selectStatementType();
		logger.info("Select Statement Type");
		apt.clickOnSave();
		logger.info("click on Save Button");
		GenericUtils.acceptAlert(driver);
		logger.info("Handle the Alert");
		apt.clickOnAddparentTitle();
		logger.info("click on AddparentTitle Tab");
		logger.info("Click on Save ");
		

	}

}
