package com.example;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class travelling  extends BaseUI{
	
	static By from = By.id ("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[1]/div");
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the month you want to travel");
		String month =s.nextLine();
		
		driver=BrowserConfiguration.browserSetup("https://www.ixigo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		   TakeScreenShot takesscr=
		driver.findElement(from).click();
		   
		   driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[1]")).click();
			driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[1]")).sendKeys("chennai");
			driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[1]")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[2]")).click();
			driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[2]")).sendKeys("bangalore");
			Thread.sleep(1000);

			driver.findElement(By.xpath("(//input[@placeholder='Enter city or airport'])[2]")).sendKeys(Keys.ENTER);
			
		
		
		
		
		 
				
				
				
				
				
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

	private static WebElement findElement(By from2) {
		// TODO Auto-generated method stub
		return null;
	}

			

	}
	
	

}
