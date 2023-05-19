package browserConfiguration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browsersetup {
	
	public static  WebDriver browserSetup(String url) {
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remove-allow-origins=*");
		 WebDriver driver = new ChromeDriver(options);
		
		 driver.manage().window().maximize();
			driver.get(url);
	return driver;
	

}
}
