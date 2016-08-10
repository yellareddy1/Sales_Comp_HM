package com.cits.regression;

import org.testng.annotations.Test;

import com.cits.generic.GenericUtils;
import com.cits.pagerepo.statics.LoginPage;
import com.cits.pagerepo.statics.ToolsTabPage;
import com.cits.pagerepo.tools.AddRVMPage;
import com.cits.testconfigu.TestConfigu;

public class AddRVM_TS_01 extends TestConfigu {
	@Test
	public void verifyAddRVM_TC_01()
	{
		LoginPage lp = new LoginPage(driver);
		String un = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 0);
		String pass = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 1);
		lp.unamepass(un, pass);
		lp.submit();
		ToolsTabPage tools = new ToolsTabPage(driver);
		tools.clickOnToolsTab();
		AddRVMPage addRvM = new AddRVMPage(driver);
		addRvM.clickOnAddRVMRadioBtn();
		addRvM.setValue(GenericUtils.getData("./Test data/data.xlsx", "Sheet3", 1, 0),"XXXX");
		GenericUtils.acceptAlert(driver);
		lp.logoutSuccess();
	}
}
