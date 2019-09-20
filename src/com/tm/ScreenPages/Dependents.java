package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.tm.Libraries.Weblibrary;

public class Dependents extends Weblibrary{
	
	//Add button Field Web element
	@FindBy(how = How.XPATH, using = "//input[@id='btnAddDependent']")
	public static WebElement btn_AddDependent;
	
	//Name edit Field Web element
	@FindBy(how = How.XPATH, using = "//input[@id='dependent_name']")
	public static WebElement Edit_DependentName;
	
	//Relationship dropdown Field Web element
	@FindBy(how = How.XPATH, using = "//select[@id='dependent_relationshipType']")
	public static WebElement list_RelType;
	
	//Save button Field Web element
	@FindBy(how = How.XPATH, using = "//input[@id='btnSaveDependent']")
	public static WebElement btn_Save;
	//===================================================
	
	public void AddDependent()
	{
		boolean status;
		//Click Add
		status = clickElement(btn_AddDependent);
		logEvent(status, "Add dependent button clicked", "Add dependent button not clicked");
		
		//Enter Name
		status = setText(Edit_DependentName, "Naveen");
		logEvent(status, "Name entered", "Name not entered");
		
		//Select Relationship
		status = selectByText(list_RelType, "Child");
		logEvent(status, "Relationship selected", "Relationship not selected");
		
		//Click Save
		status = clickElement(btn_Save);
		logEvent(status, "Save button clicked", "Save button not clicked");		
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
