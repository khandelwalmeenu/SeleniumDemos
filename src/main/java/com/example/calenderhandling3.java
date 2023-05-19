package com.example;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderhandling3 {
	
	public static void main(String[] args) throws InterruptedException, IOException  {
		
		Scanner s= new Scanner(System.in);
		System.out.println("which month you want to travel");
		String monthname = s.nextLine();
		
		System.out.println("which date you want to travel");
		String travelDate = s.nextLine();
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.ixigo.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[1]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[1]")).sendKeys("chennai");
		driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[2]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[2]")).sendKeys("bangalore");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[2]")).sendKeys(Keys.ENTER);
		
				
		while(true) {
			String mon_text=driver.findElement(By.xpath("(//div[@class='rd-month-label'])[1]")).getText();
			System.out.println("mon_text:" + mon_text); 
			String[]mon = mon_text.split(" ");
			System.out.println("mon[0]:" + mon[0]); 
			if(mon[0].equalsIgnoreCase(monthname)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next'][1]")).click();
				Thread.sleep(1000);
			}
		}
		driver.findElement(By.xpath("//div[@class='day has-info'][normalize-space()='"+travelDate+"']")).click();	
		Thread.sleep(2000);
		
		//File src = (File)driver.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("/Users/meenakshik/eclipse-workspace/SeleniumDemos/src/main/java/com/example/test.jpg"));
	}
		  
}

