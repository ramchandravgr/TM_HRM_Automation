package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class MyTimeSheets extends Weblibrary {	
	
	@FindBy(xpath = "//select[@id='startDates']")
	public static WebElement drp_SelectDates;
	
	@FindBy(xpath = "//input[@id='btnEdit']")
	public static WebElement btn_Edit;
	
	
	public static void EditTimeSheet()	{
		boolean status = clickElement(btn_Edit);
		logEvent(status, "Edit button clicked", "Edit button not clicked");
	}
	
	
	

}
