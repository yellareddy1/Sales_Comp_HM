package com.cits.regression;

import org.testng.annotations.Test;

import com.cits.generic.GenericUtils;
import com.cits.pagerepo.statics.LoginPage;
import com.cits.pagerepo.statics.ToolsTabPage;
import com.cits.pagerepo.tools.AddViewPage;
import com.cits.testconfigu.TestConfigu;

public class AddView_TS_04 extends TestConfigu
{
 @Test
 public void verifyAddView_TC_04()
 {
	 LoginPage lp = new LoginPage(driver);
	 String un = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 0);
		String pass = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 1);
		lp.unamepass(un, pass);
		lp.submit();
		ToolsTabPage tools = new ToolsTabPage(driver);
		tools.clickOnToolsTab();
		AddViewPage view = new AddViewPage(driver);
		view.clickOnAddViewRadioBtn();
		view.setCuid(GenericUtils.getData("./Test data/data.xlsx", "Sheet3", 1, 0));
		GenericUtils.acceptAlert(driver);
		lp.logoutSuccess();
		
 }
}
