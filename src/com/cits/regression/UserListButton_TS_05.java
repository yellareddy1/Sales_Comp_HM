package com.cits.regression;

import org.testng.annotations.Test;

import com.cits.generic.GenericUtils;
import com.cits.pagerepo.statics.LoginPage;
import com.cits.pagerepo.statics.ToolsTabPage;
import com.cits.pagerepo.tools.AddUserListPage;
import com.cits.testconfigu.TestConfigu;

public class UserListButton_TS_05 extends TestConfigu{
	@Test
	public void verifyUserListBtn_TC_05() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		String un = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 0);
		String pass = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 1);
		lp.unamepass(un, pass);
		lp.submit();
		ToolsTabPage tools = new ToolsTabPage(driver);
		tools.clickOnToolsTab();
		AddUserListPage userList = new AddUserListPage(driver);
		userList.clickOnUserList();
		Thread.sleep(3000);
		driver.navigate().back();
		lp.logoutSuccess();
	}

}
