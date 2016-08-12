package com.hm.regression;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import com.hm.generic.GenericUtils;
import com.hm.pagerepo.LoginPage;
import com.hm.pagerepo.home.AffiliteLinkPage;
import com.hm.pagerepo.utility.MapDetailTitlePage;
import com.hm.testconfigu.TestConfigu;

public class MapDetailTitle_TS_08 extends TestConfigu{
	Logger logger = Logger.getLogger("MapDetailTitle  Class");
	@Test
	public void verifymapDetilTitle_TC_07() throws InterruptedException
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
		 MapDetailTitlePage mdt = new  MapDetailTitlePage(driver);
		 mdt.clickonUtitlitytab();
		logger.info("Click on Utitlity Tab");
		 mdt.clickOnMapDetialTitleTab();;
		 logger.info("Click on MapHierTitle Tab");
		 mdt.selectSalesHierarchyName();
		 logger.info("Select Sales Hierarchy Name");
		 mdt.selectHierarchyItems();
		 logger.info("Select HierarchyItems ");
		 mdt.clickOnAdd();
		 logger.info("Click on Add Button");
		 mdt.selectDetailedTitle();
		 logger.info("select Detailed Title");
		 mdt.setStartDate();
		 logger.info("Enter Start Date");
		 mdt.setEndDate();
		 logger.info("Enter End Date");
		 mdt.clickOnSaveBtn();
		 logger.info("Click on Save Button");
		
		
	}

}
