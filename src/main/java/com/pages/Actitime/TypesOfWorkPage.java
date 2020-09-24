package com.pages.Actitime;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.Actitime.AutoConstant;
import com.generics.Actitime.BasePage;

public class TypesOfWorkPage extends BasePage implements AutoConstant {
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement createworkTypeButton;
	
	@FindBy(xpath="//input[@name='statusCriterionAsString']")
	private List<WebElement> selectstatusradioButton;
	
	@FindBy(xpath="//input[@name='billableCriterionAsString']")
	private List<WebElement> selectcategoryradioButton;
	
	
	@FindBy(xpath="//a[.='Ayswarya123']/../..//a[contains(text(),'delete')]")
	private WebElement deleteworkTypeButton;
	
	@FindBy(xpath="//a[.='Ayswarya']")
	private WebElement workType;
	
	public TypesOfWorkPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createWorktypeMethod()
	{
		createworkTypeButton.click();
	}
	
	public void deleteWorktypeMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		deleteworkTypeButton.click();
	}
	
	public void selectstatusMethod()
	{
		System.out.println(selectstatusradioButton.size());
		for(int i=0;i<selectstatusradioButton.size();i++)
		{
			selectstatusradioButton.get(2).click();
			
		}
		}
	
	
	public void selectcategoryMethod()
	{
		for(int i=0;i<selectcategoryradioButton.size();i++)
		{
			selectcategoryradioButton.get(1).click();
			
		}
		}
	
	public void editWorkTypeMethod()
	{
		workType.click();
	}
	
	public void okpopUpHandling() throws InterruptedException
	{
		Thread.sleep(2000);
		okAlertHandling();
	}
	
	public void cancelpopUpHandling()
	{
		dismissAlertHandling();
	}
	

}
