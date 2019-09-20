package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.BaseClass;
import com.tm.ScreenPages.ApplyLeave;
import com.tm.ScreenPages.Home;
import com.tm.ScreenPages.Login;
import com.tm.ScreenPages.MyLeave;

public class TestCases_Leave extends BaseClass {

	@Test
	public void TC101_verifyLoginFunctionality() {
		
		//String[] data = ReadRowData(CurrentTestCaseName);
		
		// Create the page pattern to Login Page
		Login lp = PageFactory.initElements(driver, Login.class);
		//Login lp = new Login();
		// Create the page pattern to Home Page
		Home hpg = PageFactory.initElements(driver, Home.class);		

		//lp.LoginHRM(data[0], data[1]);
		lp.LoginHRM("user02", "TM1234");
		hpg.Exist();
		hpg.logOut();
	}
	
	//==============================================================================

	@Test
	public void TC102_ApplyLeave() {
		
		//String[] data = ReadRowData(CurrentTestCaseName);
		
		// Create the pagepattern to Login Page
		Login lp = PageFactory.initElements(driver, Login.class);
		// Create the pagepattern to Home Page
		Home hpg = PageFactory.initElements(driver, Home.class);
		// Create the pagepattern to Apply Leave Page
		ApplyLeave alp = PageFactory.initElements(driver, ApplyLeave.class);
		
		//lp.LoginHRM(data[0], data[1]);
		lp.LoginHRM("user02", "TM1234");
		hpg.Exist();
		hpg.NavApplyLeave();
		alp.applyLeave();
		hpg.logOut();			
	}
	
	//==============================================================================
	@Test
	public void TC103_CancelLeave() {
		// Create the pagepattern to Login Page
		Login lp = PageFactory.initElements(driver, Login.class);
		
		// Create the pagepattern to Home Page
		Home hpg = PageFactory.initElements(driver, Home.class);
		
		// Create the pagepattern to My Leave Page
		MyLeave myleave = PageFactory.initElements(driver, MyLeave.class);
		
		lp.LoginHRM("user02", "TM1234");
		hpg.Exist();
		
		
		
	}
	
	//==============================================================================

}
