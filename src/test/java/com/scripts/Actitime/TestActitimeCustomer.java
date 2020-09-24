package com.scripts.Actitime;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.Actitime.BaseTest;
import com.pages.Actitime.CreateNewCustomer;
import com.pages.Actitime.HomePage;
import com.pages.Actitime.TasksPage;

public class TestActitimeCustomer extends BaseTest {
@Test
	
	public void customercreation() throws InterruptedException, IOException
	{
		HomePage home=new HomePage(driver);
	    home.tasksMethod();
		TasksPage tasks=new TasksPage(driver);
	    tasks.addNewMethod();
	    tasks.addNewCustomerMethod();
	    
	    CreateNewCustomer cust=new CreateNewCustomer(driver);
	    cust.addingCustomerMethod();
	    cust.createCustomerMethod();
	}
	
	@Test(dependsOnMethods = "customercreation")
	
	public void customerdeletion() throws InterruptedException, IOException
	{
		
		
		 HomePage home=new HomePage(driver);
	     home.tasksMethod();
	     TasksPage tasks=new TasksPage(driver);
		 tasks.customersettingsLinkMethod();
		 tasks.actionsLinkMethod();
		 tasks.customerdeleteLinkMethod();
		 tasks.deletePermanentlybuttonMethod();
		
	}
	
	@Test(dependsOnMethods = "customercreation",enabled = false)
	public void editcustomer() throws InterruptedException, AWTException
	{
		HomePage home=new HomePage(driver);
	    home.tasksMethod();
	    
	    
		TasksPage tasks=new TasksPage(driver);
		tasks.customersettingsLinkMethod();
		tasks.customerdescriptionEditMethod();
		
	}

}
