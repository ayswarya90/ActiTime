package com.scripts.Actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.Actitime.BaseTest;
import com.pages.Actitime.CreateNewLeaveTypePage;
import com.pages.Actitime.CreateNewWorkTypePage;
import com.pages.Actitime.HomePage;
import com.pages.Actitime.SettingsPage;
import com.pages.Actitime.TypesOfWorkPage;

public class TestActitimeWorkType extends BaseTest {
	
	@Test
	
	public void creatework() throws InterruptedException, IOException
	{
			
		
		HomePage home=new HomePage(driver);
		home.settingsMethod();
		
		SettingsPage settings=new SettingsPage(driver);
		settings.typesofworkMethod();
		TypesOfWorkPage type=new TypesOfWorkPage(driver);
		type.createWorktypeMethod();
		
		CreateNewWorkTypePage create=new CreateNewWorkTypePage(driver);
		create.enterNameofWorkMethod();
		create.createTypeofworkMethod();
		
	}
	
	@Test(dependsOnMethods = "creatework")
	public void worktypeedit() throws InterruptedException
	{
		HomePage home=new HomePage(driver);
		home.settingsMethod();
		
		SettingsPage settings=new SettingsPage(driver);
		settings.typesofworkMethod();
		
		TypesOfWorkPage type=new TypesOfWorkPage(driver);
		type.editWorkTypeMethod();
		
		CreateNewWorkTypePage work=new CreateNewWorkTypePage(driver);
		work.editWorktypeNameMethod();
	}
	
	@Test(dependsOnMethods = "worktypeedit")
	
	public void worktypedelete() throws InterruptedException
	{
		HomePage home=new HomePage(driver);
		home.settingsMethod();
		
		SettingsPage settings=new SettingsPage(driver);
		settings.typesofworkMethod();
		
		TypesOfWorkPage type=new TypesOfWorkPage(driver);
		type.deleteWorktypeMethod();
		 type.okpopUpHandling();
	}
	
	

}
