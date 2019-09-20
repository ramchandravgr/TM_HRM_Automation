package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.BaseClass;
import com.tm.ScreenPages.EditMyTimeSheets;
import com.tm.ScreenPages.Home;
import com.tm.ScreenPages.Login;
import com.tm.ScreenPages.MyTimeSheets;

public class TestCases_TimeSheets extends BaseClass{
	
	@Test
	public static void TC0001_EditTimeSheet(){
		
		String[] data = ReadRowData(CurrentTestCaseName);
		Login login = PageFactory.initElements(driver, Login.class);		
		Home home = PageFactory.initElements(driver, Home.class);
		MyTimeSheets mytimesheet = PageFactory.initElements(driver, MyTimeSheets.class);
		EditMyTimeSheets edittimesheet = PageFactory.initElements(driver, EditMyTimeSheets.class);
		
		//Step 1: Login
		login.LoginHRM(data[0], data[1]);
		
		//Step 2: Navigate My Time sheets
		home.Exist();
		home.NavMyTimeSheet();
		
		//Step 3: Click Edit
		mytimesheet.EditTimeSheet();
		
		//Step 4: Cancel timesheet
		edittimesheet.CancelTimeSheet();
		
		
		//Step 5: logout
		home.logOut();
	}

}
