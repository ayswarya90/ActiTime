package com.generics.Actitime;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import com.pages.Actitime.ActitimeLogin;
import com.pages.Actitime.HomePage;

public class BaseTest implements AutoConstant {
	public WebDriver driver;

	@BeforeClass
	public void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);

	}

	@BeforeMethod

	public void logintoApp() throws IOException
	{
		ActitimeLogin login=new ActitimeLogin(driver);
		login.loginMethod();
	}

	
	
	@AfterMethod

	public void logoutApp() throws InterruptedException
	{
		HomePage home=new HomePage(driver);
		home.logoutMethod();
	}

	@BeforeSuite

	public void executionStarted()
	{
		Reporter.log("execution started", true);
	}

	@AfterSuite

	public void executionStopped()
	{
		Reporter.log("execution stopped", true);
	}


	@AfterClass

	public void closeBrowser()
	{
		//driver.quit();
	}


}
