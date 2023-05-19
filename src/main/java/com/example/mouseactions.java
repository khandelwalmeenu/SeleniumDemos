package com.example;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class mouseactions extends BaseUI{
	
	public static void main (String[]args) {
		
		
		
	
	driver =BrowserConfiguration.browserSetup("https://jqueryui.com/droppable/","Chrome");
	
	WebElement frame =driver.findElement(By.className("demo-frame"));
	driver.switchTo().frame(frame);
	
	WebElement draggable =driver.findElement(By.id("draggable"));
	WebElement droppable =driver.findElement(By.id("droppable"));
	Actions a=new Actions (driver);
	a.clickAndHold(draggable).moveToElement(draggable).moveToElement(droppable).release(droppable).build().perform();
	//a.moveToElement(x).build().perform();
	
	//driver.navigate().to("https://www.Amazon.com");
	driver =BrowserConfiguration.browserSetup("https://www.amazon.com/","Chrome");
	WebElement AccountandList =driver.findElement(By.id("nav-link-accountList"));
	
	Actions l=new Actions (driver);//mouse action
	l.moveToElement(AccountandList).build().perform();
	} 
}
			
	