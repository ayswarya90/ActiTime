package com.pages.Actitime;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.Actitime.AutoConstant;
import com.generics.Actitime.BasePage;
import com.generics.Actitime.ExcelLibrary;

public class CreateNewCustomer extends BasePage implements AutoConstant {
	public WebDriver driver;

	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement enterCustomerNameTextField;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustomerDescriptionTextField;
	
	@FindBy(xpath="//div[@class='emptySelection']")
	private WebElement copyProjectsFromExistingCustomerDropdown;
	
	@FindBy(xpath="//div[contains(@class,'itemRow cpItemRow')]")
	private List<WebElement> dropdownlistselection;
	
	@FindBy(xpath="//div[contains(text(),'Create Customer')]")
	private WebElement createCustomerButton;
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelButton;
	
	@FindBy(xpath="//span[.='ASSIGNED USERS (3)']")
	private WebElement assignedUsersTabLink;
	
	@FindBy(xpath="(//div[@class='assignUserButton components_button withPlusIcon'])[9]")
	private WebElement addassignButton;
	
	@FindBy(xpath="//span[contains(text(),'MANAGERS (3)')]")
	private WebElement managersTabLink;
	
	@FindBy(xpath="(//div[@class='assignedUsersEditor hideGroupBySelector']//div[@class='assignUserButton components_button withPlusIcon'][contains(text(),'Add Managers')]")
	private WebElement addmanagersButton;
	
	public CreateNewCustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void addingCustomerMethod() throws IOException
	{
		enterCustomerNameTextField.sendKeys(ExcelLibrary.excelPath(excel_path, sheet_name_2, 1, 0));
		enterCustomerDescriptionTextField.sendKeys(ExcelLibrary.excelPath(excel_path, sheet_name_2, 1, 1));
		
	}
	
	
	public void dropdownSelectionMethod()
	
	{
		copyProjectsFromExistingCustomerDropdown.click();
		for(int i=0;i<dropdownlistselection.size();i++)
		{
			if(dropdownlistselection.get(i).getText().equalsIgnoreCase("Galaxy Corporation"))
			{
				dropdownlistselection.get(i).click();
				break;
			}
		}
	}
	
	public void createCustomerMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		createCustomerButton.click();
		
	}
	
	public void cancelMethod()
	{
		cancelButton.click();
	}
	
	public void okAlertHandling()
	{
		okAlertHandling();
	}
	public void cancelpopUpHandling()
	{
		cancelpopUpHandling();
	}

}
