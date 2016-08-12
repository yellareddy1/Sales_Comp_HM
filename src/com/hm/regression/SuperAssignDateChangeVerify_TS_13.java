package com.hm.regression;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import com.hm.generic.GenericUtils;
import com.hm.pagerepo.LoginPage;
import com.hm.pagerepo.home.AffiliteLinkPage;
import com.hm.pagerepo.sales.RelationShipTypePage;
import com.hm.pagerepo.sales.SearchPage;
import com.hm.pagerepo.sales.SuperAssignDateChangePage;
import com.hm.testconfigu.TestConfigu;

public class SuperAssignDateChangeVerify_TS_13 extends TestConfigu {
	Logger logger = Logger.getLogger("SuperAssignDateChangeVerify Class");

	@Test
	public void verifySuperAssignDate_TC_13() throws InterruptedException {
		PropertyConfigurator.configure("log4j.properties");
		LoginPage lp = new LoginPage(driver);
		logger.info("Login Page is Open");
		String un = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 0);
		String pass = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 1);
		lp.loginSuccess(un, pass);
		logger.info("Enter the username and password and Login Successfully");

		AffiliteLinkPage al = new AffiliteLinkPage(driver);
		al.clickOnAffilite();
		logger.info("click on Affilite ");
		SearchPage abml = new SearchPage(driver);
		abml.enterSalesId("CBG5");
		abml.clickonsearch();
		logger.info("search by Sales Id");
		RelationShipTypePage relationTab = new RelationShipTypePage(driver);
		relationTab.clickOnCustomerNameLink();
		logger.info("click on customer");

		SuperAssignDateChangePage superDate = new SuperAssignDateChangePage(driver);
		superDate.selectsuperAssDate1();
		logger.info("click on superAssignDateImg");
		logger.info("select the assign Date and click ok");
		GenericUtils.acceptAlert(driver);
		logger.info("handle the alert");
		superDate.selectsuperAssDate2();
		logger.info("agin click on superAssignDateImg");
		logger.info("select the date and click on ok");
		logger.info("closed the Browser");

	}

}
