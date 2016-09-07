package com.hm.regression;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.hm.generic.GenericUtils;
import com.hm.pagerepo.HMHelpAndDataHelpPage;
import com.hm.pagerepo.LoginPage;
import com.hm.testconfigu.TestConfigu;

public class HMHelpAndDataHelpVerify_TS_17 extends TestConfigu {
	Logger logger = Logger.getLogger("HMHelpAndDataHelpVerify  Class");

	@Test
	public void verifyHMHelp_TC_19() throws FindFailed {
		PropertyConfigurator.configure("log4j.properties");
		Screen screen = new Screen();
		Pattern totextboximg = new Pattern(
				"C:\\Users\\ab63599\\Desktop\\SikuliImages\\To1.PNG");
		Pattern subTxtBoxImg = new Pattern("C:\\Users\\ab63599\\subject.PNG");
		//Pattern sendBtnImg = new Pattern(
			//	"C:\\Users\\ab63599\\Desktop\\SikuliImages\\send.PNG");
		LoginPage lp = new LoginPage(driver);
		logger.info("verifyHmHelp Started");
		String un = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1,
				0);
		logger.info("Enter username");
		String pass = GenericUtils.getData("./Test data/data.xlsx", "Sheet2",
				1, 1);
		logger.info("Enter password");
		lp.loginSuccess(un, pass);
		logger.info("Login Successfully");
		HMHelpAndDataHelpPage hmhelp = new HMHelpAndDataHelpPage(driver);
		hmhelp.clickOnHMHelp();
		logger.info("click on HMHelp");
		screen.wait(totextboximg, 20);

		screen.type(totextboximg, "pankajkumar.singh@centuryLink.com");
		screen.wait(subTxtBoxImg, 20);
		screen.type(subTxtBoxImg, "Testing Automation_ITV");
		// screen.click(sendBtnImg );

	}

	@Test
	public void verifyDataHelp_TC_20() throws FindFailed {
		PropertyConfigurator.configure("log4j.properties");
		Screen screen = new Screen();
		Pattern totextboximg1 = new Pattern(
				"C:\\Users\\ab63599\\Desktop\\SikuliImages\\To1.PNG");
		Pattern subTxtBoxImg1 = new Pattern("C:\\Users\\ab63599\\subject.PNG");
		//Pattern sendBtnImg1 = new Pattern(
				//"C:\\Users\\ab63599\\Desktop\\SikuliImages\\send.PNG");
		LoginPage lp = new LoginPage(driver);
		logger.info("VerifyDataHelp Started");
		String un = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1,
				0);
		logger.info("Enter username");
		String pass = GenericUtils.getData("./Test data/data.xlsx", "Sheet2",
				1, 1);
		logger.info("Enter password");
		lp.loginSuccess(un, pass);
		logger.info("Login Successfully");
		HMHelpAndDataHelpPage hmhelp = new HMHelpAndDataHelpPage(driver);
		hmhelp.clickOnDataHelp();
		logger.info("click on DataHelp");
		screen.wait(totextboximg1, 20);

		screen.type(totextboximg1, "pankajkumar.singh@centuryLink.com");
		screen.wait(subTxtBoxImg1, 20);
		screen.type(subTxtBoxImg1, "Testing Automation_ITV");
		// screen.click(sendBtnImg1 );
	}

}
