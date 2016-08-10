package com.cits.regression;

import org.testng.annotations.Test;

import com.cits.generic.GenericUtils;
import com.cits.pagerepo.statics.LoginPage;
import com.cits.testconfigu.TestConfigu;

public class LoginSuccess extends TestConfigu{
	@Test
	public void login()
	{
		LoginPage lp = new LoginPage(driver);
		String un = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 0);
		String pass = GenericUtils.getData("./Test data/data.xlsx", "Sheet2", 1, 1);
		lp.unamepass(un, pass);
		lp.submit();
		lp.logoutSuccess();
	}

}
