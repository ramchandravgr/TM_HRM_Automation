package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.tm.Libraries.Weblibrary;

public class Memberships extends Weblibrary{
	
	// Add button
	@FindBy(how = How.XPATH, using = "//input[@id='btnAddMembershipDetail']")
	public static WebElement btn_Addbutton;
	
	// Certification dropdown
	@FindBy(how = How.XPATH, using = "//select[@id='membership_membership']")
	public static WebElement drp_Certification;
	
	// Amount paid by dropdown
	@FindBy(how = How.XPATH, using = "//select[@id='membership_subscriptionPaidBy']")
	public static WebElement drp_AmountPaidBy;
	
	// Amount paid text box
	@FindBy(how = How.XPATH, using = "//input[@id='membership_subscriptionAmount']")
	public static WebElement edit_AmountPaid;
	
	// Save button
	@FindBy(how = How.XPATH, using = "//input[@id='btnSaveMembership']")
	public static WebElement btn_Savebutton;
	
	//-------------------------------------------------
	
	public void AddMembership(String cert, String Amtpaidby, String amount)
	{
		boolean status;
		
		status = clickElement(btn_Addbutton);
		logEvent(status, "User able to click on Add button", "Unable to click on Add button");
		
		status = selectByText(drp_Certification, cert);
		logEvent(status, "User able to seelct certification", "Unable to seelct certification");
		
		status = selectByText(drp_AmountPaidBy, Amtpaidby);
		logEvent(status, "User able to seelct Amount paid By", "Unable to select Amount paid By");
		
		status = setText(edit_AmountPaid, amount);
		logEvent(status, "User able to enter Amount", "Unable to enter Amount");
		
		status = clickElement(btn_Savebutton);
		logEvent(status, "User able to click on Save button", "Unable to click on Save button");
	}
			
			
			

}
