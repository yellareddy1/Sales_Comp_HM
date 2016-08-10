package com.cits.regression;

import org.testng.annotations.Test;

import com.cits.generic.GenericUtils;
import com.cits.pagerepo.statics.LoginPage;
import com.cits.pagerepo.statics.ToolsTabPage;
import com.cits.pagerepo.tools.AddSuperPage;
import com.cits.testconfigu.TestConfigu;

public class AddSuper_TS_03 extends TestConfigu {
	@Test
	public void verifyAddSuper_TC_03()
	{
		LoginPage lp = new LoginPage(driver);
		String un = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 0);
		String pass = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 1);
		lp.unamepass(un, pass);
		lp.submit();
		ToolsTabPage tools = new ToolsTabPage(driver);
		tools.clickOnToolsTab();
		AddSuperPage supers = new AddSuperPage(driver);
		supers.clickOnAddSuperRadioBtn();
		supers.setCuid(GenericUtils.getData("./Test data/data.xlsx", "Sheet3", 1, 0));
		lp.logoutSuccess();
	}

}
