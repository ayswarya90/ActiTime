package com.pages.Actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//div[@class='logoSwitcherText']")
	private WebElement switchToActitimelink;
	
	@FindBy(xpath="//div[.='Time-Track']")
	private WebElement timeTrackLink;
	
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement taskLink;
	
	@FindBy(xpath="//div[.='Reports']")
	private WebElement reportsLink;
	
	@FindBy(xpath="//div[.='Users']")
	private WebElement usersLink;
	
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_calendar']")
	private WebElement calendersLink;
	
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_settings ']")
	private WebElement settingsLink;
	
	@FindBy(xpath="//div[@id='popup_menu_button_addons']")
	private WebElement integrationsLink;
	
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_support']")
	private WebElement helpandsupportLink;
	
	@FindBy(xpath="//a[@class='userProfileLink username ']")
	private WebElement userProfileLink;
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement logoutLink;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void switchToActitimeMethod()
	{
		switchToActitimelink.click();
	}
	
	public void timeTrackMethod()
	{
		timeTrackLink.click();
	}
	
	public void tasksMethod()
	{
		taskLink.click();
	}
	
	public void reportsMethod()
	{
		reportsLink.click();
	}
	
	public void usersMethod()
	{
		usersLink.click();
	}
	
	public void calenderMethod()
	{
		calendersLink.click();
	}
	
	public void settingsMethod()
	{
		settingsLink.click();
	}
	
	public void integrationMethod()
	{
		integrationsLink.click();
	}
	
	public void helpandsupportMethod()
	{
		helpandsupportLink.click();
	}
	
	public void userProfileMethod()
	{
		userProfileLink.click();
	}
	
	public void logoutMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		logoutLink.click();
	}
	

}
