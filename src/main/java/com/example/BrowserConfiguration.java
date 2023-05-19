package com.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;

public class BrowserConfiguration {

	public static WebDriver browserSetup(String url, String browser) {

		if("chrome".equalsIgnoreCase(browser)) {
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver();
		//to maximize my screen
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		} else {
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--remote-allow-origins=*");

			WebDriver driver = new FirefoxDriver();
			//to maximize my screen
			//driver.manage().window().maximize();
			driver.manage().window().maximize();
			driver.get(url);
			return driver;
			 
			
		}
		
		

	}

	public static WebDriver browserSetup(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
