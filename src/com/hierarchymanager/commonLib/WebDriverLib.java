package com.hierarchymanager.commonLib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;




public class WebDriverLib extends Driver {
	
		public void waitForPageToLoad() 
		{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		/*public void waitForElementToBePresent(WebElement element)
		{
			
		}*/
		public void acceptAlert()
		{
			Alert alt = driver.switchTo().alert();
			alt.accept();
		}
		
		
		
		public void multyWindowhandles()
		{
			for (String winHandle : driver.getWindowHandles()) 
			{
			    driver.switchTo().window(winHandle);
			}
		}
		
		
		
		public void frameHandles(WebElement element)
		{
			driver.switchTo().frame(element);
		}
		
		public void SwitchWindow()
		{
			String parentWindow = driver.getWindowHandle();
			System.out.println("inside function");
			Set<String> handles =  driver.getWindowHandles();
			 for(String windowHandle  : handles)
			 {
			   if(!windowHandle.equals(parentWindow))
			    {
			     driver.switchTo().window(windowHandle);
			     System.out.println("successfully switched to next window");
			    }
			  }

		}
}		
		
		
		
		

