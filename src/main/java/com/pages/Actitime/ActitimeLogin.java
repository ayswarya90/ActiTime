package com.pages.Actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.generics.Actitime.AutoConstant;
import com.generics.Actitime.BasePage;
import com.generics.Actitime.ExcelLibrary;

public class ActitimeLogin extends BasePage implements AutoConstant {
	@FindBy(id="username")
	private WebElement userNameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement keepMeLoggedIncheckbox;
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement forgotYourPasswordlink;
	
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actiTimeInclink;
	
	
	public ActitimeLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws IOException 
	{
		userNameTextfield.sendKeys(ExcelLibrary.excelPath(excel_path, sheet_name_1, 1, 0));
		passwordTextfield.sendKeys(ExcelLibrary.excelPath(excel_path, sheet_name_1, 1, 1));
		loginButton.click();
	}
	
	public void forgotPasswordMethod()
	{
		forgotYourPasswordlink.click();
	}
	
	public void actiTimeIncMethod()
	{
		actiTimeInclink.click();
	}
	

	
}
