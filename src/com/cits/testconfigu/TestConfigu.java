package com.cits.testconfigu;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.cits.generic.GenericUtils;

public class TestConfigu {
	public WebDriver driver;

	@BeforeMethod
	public void preCondition() {

		String Browser = GenericUtils.getData("./Test Data/data.xlsx", "Sheet1", 1, 0);
		String url = GenericUtils.getData("./Test Data/data.xlsx", "Sheet1", 1, 1);

		if (Browser.equals("FF")) {
			driver = new FirefoxDriver();
		} else if (Browser.equalsIgnoreCase("GC")) {
			System.setProperty("webdriver.chrome.driver", "./Browser Exe/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "./Browser Exe/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(url);

	}

	@AfterMethod
	public void postCondition(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File dest = new File("./ScreenShot/image_" + System.currentTimeMillis() + ".png");
				FileUtils.copyFile(src, dest);
			} catch (Exception e) {

			}
		}

		driver.quit();
	}

}



