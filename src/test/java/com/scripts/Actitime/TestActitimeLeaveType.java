package com.scripts.Actitime;


import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.Actitime.BaseTest;
import com.pages.Actitime.CreateNewLeaveTypePage;
import com.pages.Actitime.HomePage;
import com.pages.Actitime.LeaveTypePage;
import com.pages.Actitime.SettingsPage;

public class TestActitimeLeaveType extends BaseTest {
	
	@Test
	
	public void createleavetype() throws InterruptedException, IOException
	{
				
		HomePage home=new HomePage(driver);
		home.settingsMethod();
		
		SettingsPage settings=new SettingsPage(driver);
		settings.leavetypesMethod();
		
		LeaveTypePage leave=new LeaveTypePage(driver);
		leave.createLeavetypeMethod();
		
		CreateNewLeaveTypePage create=new CreateNewLeaveTypePage(driver);
		create.createLeaveTypeMethod();
		create.addcreateleavetypeMethod();
		
   }
	@Test(dependsOnMethods = "createleavetype")

	public void leavetypeedit() throws InterruptedException, AWTException, IOException
	{
		HomePage home=new HomePage(driver);
		home.settingsMethod();

		SettingsPage settings=new SettingsPage(driver);
		settings.leavetypesMethod();


		LeaveTypePage leave=new LeaveTypePage(driver);
        leave.editLeaveTypeMethod(); 
		leave.applyeditMethod();
        leave.changeStatusMethod();
}
	
	@Test(dependsOnMethods = "leavetypeedit")
	public void deleteleaveType() throws InterruptedException
	{

		HomePage home=new HomePage(driver);
		home.settingsMethod();

		SettingsPage settings=new SettingsPage(driver);
		settings.leavetypesMethod();

		LeaveTypePage leave=new LeaveTypePage(driver);
		leave.deleteLeaveTypeMethod(); 
		leave.okpopUpHandling();
	}

}
