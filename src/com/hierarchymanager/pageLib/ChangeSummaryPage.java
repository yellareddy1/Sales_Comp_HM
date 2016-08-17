package com.hierarchymanager.pageLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangeSummaryPage {

	@FindBy(xpath = "//img[@src='/ccshms/images/show-calendar.gif']")
	private WebElement calender;
	
	@FindBy(xpath = "//font/table[2]/tbody/tr[6]/td[7]")
	private WebElement datePicking;
	
	@FindBy(xpath = "//a[@href='javascript:goSearch()']")
	private WebElement goBtn;
	
	/*@FindBy(name = "submit")
	private WebElement submitBtn;
	
	@FindBy(xpath = "//option[contains(text(),'AA - Fin Review Process ADMIN Parent')]")
	private WebElement finReviewText;*/

	
	
	

	public WebElement getCalender() {
		return calender;
	}
	

	public WebElement getDatePicking() {
		return datePicking;
	}

	
	public WebElement getGoBtn() {
		return goBtn;
	}



	
}
