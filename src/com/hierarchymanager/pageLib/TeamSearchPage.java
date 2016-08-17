package com.hierarchymanager.pageLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeamSearchPage {
	
	@FindBy(xpath ="//form[@name='frmTeamMemberSearchType']/input[contains(@onclick,'ACTIVE')][1]")
	private WebElement radioActiveTeam;
	
	@FindBy(name="byTeamName")
	private WebElement TeamName;

	@FindBy(name="bySalesRepId")
	private WebElement TeamSalesRepId;

	@FindBy(name="byTeamId")
	private WebElement TeamId;
	

	@FindBy(name="bySalesRepFirstName")
	private WebElement SalesRepFirstName;

	@FindBy(xpath = "//input[@value='go']")
	private WebElement GoButton;
	
	@FindBy(xpath = "//input[@name='appliedFilter']")
	private WebElement appliedFilter;
	
	@FindBy(xpath="//div/table/tbody/tr[4]/td[2][text()='10040']")
	private WebElement teamIdResult;

	public WebElement getteamIdResult() {
		return teamIdResult;
	}
	
	public WebElement getAppliedFilter() {
		return appliedFilter;
	}

	public WebElement getRadioActiveTeam() {
		return radioActiveTeam;
	}

	public WebElement getTeamName() {
		return TeamName;
	}

	public WebElement getTeamSalesRepId() {
		return TeamSalesRepId;
	}

	public WebElement getTeamId() {
		return TeamId;
	}

	public WebElement getSalesRepFirstName() {
		return SalesRepFirstName;
	}

	public WebElement getGoButton() {
		return GoButton;
	}
	
		
	}
