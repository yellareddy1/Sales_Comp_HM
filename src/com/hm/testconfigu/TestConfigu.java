package com.hm.testconfigu;

import java.io.File;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.hm.generic.GenericUtils;

/**
 * @author ab63599
 * 
 */
public class TestConfigu {
	public WebDriver driver;
	Logger logger = Logger.getLogger("Configuration Class");

	@BeforeMethod
	public void preCondition(Method method) {
		PropertyConfigurator.configure("log4j.properties");
		String teseClassPath = method.getDeclaringClass().getName();

		logger.info(teseClassPath);
		logger.info("****************************************************************************************");
		String testName = method.getName();

		logger.info(testName + " " + "S-T-A-R-T");

		String Browser = GenericUtils.getData("./Test data/data.xlsx",
				"Sheet1", 1, 0);
		String url = GenericUtils.getData("./Test data/data.xlsx", "Sheet1", 2,
				1);

		if (Browser.equals("FF")) {
			// Create a new instance of the FireFox driver
			driver = new FirefoxDriver();
		} else if (Browser.equalsIgnoreCase("GC")) {
			System.setProperty("webdriver.chrome.driver",
					"./Browser Exe/chromedriver.exe");
			// Create a new instance of the Chrome driver
			driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver","C:\\Users\\ab63599\\Desktop\\JarsFolder\\IEDriverServer.exe");
			DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
			ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			ieCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
			ieCapabilities.setCapability("requireWindowFocus", true);
			
			// Create a new instance of the InternetExplorer driver
			driver = new InternetExplorerDriver(ieCapabilities);
		} else if (Browser.equalsIgnoreCase("HTML")) {

		}
		logger.info("Browser Open");
		// Maximize browser
		driver.manage().window().maximize();
		logger.info("Browser maximize");
		// Waiting 30 seconds for an element to be present on the page
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.info("putting implicit wait");
		// Launch the URL
		driver.get(url);

		logger.info("Application is Launching");

	}

	@AfterMethod
	public void postCondition(ITestResult result) {
		/* Take screen shot in case of test failure */
		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File dest = new File("./ScreenShot/image_"
						+ System.currentTimeMillis() + ".png");
				FileUtils.copyFile(src, dest);
			} catch (Exception e) {

			}
		}
		// Close browser
		driver.close();

		// Kill the browser

		driver.quit();
		String teseClassName = result.getMethod().getConstructorOrMethod()
				.getName();

		logger.info(teseClassName + " " + "E--N--D");
		logger.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		logger.info("                                                                                        ");

	}

}
