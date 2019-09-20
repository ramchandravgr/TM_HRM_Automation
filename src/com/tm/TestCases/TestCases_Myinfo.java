package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.BaseClass;
import com.tm.ScreenPages.*;

public class TestCases_Myinfo extends BaseClass{
//================================================================================
	
	@Test
	public void TC205_AddEmergencyContactDetails(){
		
	}
	
	
	//======================================
	@Test
	public void TC203_AddMembership()
	{
		//String[] data = ReadRowData(CurrentTestCaseName);
		
		// Create the page pattern to Login Page
		Login lp = PageFactory.initElements(driver, Login.class);		
		// Create the page pattern to Home Page
		Home hpg = PageFactory.initElements(driver, Home.class);
		
		MyInfo myinfo = PageFactory.initElements(driver, MyInfo.class);
		
		Memberships membership = PageFactory.initElements(driver, Memberships.class);		
		
		// Step 1: Login as a team member
		//lp.LoginHRM(data[0], data[1]);
		lp.LoginHRM("user02", "TM1234");
		hpg.Exist();
				
		//Step 2: Navigate My Info page	
		hpg.NavMyInfo();
		
		//Step 3: Click Membership link
		myinfo.NavMemberships();		
		
		//Step 5: Click Add then Enter Certification details and click Save
		//membership.AddMembership(data[2], data[3], data[4]);
		
		//Step 6: Logout
		//hpg.logOut();
		
	}
	
//================================================================================
	@Test(enabled=false)
	public void TC201_AddWorkExperience() {
		
		//--------------- Initialize pages ----------------------
		// Create the page pattern to Login Page
		Login lp = PageFactory.initElements(driver, Login.class);	
		// Create the page pattern to Home Page
		Home hpg = PageFactory.initElements(driver, Home.class);
		
		MyInfo myinfo = PageFactory.initElements(driver, MyInfo.class);
		
		Qualifications Qualifications = PageFactory.initElements(driver, Qualifications.class);

		
		//-------------- Test Steps ---------------------------
		
		// Step 1: Login as a team member
		lp.LoginHRM("user02", "TM1234");
		hpg.Exist();
		
		//Step 2: Navigate My Info page	
		hpg.NavMyInfo();
		
		//Step 3: Click Qualifications	
		myinfo.NavQualifications();
		
		//Step 4: ClickAdd and enter all required details then click on Save button
		Qualifications.AddExperice();		
		
		//Step 5: Verify Work Experience added
		Qualifications.VerifyWEAdded();
		
		//Step 6: Logout
		hpg.logOut();
	}
	
//================================================================================
	@Test(enabled=false)
	public void TC202_AddDependent()
	{
		//--------------- Initialize pages ----------------------
		// Create the page pattern to Login Page
		Login lp = PageFactory.initElements(driver, Login.class);	
		// Create the page pattern to Home Page
		Home hpg = PageFactory.initElements(driver, Home.class);
				
		MyInfo myinfo = PageFactory.initElements(driver, MyInfo.class);
		
		Dependents dep = PageFactory.initElements(driver, Dependents.class);
		
		//--------------- Start steps -----------------------------
		lp.LoginHRM("user02", "TM1234");
		hpg.NavMyInfo();
		myinfo.NavDependents();
		dep.AddDependent();
		hpg.logOut();	
		
		//--------------- End steps -----------------------------		
		
	}
	
	
//================================================================================
	
	
	
}
