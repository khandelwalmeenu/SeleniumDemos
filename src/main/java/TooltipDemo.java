import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.example.BaseUI;

public class TooltipDemo extends BaseUI {
	
	public static void selection(By locator)throws Exception {
		
		WebElement day = driver.findElement(locator);
		Thread.sleep(500);
		Actions a = new Actions(driver);
		a.moveToElement(day).scrollToElement(day).build().perform();
		WebElement tooletip = driver.findElement(By.xpath("//div[@class='yui3-chart-tooltip']"));
		System.out.println(tooletip.getText());
				
	}
	public static void main(String[] args) throws Exception{
		
	
		driver.navigate().to("https://clarle.github.io/yui3/yui/docs/charts/charts-pie.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter days name");
        String day = sc.next();

switch (day) {

case "Monday":
	By Monday = By.xpath("//*[contains(@id,'yui_3_17_2_1_')][contains(@fill,#66007f)]");
		selection (Monday);
		
	case "Tuesday":
		By Tuesday = By.xpath("//*[contains(@id,'yui_3_17_2_1_1682805464706_21_0_1)[contains(@fill,#a86f41)]");
			selection(Tuesday);
			
		case "Wednesday":
			By wednesday = By.xpath("//*[contains(@id,'yui_3_17_2_1_1682805464706_21_0_2)[contains(@fill,#295454)]");
					selection (wednesday);
				
			case "Thursday":
				By Thursday = By.xpath("//*[contains(@id,'[yui_3_17_2_1_1682805464706_21_0_3)][contains(@fill,#996ab2])]");
					selection(Thursday);
					
				case "Friday":
					By Friday = By.xpath("//*[contains(@id,'yui_3_17_2_1_1682805464706_21_0_4')][contains(@fill,#e8cdb7)]");
						selection(Friday);
}					
}
}//List<WebElement> states=driver.findElements(By.xpath("//tbody//tr[11]//select//option"));
	//for(int i=0;i<states.size();i++) {
		//if(s.equalsIgnoreCase(states.get(i).getText())) {
		//	dropDown(dropq8,driver.findElement(By.xpath("//tbody//tr[11]//select//option["+(i+1)+"]")).getText());
		



	

	









//*[@id='yui_3_17_2_1_1682732102339_117']//*[name()='svg']
//*[@id='yui_3_17_2_1_1682733168724_117']//*[name()='svg']