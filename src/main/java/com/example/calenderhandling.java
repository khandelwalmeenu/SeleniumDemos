package com.example;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calenderhandling {
	
	public static void main(String[] args) throws InterruptedException, IOException  {
		
		Scanner s= new Scanner(System.in);
		System.out.println("which month you want to travel");
		String monthname = s.nextLine();
		
		System.out.println("which date you want to travel");
		String travelDate = s.nextLine();
		
		System.out.println("which month you want to return");
		String monthname1 = s.nextLine();
		
		System.out.println("which date you want to return");
		String travelDate1 = s.nextLine();
		
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
		
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(2));
		waits.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(),'Return')]"))));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Return')]")).click();
		Thread.sleep(2000);
		
		WebElement cl = driver.findElement(By.xpath("//div@class"));
		waits.until(ExpectedConditions.elementToBeClickable(cl));
		Actions a=new Actions (driver);
		a.moveToElement(cl).click(cl).build().perform();
		
		WebElement returncity = driver.findElement(By.xpath("//div@class"));
		waits.until(ExpectedConditions.elementToBeClickable(By.xpath));
		returncity.click();
		returncity.click();
		
		while(true) {
			String mon_text=driver.findElement(By.xpath("(//div[@class='rd-month-label'])[1]")).getText();
			System.out.println("mon_text2:" + mon_text); 
			String[]mon = mon_text.split(" ");
			System.out.println("mon[0]2:" + mon[0]); 
			if(mon[0].equalsIgnoreCase(monthname)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next'][1]")).click();
				Thread.sleep(1000);
			}
		}
		driver.findElement(By.xpath("//div[@class='day has-info'][normalize-space()='"+travelDate1+"']")).click();
		//WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		List<WebElement>dates=driver.findElements(By.cssSelector("div.day.has_info"));
		 for(int i=0;i<dates.size();i=i++) {
			 Thread.sleep(500);
		 
		 String datetext=dates.get(i).getText();
		 if(datetext.equalsIgnoreCase("17"));{
			 dates.get(i).click();
			 break;
		 }
		 }
		// Thread.sleep(2000);
		 //JavascriptExecutor js=(javascriptExecutor)driver;
		// js.executeAsyncScript("arguments[0].click();",returncity);
		 }
		//driver.findElement(By.xpath("//label[@for='passenger-list']".clicl()));

		
		
		//File src = (File)driver.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("/Users/meenakshik/eclipse-workspace/SeleniumDemos/src/main/java/com/example/test.jpg"));
	
		  
	}
	
	
