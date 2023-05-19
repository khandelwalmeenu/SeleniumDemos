package samples;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.example.BrowserConfiguration;

public class Propertyfilehandling {
	 //static WebDriver driver;
	 static WebDriver driver = new ChromeDriver();
	 
	 
	public static void main(String[] args)throws IOException {
		Properties p = new Properties();
		FileInputStream fis=new FileInputStream("//Users/meenakshik/eclipse-workspace/FrameworkDemo/src/test/resource/objectrepository/config.properties");
		p.load(fis);
		//p.getProperty("websiteURL");
		driver=BrowserConfiguration.browserSetup(p.getProperty("websiteURL"));
		driver.findElement(By.id(p.getProperty("username_id"))).sendKeys("meenu");
		driver.findElement(By.xpath(p.getProperty("password_id"))).sendKeys("meenu123");

	}


	
	}


