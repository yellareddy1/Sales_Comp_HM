package com.cits.regression;

import org.testng.annotations.Test;

import com.cits.generic.GenericUtils;
import com.cits.pagerepo.statics.LoginPage;
import com.cits.pagerepo.statics.ToolsTabPage;
import com.cits.pagerepo.tools.AddAdminPage;
import com.cits.testconfigu.TestConfigu;

public class AddAdmin_TS_02 extends TestConfigu {
	@Test
	public void verifyAddAdmin_TC_02() {
		LoginPage lp = new LoginPage(driver);
		String un = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 0);
		String pass = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 1);
		lp.unamepass(un, pass);
		lp.submit();
		ToolsTabPage tools = new ToolsTabPage(driver);
		tools.clickOnToolsTab();
		AddAdminPage admin = new AddAdminPage(driver);
		admin.clickOnAddAdminRadioBtn();
		admin.setCuid(GenericUtils.getData("./Test data/data.xlsx", "Sheet3", 1, 0));
		GenericUtils.acceptAlert(driver);
		lp.logoutSuccess();
	}

}
