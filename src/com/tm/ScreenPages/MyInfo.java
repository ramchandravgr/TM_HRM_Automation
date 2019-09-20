package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.tm.Libraries.Weblibrary;

public class MyInfo extends Weblibrary{
	
	//Qualifications link Webelement
	@FindBy(how = How.XPATH, using = "//a[text()='Qualifications']")
	public static WebElement link_Qualifications;
	
	//Memberships link Webelement
	@FindBy(how = How.XPATH, using = "//a[text()='Memberships']")
	public static WebElement link_Memberships;
	
	//Dependents link Webelement
	@FindBy(how = How.XPATH, using = "//a[text()='Dependents']")
	public static WebElement link_Dependents;
	
	
	@FindBy(how = How.XPATH, using = "//a[text()='Emergency Contacts']")
	public static WebElement link_EmergencyContacts;
	
	
	
	//-------------------------------
	public void NavQualifications() {
		boolean status;
		
		status = clickElement(link_Qualifications);
		logEvent(status, "User able to click on Qualifications link", "Unable to click on Qualifications link");
	}
	
	
	public void NavDependents() {
		boolean status;
		
		status = clickElement(link_Dependents);
		logEvent(status, "User able to click on Dependents link", "Unable to click on Dependents link");
	}
	
	public void NavMemberships() {
		boolean status;
		
		status = clickElement(link_Memberships);
		logEvent(status, "User able to click on Memberships link", "Unable to click on Memberships link");
	}
 //-----------------------------------------------
	

}
