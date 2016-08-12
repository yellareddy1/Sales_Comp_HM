package com.hm.regression;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import com.hm.generic.GenericUtils;
import com.hm.pagerepo.LoginPage;
import com.hm.pagerepo.home.AffiliteLinkPage;
import com.hm.pagerepo.utility.MapHierTeamPage;
import com.hm.testconfigu.TestConfigu;

public class MapHierTeamVerify_TS_10 extends TestConfigu{
	Logger logger = Logger.getLogger(" MapHierTeamVerify  Class");
	@Test
	public void verifyMapHierTeam_TC_10() throws InterruptedException
	{
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
		logger.info("click on Affilite Tab");
		MapHierTeamPage hierTeam = new MapHierTeamPage(driver);
		hierTeam.clickonutitltyTab();
		 logger.info("Click on Utitlity Tab");
		hierTeam.clickonMapHierTitle();
		logger.info("Click on MapHierTitle Tab");
		hierTeam.selectHierName();
		logger.info("Select HierName");
		hierTeam.clickOnTeamSearch();
		logger.info("Clcik on Team Search");
		hierTeam.setStartDate();
		logger.info("Enter the Start Date");
		hierTeam.setEndDate();
		logger.info("Enter the End Date");
		hierTeam.clickOnSaveButton();
		logger.info("Clcik on Save Button");
		//GenericUtils.acceptAlert(driver);
		
	}

}
