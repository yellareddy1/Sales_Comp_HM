package com.hierarchymanager.commonLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ReportLib extends Driver{
	
	public void getScreenshot() throws IOException {
		EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
		File srcImgFile = edriver.getScreenshotAs(OutputType.FILE);
		File destnImgFile = new File("C:\\SELENIUM\\Sales Compensation\\ScreenShot");
		FileUtils.copyDirectory(srcImgFile, destnImgFile);

	
		
	}

}
