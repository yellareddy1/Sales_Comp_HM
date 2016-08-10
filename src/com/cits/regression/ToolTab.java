package com.cits.regression;

import org.testng.annotations.Test;

import com.cits.generic.GenericUtils;
import com.cits.pagerepo.statics.LoginPage;
import com.cits.pagerepo.statics.ToolsTabPage;
import com.cits.testconfigu.TestConfigu;

public class ToolTab extends TestConfigu{
	
	@Test
	public void testToolTab()
	{
		LoginPage lp = new LoginPage(driver);
		String un = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 0);
		String pass = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 1);
		lp.unamepass(un, pass);
		lp.submit();
		ToolsTabPage tools = new ToolsTabPage(driver);
		tools.clickOnToolsTab();
	}

}
