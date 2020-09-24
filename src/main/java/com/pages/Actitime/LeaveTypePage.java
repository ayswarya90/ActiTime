package com.pages.Actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.Actitime.AutoConstant;
import com.generics.Actitime.BasePage;
import com.generics.Actitime.ExcelLibrary;

public class LeaveTypePage extends BasePage implements AutoConstant {
	
	@FindBy(xpath="//span[.='Sick']")
	private WebElement editLeaveTypeLink;
	
	@FindBy(xpath="(//input[@class='inputDiv'])[2]")
	private WebElement leaveTypeTextField;
	
	@FindBy(xpath="(//div[@class='applyButton'])[2]")
	private WebElement applyButtoneditButton;
	
	@FindBy(xpath="(//div[@class='cancelButton'])[3]")
	private WebElement closebuttoneditButton;
	
	@FindBy(xpath="//span[.='Create Leave Type']")
	private WebElement createleaveTypeButton;
	
	@FindBy(xpath="//span[.='Sick123']/../../../../../..//td[contains(@class,'leaveTypeDeleteCell')]")
	private WebElement deleteLeaveTypeButton;
	
	@FindBy(xpath="//span[.='Sick123']/../../../../../..//span[@class='leaveTypeStatusSpan leaveTypeInfoText']")
	private WebElement changeStatusButton;
	
	public LeaveTypePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createLeavetypeMethod()
	{
		createleaveTypeButton.click();
	}
	
	public void deleteLeaveTypeMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		deleteLeaveTypeButton.click();
	}
	public void okpopUpHandling() throws InterruptedException
	{
		Thread.sleep(3000);
		okAlertHandling();
	}
	
	public void cancelpopUpHandling() throws InterruptedException
	{
		Thread.sleep(3000);
		dismissAlertHandling();
	}
	
	public void editLeaveTypeMethod() throws InterruptedException,IOException
	{
		Thread.sleep(2000);
	    javascriptClick(driver, editLeaveTypeLink);
		  
		Thread.sleep(2000);
		doubleclick(editLeaveTypeLink);
	    Thread.sleep(2000); 
		leaveTypeTextField.sendKeys(ExcelLibrary.excelPath(excel_path, sheet_name_3, 1, 2));
		
	}
	
	public void changeStatusMethod() throws InterruptedException
	{
		Thread.sleep(1000);
		changeStatusButton.click();
	}
	
	public void applyeditMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		applyButtoneditButton.click();
	}
	
	public void closeeditMethod()
	{
		closebuttoneditButton.click();
	}
	
	

}
