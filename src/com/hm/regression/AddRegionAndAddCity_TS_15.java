package com.hm.regression;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import com.hm.generic.GenericUtils;
import com.hm.pagerepo.LoginPage;
import com.hm.pagerepo.home.AffiliteLinkPage;
import com.hm.pagerepo.region.AddRegionAndAddCityPage;
import com.hm.testconfigu.TestConfigu;

public class AddRegionAndAddCity_TS_15 extends TestConfigu {
	Logger logger = Logger.getLogger("AddRegionAndAddCity  Class");
	@Test(invocationCount=1)
	public void addRegion_TC_16() throws InterruptedException
	{
		PropertyConfigurator.configure("log4j.properties");
		
		LoginPage lp = new LoginPage( driver);
		logger.info("Add Regio TC_16 Started");
		String un = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 0);
		logger.info("Enter username");
		String pass = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 1);
		logger.info("Enter password");
		lp.loginSuccess(un, pass);
		logger.info("Login Successfully");
		AffiliteLinkPage al = new AffiliteLinkPage(driver);
		al.affilitesimpleClick();
		logger.info("click on Affilite Tab");
		AddRegionAndAddCityPage region = new AddRegionAndAddCityPage(driver);
		region.clickOnRegionTab();
		logger.info("Click on Region Tab");
		Thread.sleep(3000);
		region.clickonHierarchyName();
		logger.info("Click on HierarchyLink");
		region.clickOnAddRegionTab();
		logger.info("Click on AddRegion");
		region.selectRegionName();
		logger.info("Select Region Name");
		logger.info("add Region TC16 Ended");
		
		
	}
	@Test(invocationCount=1)
	public void addCity_TC_17() throws InterruptedException
	{
		PropertyConfigurator.configure("log4j.properties");
		LoginPage lp = new LoginPage( driver);
		logger.info("Addcity TC_17 Started");
		String un = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 0);
		logger.info("Enter username");
		String pass = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 1);
		logger.info("Enter password");
		lp.loginSuccess(un, pass);
		logger.info("Login Successfully");
		AffiliteLinkPage al = new AffiliteLinkPage(driver);
		al.affilitesimpleClick();
		logger.info("click on Affilite Tab");
		AddRegionAndAddCityPage region = new AddRegionAndAddCityPage(driver);
		region.clickOnRegionTab();
		logger.info("Click on Region Tab");
		Thread.sleep(3000);
		AddRegionAndAddCityPage region1 = new AddRegionAndAddCityPage(driver);
		region1.clickOnRegion();
		logger.info("Click on Region Name");
		region1.clickOnAddCity();
		logger.info("Click on AddCity tab");
		region1.setCityLevelInfo();
		logger.info("Set the City Level Information");
		GenericUtils.acceptAlert(driver);
		logger.info("addCity TC17 Ended");
		
	}
	
 
}
