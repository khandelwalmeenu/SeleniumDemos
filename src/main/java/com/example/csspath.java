package com.example;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class csspath  extends BaseUI{
	
	public static void main(String[]args)throws InterruptedException{
	driver=BrowserConfiguration.browserSetup("https://www.mycontactform.com/sample.php");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	
	//Set<String>windows= driver.getWindowHandles();
	//List<String>windowslist=new ArrayList<>(windows);//conversion of set to list
	
	WebElement links=driver.findElement(By.linkText("Basic Contact Form"));
	
	
	//Actions a= new Actions(driver);
	//a.contextClick(link).sendKeys(Keys.ARROW_DOWN).sendKeys(Key.ENTER).build().perform();
	String clicklink=Keys.chord(Keys.CONTROL,Keys.ENTER);
	links.sendKeys(clicklink);
	//Thread.sendKeys(clicklink);
	Thread.sleep(3000);
	WebDriverWait waits=new WebDriverWait(driver,Duration.ofSeconds(10));
	waits.until(ExpectedConditions.invisibilityOf(links));
	
	//System.out.println("total number of windows opened:"+windowslist.size());
	
	
}

}
