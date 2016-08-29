package com.hm.regression;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.hm.generic.GenericUtils;
import com.hm.pagerepo.LoginPage;
import com.hm.pagerepo.home.AffiliteLinkPage;
import com.hm.pagerepo.home.UtilityPage;
import com.hm.pagerepo.utility.WFApprovalPage;
import com.hm.testconfigu.TestConfigu;

public class WFApproval_TS_23 extends TestConfigu {
	Logger logger = Logger.getLogger(" WFApproval  Class");
	@Test
	public void  verifyWFApproval_TC_29() throws FindFailed
	{
		Screen screen = new Screen();
		Pattern img1 = new Pattern("C:\\Users\\ab63599\\Desktop\\SikuliImages\\1.PNG");
		PropertyConfigurator.configure("log4j.properties");
		LoginPage lp = new LoginPage(driver);
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
		WFApprovalPage wf = new WFApprovalPage(driver);
		wf.clickOnWFApproval();
		logger.info("Click on WFApproval Tab");
		wf.selectTheSalesHierId();
		logger.info("Select Sales HierId and Search");
		screen.wait(img1,20);
		screen.click(img1);
		wf.submitForApproval();
		
		
	}

}
