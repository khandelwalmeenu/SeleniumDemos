package com.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWWebTableHandling extends BaseUI{
		public static void datahandling(List<String>data,int rownum,int cellnum) throws IOException{

	FileInputStream fis = new FileInputStream("//Users//meenakshik//eclipse-workspace//POMdemo//Testdataxml//testdata.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	//Sheet sheet = workbook.getSheet("Sheet2");
	XSSFSheet sheet = workbook.getSheet("Sheet2");
	Row row =  sheet.createRow(0);
	int i = 0;
		for (String value :data) {
			Cell cell =row.createCell(i++);
			cell.setCellValue(value);
			
		}
     FileOutputStream outputstream = new FileOutputStream("//Users//meenakshik//eclipse-workspace//POMdemo//Testdataxml//testdata.xlsx");{
      workbook.write(outputstream);
      outputstream.close();
      System.out.println("data written successfully");
}
		}
   public static void main (String[] args )throws IOException{
	   WebDriver driver = new ChromeDriver();
    	driver.navigate().to("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_population");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	
    	List<WebElement>tableheader = driver.findElements(By.xpath("//table[2]//thead//tr[1]//th"));
    	List<String>colheaders = new ArrayList<>();
    	for (int i = 0;i < tableheader.size();i++) {
    		colheaders.add(tableheader.get(i).getText());
    	}
    	datahandling(colheaders,0,0);
    	
    	
    for(int r = 2;r<3;r++) {
    	WebElement rowhead = driver.findElement(By.xpath("//table[2]//tbody//tr["+r+"]//th"));
    	List<String> rowheads = new ArrayList<>();
    	rowheads.add(rowhead.getText());
    	datahandling(rowheads,r,0);
    }
   }
}
    
		

	
	


