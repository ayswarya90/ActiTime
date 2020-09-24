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

public class CreateNewLeaveTypePage extends BasePage implements AutoConstant{
	
	public WebDriver driver;

	@FindBy(xpath="//input[contains(@id,'leaveTypeLightBox_nameField')]")
	private WebElement leaveTypeNameTextField;
	
	@FindBy(xpath="//span[@id='leaveTypeLightBox_iconSelectorPlaceholder']//div[@class='arrowDiv']")
	private WebElement iconSelectordropdown;
	
	@FindBy(xpath="//div[@class='requestColorDiv']/../../../..")
	private List<WebElement> imageslist;
	
	@FindBy(xpath="//button[@id='ext-gen16']")
	private WebElement statusdropdown;
	
	@FindBy(xpath="//a[@id='ext-gen35']/../../..")
	private List<WebElement> selectstatus;
	
	@FindBy(xpath="//input[@id='leaveTypeLightBox_rateCoefficient']")
	private WebElement leaveHourRateTextField;
	
	@FindBy(xpath="//input[@id='processLeaveTimeCheckbox_createPopup']")
	private WebElement processLeaveTimeCheckbox;
	
	@FindBy(xpath="//input[@id='asPtoRadioButton_createPopup']")
	private WebElement asPTOradiobutton;
	
	@FindBy(xpath="//input[@id='ptoCoefficientInput_createPopup']")
	private WebElement timetoSubtracttextField;
	
	@FindBy(xpath="//input[@id='asSickDaysRadioButton_createPopup']")
	private WebElement asSickDaysradiobutton;
	
	
	@FindBy(xpath="//span[contains(@class,'buttonTitle')]")
	private WebElement addcreateleaveTypeButton;
	
	@FindBy(xpath="//div[@id='leaveTypeLightBox_cancelBtn']")
	private WebElement cancelleaveTypeButton;
	
	public CreateNewLeaveTypePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createLeaveTypeMethod() throws IOException
	{
		leaveTypeNameTextField.sendKeys(ExcelLibrary.excelPath(excel_path, sheet_name_3, 1, 0));
		
	}
	
	public void selectImageMethod()
	{
		iconSelectordropdown.click();
		System.out.println(imageslist.size());
		for(int i=0;i<imageslist.size();i++)
		{
			imageslist.get(1).click();
		}
	}
	
	public void statusselectionMethod()
	{
		statusdropdown.click();
		for(int i=0;i<selectstatus.size();i++)
		{
			if(selectstatus.get(i).getText().equalsIgnoreCase("archived"))
			{
				selectstatus.get(i).click();
				break;
			}
		}
	}
	
	public void leavehourRateMethod() throws IOException
	{
		leaveHourRateTextField.sendKeys(ExcelLibrary.excelPath(excel_path, sheet_name_3, 1, 1));
	}
	
	public void processLeaveTimeCheckboxMethod()
	{
		processLeaveTimeCheckbox.click();
		timetoSubtracttextField.sendKeys("2");
	}
	
	public void asSickDaysMethod()
	{
		asSickDaysradiobutton.click();
	}
	
	public void addcreateleavetypeMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		addcreateleaveTypeButton.click();
	}
	
	public void cancelMethod() 
	{
		cancelleaveTypeButton.click();
	}
	
	
	
	
	
	
	
	
}
