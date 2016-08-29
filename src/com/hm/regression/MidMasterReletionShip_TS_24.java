package com.hm.regression;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.hm.generic.GenericUtils;
import com.hm.pagerepo.LoginPage;
import com.hm.pagerepo.sales.ExternalMidMasterPage;
import com.hm.pagerepo.sales.SearchBySalesIDPage;
import com.hm.testconfigu.TestConfigu;

public class MidMasterReletionShip_TS_24 extends TestConfigu {
	Logger logger = Logger.getLogger(" MidMasterReletionShip  Class");

	@Test
	public void verifyMidRelationShip_TC_30() throws FindFailed,
			InterruptedException {
		Screen screen = new Screen();
		Pattern img1 = new Pattern(
				"C:\\Users\\ab63599\\Desktop\\SikuliImages\\nameLink.PNG");
		Pattern masterRelTab = new Pattern(
				"C:\\Users\\ab63599\\Desktop\\SikuliImages\\midmaster.PNG");
		Pattern addBtn = new Pattern(
				"C:\\Users\\ab63599\\Desktop\\SikuliImages\\addmm.PNG");
		Pattern searchMidImg = new Pattern(
				"C:\\Users\\ab63599\\Desktop\\SikuliImages\\search.PNG");
		Pattern comSearchtxt = new Pattern(
				"C:\\Users\\ab63599\\Desktop\\SikuliImages\\comName.PNG");
		Pattern searchBtn = new Pattern(
				"C:\\Users\\ab63599\\Desktop\\SikuliImages\\sea.PNG");
		Pattern aLink = new Pattern(
				"C:\\Users\\ab63599\\Desktop\\SikuliImages\\cu.PNG");
		Pattern okBtn = new Pattern(
				"C:\\Users\\ab63599\\Desktop\\SikuliImages\\ok.PNG");
		Pattern saveBtn = new Pattern(
				"C:\\Users\\ab63599\\Desktop\\SikuliImages\\save.PNG");

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
		SearchBySalesIDPage searchPage = new SearchBySalesIDPage(driver);
		searchPage.clickonABMLink();
		logger.info("Click on AffiliteLink");
		searchPage.enterSalesId("AJBJ");
		logger.info("Enter the Sales Id");
		searchPage.clickonsearch();
		logger.info("Click on Search ");
		screen.wait(img1, 10);
		screen.click(img1);
		logger.info("Click on Agent Name Link");
		screen.wait(masterRelTab, 10);
		screen.click(masterRelTab);
		screen.wait(addBtn, 10);
		screen.click(addBtn);
		screen.wait(searchMidImg, 10);
		screen.click(searchMidImg);
		screen.wait(comSearchtxt, 10);
		screen.type(comSearchtxt, "%%");
		screen.wait(searchBtn, 10);
		screen.click(searchBtn);
		screen.wait(aLink, 20);
		screen.click(aLink);
		ExternalMidMasterPage midMaster = new ExternalMidMasterPage(driver);
		midMaster.startDate();
		logger.debug("Click on StartDate Select the Date");
		screen.wait(okBtn, 20);
		screen.click(okBtn);
		screen.wait(saveBtn, 10);
		screen.click(saveBtn);

	}

}
