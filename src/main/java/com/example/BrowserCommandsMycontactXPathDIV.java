package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserCommandsMycontactXPathDIV {
	
	static By links = By.xpath("//div[@id='left_col_wrapper']//ul//li/a");
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.mycontactform.com");
		driver.findElement(By.linkText("Sample Forms")).click();
		
		List<WebElement> linksToClick = driver.findElements(links);
		Actions a=new Actions (driver);

		for(int i=0; i<linksToClick.size(); i++) {
			linksToClick = driver.findElements(links);
			a.moveToElement(linksToClick.get(i)).build().perform();
			linksToClick.get(i).click();
		}
	}
}
