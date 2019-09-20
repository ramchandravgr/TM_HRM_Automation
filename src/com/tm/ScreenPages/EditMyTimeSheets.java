package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class EditMyTimeSheets extends Weblibrary{
	
	@FindBy(xpath = "//input[@id='submitSave']")
	public static WebElement btn_Save;
	
	@FindBy(xpath = "//input[@id='btnBack']")
	public static WebElement btn_Cancel;
	
	@FindBy(xpath = "//input[@id='btnAddRow']")
	public static WebElement btn_AddRow;
	
	
	//===========================================
	
	public static void CancelTimeSheet()	{
		boolean status = clickElement(btn_Cancel);
		logEvent(status, "Cancel button clicked", "Cancel button not clicked");
	}
	
	public static void SaveTimeSheet()	{
		boolean status = clickElement(btn_Save);
		logEvent(status, "Save button clicked", "Save button not clicked");
	}	
	
	//===========================================

}
