package com.pages.Actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {
	@FindBy(xpath="//div[.='Turn Features On / Off']")
	private WebElement turnOnOffeaturesLink;
	
	@FindBy(xpath="//div[.='Manage system settings & configure actiTIME']")
    private WebElement generalsettingsLink;

	@FindBy(xpath="//a[.='Workflow Settings']")
	private WebElement workflowsettingsLink;

	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement typesofworkLink;

	@FindBy(xpath="//a[.='Leave Types']")
	private WebElement leavetypesLink;
	
	@FindBy(xpath="//a[.='Notifications']")
	private WebElement notificationsLink;
	
	@FindBy(xpath="//a[.='Logo Settings']")
	private WebElement logosettingsLink;
	
	@FindBy(xpath="//div[.='Licenses']")
	private WebElement licensesLink;
	
	public SettingsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void turnFeatuesMethod()
	{
		turnOnOffeaturesLink.click();
	}
	
	public void generalsettingsMethod()
	{
		generalsettingsLink.click();
	}
	public void workflowsettingsMethod()
	{
		workflowsettingsLink.click();
	}
	public void typesofworkMethod()
	{
		typesofworkLink.click();
	}
	public void leavetypesMethod()
	{
		leavetypesLink.click();
	}
	public void notificationMethod()
	{
		notificationsLink.click();
	}
	public void logoSettingsMethod()
	{
		logosettingsLink.click();
	}
	public void licensesMethod()
	{
		licensesLink.click();
	}

}
