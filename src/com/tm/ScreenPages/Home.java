package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.tm.Libraries.Weblibrary;

public class Home extends Weblibrary {	
		
	//Logout link Webelement
	@FindBy(how = How.XPATH, using = "//a[text()='Logout']")
	public static WebElement link_Logout;

	// Welcome button link Webelement
	@FindBy(how = How.ID, using = "welcome")
	public static WebElement link_Welcome;

	// Leave tab Webelement
	@FindBy(how = How.XPATH, using = "//b[text()='Leave']")
	public static WebElement link_Leave;

	// Apply link Webelement
	@FindBy(how = How.XPATH, using = "//a[text()='Apply']")
	public static WebElement link_Apply;
	
	// MyInfo link Webelement
	@FindBy(how = How.XPATH, using = "//a[@id='menu_pim_viewMyDetails']")
	public static WebElement link_MyInfo;
	
	// Time link Webelement
	@FindBy(how = How.XPATH, using = "//a[@id='menu_time_viewTimeModule']")
	public static WebElement link_Time;
	
	@FindBy(how = How.XPATH, using = "//a[@id='menu_time_Timesheets']")
	public static WebElement link_TimeSheets;
	
	@FindBy(how = How.XPATH, using = "//a[@id='menu_time_viewMyTimesheet']")
	public static WebElement link_MyTimeSheets;
	
	

	
//=======================================================================
	public void Exist() {
		boolean status;
		status = isExist(link_Welcome);
		logEvent(status, "user able to Login Sucessfully", "Unable to login ");
	}
	
 //-----------------------------------------------
	public void NavMyInfo() {
		boolean status;
		
		status = clickElement(link_MyInfo);
		logEvent(status, "User able to click on Myinfo link", "Unable to click on Myinfo link");
	}
 //-----------------------------------------------
	public void NavApplyLeave() {
		boolean status;
		status = moveToElement(link_Leave);
		logEvent(status, "User able to moveto the leave tab", "User unable to moveto the leave tab");
	
		wait(1);
		status = clickElement(link_Apply);
		logEvent(status, "User able to click on Apply link", "Unable to click on Apply link");
	}
	
//------------------------------------------------
	public void NavMyTimeSheet() {
		boolean status;
		status = moveToElement(link_Time);
		logEvent(status, "User able to moveto the Time tab", "User unable to move to the Time tab");
	
		wait(1);
		
		status = moveToElement(link_TimeSheets);
		logEvent(status, "User able to moveto the TimeSheets tab", "User unable to move to the TimeSheets tab");
		
		wait(1);
		
		status = clickElement(link_MyTimeSheets);
		logEvent(status, "User able to click on MyTimeSheets link", "Unable to click on MyTimeSheets link");
	}
	
 //-----------------------------------------------	
	public void logOut()
	{
		boolean status;
		
		status=clickElement(link_Welcome);
		logEvent(status, "user able to click the Welcome user link", "user unable to click the Welcome user link");
			
		status=clickElement(link_Logout);
		logEvent(status, "User able to sucessfully logout", "Unable to logout ");			
	}

	//==========================================================================
}
