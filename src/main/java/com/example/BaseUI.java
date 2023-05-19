package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseUI {

	public static WebDriver driver = new ChromeDriver();;

	public static void dropdownById(String locator, String data) {
		WebElement q = driver.findElement(By.id(locator));
		Select s = new Select(q);
		s.selectByValue(data);
	}

	public static void dropdownByclass(By locator, String data) {
		WebElement q = driver.findElement(locator);
		Select s = new Select(q);
		s.selectByValue(data);
	}

	public static void dropdownByName(String locator, String data) {
		WebElement q = driver.findElement(By.name(locator));
		Select s = new Select(q);
		s.selectByValue(data);
	}

	public static void Sendtexttofield(By locator, String data) {
		driver.findElement(locator).sendKeys(data);
	}

	public static void clickmethod(By locator) {
		driver.findElement(locator).click();
	}
}