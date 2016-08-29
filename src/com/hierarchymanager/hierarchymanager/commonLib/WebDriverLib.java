package com.hierarchymanager.commonLib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;




public class WebDriverLib extends Driver {
	
		Robot robot=null;
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
		
		
		public boolean verifyText(String expected,String actual)
		{
			boolean flag = false;
			if(actual.contains(expected))
			{
				flag = true;
			}
			return flag;	
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
		
		
		
		public void fileDownload() throws AWTException, InterruptedException
		{
	      try{
	    	   robot=new Robot();
	    	   System.out.println("Successfully Downloaded");
	         }
	      catch (AWTException e) 
	      {
	    	  e.printStackTrace();
	    	  System.out.println("Download Failed");
	      }
	      robot.keyPress(KeyEvent.VK_DOWN);
	       robot.keyPress(KeyEvent.VK_ENTER);
		}
		
		public void specifyFilePathToUpload(String filePath) 
		{
			StringSelection stringSelection = new StringSelection(filePath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		}
		
		public void fileUpload() throws AWTException, InterruptedException {
			
				try
				{
					
					robot = new Robot(); 
					Thread.sleep(2000);       
					   // Press Enter 
					robot.keyPress(KeyEvent.VK_ENTER); 
					   // Release Enter 
					robot.keyRelease(KeyEvent.VK_ENTER);   
					   // Press CTRL+V 
					robot.keyPress(KeyEvent.VK_CONTROL); 
					robot.keyPress(KeyEvent.VK_V); 
					   // Release CTRL+V 
					robot.keyRelease(KeyEvent.VK_CONTROL); 
					robot.keyRelease(KeyEvent.VK_V);
					 Thread.sleep(2000);                 
					   //Press Enter 
					robot.keyPress(KeyEvent.VK_ENTER); 
					robot.keyRelease(KeyEvent.VK_ENTER);
					System.out.println("File is Uploaded Successfully");					
				}
				catch(Exception e)
				{
					System.out.println("File Uploading Failed");
				}			   
			
		}
		
		/*public void mouseOverOperation(WebElement wb)
		{
			Actions actObj = new  Actions(driver);
			actObj.moveToElement(wb);
		}*/
		
		
		/*public void getDropdownValue(WebElement wbElemnt,String expText)
		{
			try
			{
				Select sel = new Select(wbElemnt);
				List<WebElement> lst = sel.getOptions();
				for(int i = 0; i < lst.size(); i++)
			  {
				  String actualText = lst.get(i).getText();
				  if(expText.equals(actualText))
				  {
					 sel.selectByVisibleText(expText);
					 System.out.println("Dropdown value is selected");
				  }
					
			  }
			}
			catch(Exception e)
			{
				System.out.println("Dropdown value is failed to select");
			}
		}*/
}
		
		

