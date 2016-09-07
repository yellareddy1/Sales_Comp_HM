package com.hm.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * @author ab63599
 *
 */

public class GenericUtils {
	
	public WebDriver driver;

	
	/**
	 * select item from a list by index value
	 * @param ddl
	 * @param index
	 */
	public static void selectDdlByIndex(WebElement ddl, int index) {
		Select sct = new Select(ddl);
		sct.selectByIndex(index);

	}

	 
	/**
	 * select item by value
	 * @param ddl
	 * @param value
	 */
	
	public static void selectDdlByValue(WebElement ddl, String value) {
		Select sct = new Select(ddl);
		sct.selectByValue(value);
	}

	 
	/**
	 * select item by visibleText
	 * @param ddl
	 * @param visibleText
	 */
	public static void selectDdlByVisibleText(WebElement ddl, String visibleText) {
		Select sct = new Select(ddl);
		sct.selectByVisibleText(visibleText);
	}

	
	/**
	 *  deSelect item by index
	 * @param ddl
	 * @param index
	 */
	public static void deselectByIndex(WebElement ddl, int index) {
		Select sct = new Select(ddl);
		sct.deselectByIndex(index);
	}

	
	/**
	 * deSelect item by value
	 * @param ddl
	 * @param value
	 */
	public static void deselectByValue(WebElement ddl, String value) {
		Select sct = new Select(ddl);
		sct.deselectByValue(value);
	}

	
	/**
	 * deSelect item by VisibleText
	 * @param ddl
	 * @param visibleText
	 */
	public static void deselectByVisibleText(WebElement ddl, String visibleText) {
		Select sct = new Select(ddl);
		sct.deselectByVisibleText(visibleText);
	}

	 
	/**
	 * deSelect all selected item
	 * @param ddl
	 */
	public static void deselectAll(WebElement ddl) {
		Select sct = new Select(ddl);
		sct.deselectAll();
	}

	
	/**
	 * Handle Alert pop-ups
	 * @param driver
	 */
	public static void acceptAlert(WebDriver driver)

	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

	 
	/**
	 * handle confirmation pop-ups
	 * @param driver
	 */
	public static void dismiss(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}

	// 
	/**
	 * handle Alert prompt pop-ups
	 * @param driver
	 * @param text
	 */
	public static void enterText(WebDriver driver, String text) {
		Alert alt = driver.switchTo().alert();
		alt.sendKeys(text);
	}

	
	/**
	 * get text from Alert
	 * @param driver
	 * @return
	 */
	public static String getAlertText(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		String data = alt.getText();
		return data;
	}
	
	/**
	 * Switching from one Window to Other
	 * @param index
	 */
	public  void switchToWindowByIndex(int index){
		int count =0;
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			driver.switchTo().window(window);
			if(count==index){
				System.out.println("Switched into window :: "+index);
				break;
			}
			count++;
		}
	}
		
		
		
	
	
	
		
	

	
	/**
	 *  read data from an excel sheet
	 * @param filePath
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 */
	public static String getData(String filePath, String sheetName, int rowIndex, int cellIndex) {
		String data = null;
		try {
			File f = new File(filePath);
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet st = wb.getSheet(sheetName);
			Row r = st.getRow(rowIndex);
			Cell c = r.getCell(cellIndex);
			data = c.toString();
		}

		catch (Exception e) {

		}
		return data;
	}

	 
	/**
	 * write in excel sheet
	 * @param filepath
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @param data
	 */
	public static void setData(String filepath, String sheetName, int rowIndex, int cellIndex, String data) {
		try {
			File f = new File(filepath);
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet st = wb.getSheet(sheetName);
			Row r = st.getRow(rowIndex);
			Cell c = r.createCell(cellIndex);
			c.setCellValue(data);

			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);

		} catch (Exception e) {

		}
	}

	 
	/**
	 * perform left click
	 * @param element
	 */
	public void click(WebElement element) {
		Actions act = new Actions(driver);
		act.click(element).perform();
	}

	 
	/**
	 * perform right click
	 * @param element
	 */
	public void contextClick(WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).perform();

	}

	 
	/**
	 * method for double click
	 * @param element
	 */
	public void doubleClick(WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();

	}

	 
	/**
	 * method for mouse hover
	 * @param element
	 */
	public void moveToElment(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	 
	/**
	 * Method to take screenshot
	 * @param driver
	 * @param screenshotName
	 * @return
	 */
	public static String takeScreenshot(WebDriver driver, String screenshotName) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			String dest = ("./ScreenShot/folder" + screenshotName + ".png");
			File destination = new File(dest);
			FileUtils.copyFile(src, destination);
			System.out.println("ScreenShot taken");
			return dest;

		} catch (Exception e) {
			System.out.println("Exception while taking screenShot" + e.getMessage());
			return e.getMessage();
		}

	}

	
	/**
	 *  Handling Synchronization or Ajax Object
	 * @param driver
	 * @param xpath
	 * @param time
	 * @return
	 */
	public static WebElement isElementPresent(WebDriver driver, String xpath, int time) {
		WebElement ele = null;
		for (int i = 0; i < time; i++) {
			try {
				ele = driver.findElement(By.xpath(xpath));
				break;
			} catch (Exception e) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					System.out.println("waiting for element to appear on DOM");
				}
			}

		}
		return ele;

	}
	

}
