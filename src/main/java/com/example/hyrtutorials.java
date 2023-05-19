package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class hyrtutorials  extends BaseUI{
	
	static By confirmbox = By .id("confirmBox");
	static By promptbox = By .id("promptBox");
	
	static By firstname = By.id("firstName");
	static By lastname= By.id("lastName");
	static By gender = By.id("femalerb");
	static By language1 = By.id("hindichbx");
	static By language2 = By.id ("englishchbx");
	static By UserName = By.id("email");
	static By password = By.id("password");
	
	

public static void main(String[] args) {
		
		driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200);", "");
		driver.findElement(By.id("newWindowBtn")).click();
		driver.manage().window().maximize();
		
		Set<String>windows= driver.getWindowHandles();
		List<String>windowslist=new ArrayList<>(windows);//conversion of set to list
		
		System.out.println("total number of windows opened:"+windowslist.size());
		
		driver.switchTo ().window(windowslist.get(1));
		Sendtexttofield (firstname,"meenu");
		Sendtexttofield (lastname,"k");
		clickmethod(gender);
		
		Sendtexttofield(UserName, "Meen_gop@yahoo.in");
		Sendtexttofield(password, "Test12345");
					
		//driver=BrowserConfiguration.browserSetup("https://www.hyrtutorials.com/p/window-handles-practice.html","chrome");
		
		
		clickmethod(language1);
		clickmethod(language2);
	    //driver.quit();
		

}
}