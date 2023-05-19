package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class seleniumWithDifferentMethod {
	
	public static WebDriver driver;

	public static void dropdown(By locator,String option) {
		WebElement dropdown= driver.findElement(locator);
		Select s =new Select(dropdown);
		s.selectByVisibleText(option);
	}
		public static void sendtexttofield(By locator,String text) {
			driver.findElement(locator).sendKeys(text);
		}
		public static void clickonElement(By locator) {	
			driver.findElement(locator).click();
		
		}
		}
		
		
		
	


