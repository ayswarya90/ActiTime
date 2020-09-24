package com.pages.Actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.Actitime.BasePage;

public class TasksPage extends BasePage {
	public WebDriver driver;

	@FindBy(xpath="//div[@class='title ellipsis']")
	private WebElement addNewButton;

	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newcustomerLink;

	@FindBy(xpath="//div[@class='item createNewProject']")
	private WebElement newprojectLink;

	@FindBy(xpath="//div[@class='item createNewTasks']")
	private WebElement newtasksLink;

	@FindBy(xpath="//div[@class='item importTasks']")
	private WebElement importtasksfromcsvLink;

	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]")
	private WebElement searchtypingnameField;

	@FindBy(xpath="//div[contains(text(),'Ayswarya')]/../..//div[contains(@class,'editButton')]")
	private WebElement customersettingsLink ;

	@FindBy(xpath="//div[@class='copyLink_panelContainer']")
	private WebElement customercopylinkLink;

	@FindBy(xpath="(//div[@class='statusButton'])[2]")
	private WebElement statusDropDown;

	@FindBy(xpath="(//div[.='ACTIONS'])[1]")
	private WebElement actionslink;

	@FindBy(xpath="//div[contains(@class,'taskManagement_projectPanel')]//div[contains(@class,'title')][contains(text(),'Copy to')]")
	private WebElement customercopytoLink;

	@FindBy(xpath="//div[contains(@class,'taskManagement_projectPanel')]//div[contains(@class,'title')][contains(text(),'Move to')]")
	private WebElement customermovetoLink;

	@FindBy(xpath="(//div[.='Delete'])[2]")
	private WebElement customerdeleteLink;
	
	@FindBy(xpath="(//span[@class='submitTitle buttonTitle'])[1]")
	private WebElement customerdeletePermanentlybutton;
	
	@FindBy(xpath="(//div[@class='cancelBtn greyButton'])[1]")
	private WebElement customerdeletecancelButton;

	@FindBy(xpath="(//span[.='ASSIGNED USERS (6)'])[1]")
	private WebElement assignedUsersTabLink;

	@FindBy(xpath="//div[contains(@class,'assignedUsersEditor emptyList hideGroupBySelector')]//div[contains(@class,'assignUserButton components_button withPlusIcon')][contains(text(),'Assign')]")
	private WebElement addAssignUserButton;

	@FindBy(xpath="//span[.='MANAGERS (7)']")
	private WebElement managersTabLink;

	@FindBy(xpath="//div[contains(@class,'assignedUsersEditor hideGroupBySelector')]//div[contains(@class,'assignUserButton components_button withPlusIcon')][contains(text(),'Add Managers')]")
	private WebElement addManagersButton;
	
	@FindBy(xpath="//div[@class='node projectNode editable selected']//div[@class='editButton']")
	private WebElement projectSettingsLink;
	
	@FindBy(xpath="(//div[@class='components_linkifiedText'])[1]")
	private WebElement customerdescriptionTextField;
	
	public TasksPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addNewMethod()
	{
		addNewButton.click();
	}
	
	public void addNewCustomerMethod()
	{
		newcustomerLink.click();
	}
	
	public void addNewProjectMethod()
	{
		newprojectLink.click();
	}
	
	public void addNewTaskMethod() {
	
		newtasksLink.click();
	}
	
	public void importTasksFromCSVMethod()
	{
		importtasksfromcsvLink.click();
	}
	
	public void searchTypingNameMethod()
	{
		searchtypingnameField.sendKeys("Big Bang Company");
	}
	
	public void customersettingsLinkMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		javascriptClick(driver, customersettingsLink);
		
	}
	
	public void customercopylinkMethod()
	{
		customercopylinkLink.click();
	}
	
	public void customerdeleteLinkMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		javascriptClick(driver, customerdeleteLink);
	
	}
	
	public void deletePermanentlybuttonMethod()
	{
		javascriptClick(driver, customerdeletePermanentlybutton);
		
	}
	
	public void customerdeletecancelButtonMethod()
	{
		customerdeletecancelButton.click();
	}
	
	
	public void projectsettingsLinkMethod()
	{
		projectSettingsLink.click();
	}
	
	public void actionsLinkMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		javascriptClick(driver, actionslink);
		
	}
	
	public void customerdescriptionEditMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		javascriptClick(driver, customerdescriptionTextField);
	
		
		 Thread.sleep(2000); 
		/* JavascriptExecutor js1=(JavascriptExecutor)driver;
		 */
		//js.executeScript("arguments[0].value='cdef'", customerdescriptionTextField);
		 //Actions actions=new Actions(driver);
		// act.click(customerdescriptionTextField).sendKeys("cdeg").perform();

		 
		// actions.keyDown(customerdescriptionTextField, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		 
	
		//customerdescriptionTextField.sendKeys("cdef");
		
		

		
		 

}
}
