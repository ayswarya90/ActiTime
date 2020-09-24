package com.pages.Actitime;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.generics.Actitime.AutoConstant;
import com.generics.Actitime.BasePage;
import com.generics.Actitime.ExcelLibrary;

public class CreateNewWorkTypePage extends BasePage implements AutoConstant {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement enterNameTextField;
	
	@FindBy(xpath="//select[@name='active']")
	private WebElement statusSelectiondropdown;
	
	@FindBy(xpath="//input[@type='radio']")
	private List<WebElement> categoryselectionRadiobutton;
	
	@FindBy(xpath="//input[@id='billingRate_input']")
	private WebElement billingrateTextField;
	
	@FindBy(xpath="//input[@value='   Create Type of Work   ']")
	private WebElement createTypeofWorkbutton;
	
	@FindBy(xpath="//input[@value='      Cancel      ']")
	private WebElement cancelbutton;
	
	@FindBy(xpath="//input[@value='   Save Changes   ']")
	private WebElement saveChangesbutton;
	
	
	public CreateNewWorkTypePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterNameofWorkMethod() throws IOException
	{
		enterNameTextField.sendKeys(ExcelLibrary.excelPath(excel_path, sheet_name_4, 1, 0));
		
	}
	
	public void selectStatusMethod()
	{
		Select status=new Select(statusSelectiondropdown);
		status.selectByVisibleText("archived");
	}
	
	public void categoryselectMethod()
	{
		for(int i=0;i<categoryselectionRadiobutton.size();i++)
		{
			categoryselectionRadiobutton.get(1).click();
		}
	}
	
	public void billingrateMethod() throws IOException
	{
		billingrateTextField.sendKeys(ExcelLibrary.excelPath(excel_path, sheet_name_4, 1, 1));
	}
	
	public void createTypeofworkMethod()
	{
		createTypeofWorkbutton.click();
	}
	
	public void cancelButtonMethod()
	{
		cancelbutton.click();
	}
	
	public void okpopUpHandling() throws InterruptedException
	{
		okAlertHandling();
	}
	
	public void cancelpopUpHandling()
	{
		dismissAlertHandling();
	}
	
	public void editWorktypeNameMethod() throws InterruptedException
	{
		Thread.sleep(1000);
		enterNameTextField.sendKeys(Keys.END);
        enterNameTextField.sendKeys("123");
		Thread.sleep(3000);
		saveChangesbutton.click();
	}
	
	

}
