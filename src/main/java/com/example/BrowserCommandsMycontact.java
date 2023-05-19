package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserCommandsMycontact {

	static WebDriver driver;
	static By UserName=By.xpath("//input[@value='1']");    
	static By password=By.xpath("//input[@id='pass']");
	static By MarketingDepartment=By.xpath("//input[@type='checkbox']");
	static By Sales=By.xpath("//input[@value='1']");
	static By CustomerService=By.xpath("//input[@value='2']");
	static By radio=By.xpath ("//input[@value='First Option']");
	static By radio1=By.xpath("//input[@value='Third Option']");
	static By singlebox=By.xpath("//input[@value='Yes']");
	 static By multiAnswer1=By.xpath("//input[@value='Third Check Box']");
	 static By multiAnswer=By.xpath("//input[@value='fifth Check Bob']");
	 static By file=By.id("attach4589");
	 static By s=By.id("subject");
	 static By email=By.id("email");
	 static By q1=By.id("q1");
	 static By q2=By.id("q2");
	 static By q3=By.xpath("//*[@id='q3']");
	 static By q4=By.xpath("//input[@value='Second Option']");
	 static By q61=By.xpath("//input[@value='Second Check Box']");
	 static By q62=By.xpath("//input[@value='Fourth Check Box']");
	 static By q8=By.xpath("//*[@id='q8']");
	 static By q9=By.xpath("//*[@id='q9']");
	 static By q10=By.xpath("//*[@id='q10']");
	 static By q7=By.id("q7");
	 static By q11=By.name("q11_first");
	 static By q12=By.name("q11_last");
	 static By q13=By.name("q12_month");
	 static By q14=By.name("q12_day");
	 static By q15=By.name("q12_year");
	 
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.navigate().to("https://www.mycontactform.com");
		

		driver.findElement(By.linkText("Sample Forms")).click();
		Sendtexttofield(file,"/Users/meenakshik/Desktop/Screen Shot 2023-04-13 at 9.04.12 PM.png");
	    
	    Sendtexttofield(password, "Test12345");
	    
		Sendtexttofield(s, "Meenakshi");
		Sendtexttofield(email,"qaz@yahoo.com");
		Sendtexttofield(q1,"abc");
		Sendtexttofield(q2,"subject");
		//Sendtexttofield(q6,"selenium");
		Sendtexttofield(q7,"04-12-2023");
		Sendtexttofield(q11,"meenakshi");
		Sendtexttofield(q12,"khandelwal");
		Sendtexttofield(q13,"3");
		Sendtexttofield(q14,"18");
		Sendtexttofield(q15,"2006");
		
		clickmethod(singlebox);

		dropdownById(q3, "Second Option");
		clickmethod(q4);
		clickmethod(q61);
		clickmethod(q62);
		dropdownById(q8, "TX");
		dropdownById(q9, "United States of America");
		dropdownById(q10, "Ontario");
		dropdownByName("q11_title", "Mrs.");
}
	   public static void dropdownById(String locator, String data) {
		WebElement q = driver.findElement(By.id(locator));
		Select s = new Select(q);
		s.selectByValue(data);
	}
	   
	   public static void dropdownById(By locator, String data) {
			WebElement q = driver.findElement(locator);
			Select s = new Select(q);
			s.selectByValue(data);
		}

	  public static void dropdownByName(String locator, String data) {
		WebElement q = driver.findElement(By.name(locator));
		Select s = new Select(q);
		s.selectByValue(data);
	  }
	
		 public static void  Sendtexttofield(By locator,String data) {
			 driver.findElement(locator).sendKeys(data);
			 }
		 public static void  clickmethod(By locator) {
		 driver.findElement(locator).click();
		 }
}






//driver.findElement(By.id("subject")).sendKeys("meenakshi");
		//driver.findElement(By.id("email")).sendKeys("qaz@yahoo.com");
		//driver.findElement(By.id("q1")).sendKeys("abc");
		//driver.findElement(By.id("q2")).sendKeys("subject")
//driver.findElement(By.id("q5")).click();

		//driver.findElement(By.id("subject")).sendKeys("selenium");
		//driver.findElement(By.id("q7")).sendKeys("4-13-2023");
//driver.findElement(By.name("q11_first")).sendKeys("meenakshi");
		//driver.findElement(By.name("q11_last")).sendKeys("khandelwal");

		//driver.findElement(By.name("q12_month")).sendKeys("3");
		//driver.findElement(By.name("q12_day")).sendKeys("18");
		//driver.findElement(By.name("q12_year")).sendKeys("2006");
		 
		 //Senddowntexttofield(Subject,"");
		//<input name="q13" id="q13" type="hidden" value="id358901">
		//<input type="checkbox" name="email_to[]" value="0">market place
		//<input name="checkbox6[]" type="checkbox" value="Third Check Box">
