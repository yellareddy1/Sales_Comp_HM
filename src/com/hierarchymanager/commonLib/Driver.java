package com.hierarchymanager.commonLib;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver {
	
	static WebDriver driver = null;
	
	public static WebDriver fireFoxDriver()
	{
		if(driver != null)
		{
			return driver;
		}
		else
		{
			driver = new FirefoxDriver();
			return driver;
		}
	}

	public static WebDriver configureDriver(){
		if(driver != null)
		{
			return driver;
		}
		else
		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\aa99840\\Desktop\\JARS\\IEDriverServer.exe");
			DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
			ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			ieCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
			driver = new InternetExplorerDriver(ieCapabilities);
			//driver = new InternetExplorerDriver();
			return driver;
		}
	}
	public static WebDriver fireFoxProfileDriver()
	{
		WebDriver driver=null;
		
		FirefoxProfile profile = new FirefoxProfile();  
		profile.setPreference("browser.download.folderList",1);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/xls");		
		driver = new FirefoxDriver(profile);
		return driver;
	}
	
	
}
	 
	