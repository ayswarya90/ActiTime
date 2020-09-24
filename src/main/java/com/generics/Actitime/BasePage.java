package com.generics.Actitime;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	public WebDriver driver;

	public void selectbyVisibletext(WebElement element,String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void selectByIndex(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	public void selectByValue(WebElement element,String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public void moveToElement(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element);
	}
	
	public void robotTab() throws AWTException
	{
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
	}
	
	public void javascriptClick(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	public void fetchTitle()
	{
		System.out.println(driver.getTitle());
		
	}
	
	public void okAlertHandling() throws InterruptedException
	{
		
		Alert alt=driver.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();
		
	}
	
	public void dismissAlertHandling()
	{
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
		
	}
	
	public void doubleclick(WebElement element)
	{
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	 

}
