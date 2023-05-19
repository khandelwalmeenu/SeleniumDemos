package com.example;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenShot {
	
public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.hyrtutorials.com");
		driver.findElement(By.linkText("AlertsDemo")).click();
		
		TakesScreenshot takescr = ((TakesScreenshot)driver);
		File src = takescr.getScreenshotAs(OutputType.FILE);
		
		
		FileUtils.copyFile(src, new File("Users\\meenakshik\\eclipse-workspace\\SeleniumDemos\\Screenshots\\m.jpg"));
	
		//Alert a =driver.switchTo().alert();
		//a.accept();
		//a.dismiss();
		//a.sendKeys(null);
		//a.getText();
		
		
}
}


