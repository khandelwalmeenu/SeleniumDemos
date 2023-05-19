package com.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.google.common.collect.Table.Cell;

public class HWWebTablehandling2  extends BrowserConfiguration{

	
	
	public static void webDataToExcel(List<WebElement> rank,List<String> data, 
	int rowsize,int colsize,String sheetname) throws IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\senth\\eclipse-workspace\\POMDemo\\testdata\\testdata.xlsx");
	 XSSFWorkbook workbook=new XSSFWorkbook(fis);
	 XSSFSheet sheet;
	if(workbook.getSheet(sheetname)==null) {
	 sheet=workbook.createSheet(sheetname);
	 }
	 else {
	 sheet=workbook.getSheet(sheetname);
	 }
	Row row;
	 int i=0;
	 for(int j=0;j<rowsize;j++) {
	 row=sheet.createRow(j);
	 for(int k=0;k<colsize;k++) {
	 Cell cell=row.createCell(k);
	 cell.setCellValue(data.get(i++));
	}
	}
	 i=0;
	 for(int r=1;r<rowsize;r++) {
	 row=sheet.getRow(r);
	 Cell cell=row.getCell(0);
	 ((org.apache.poi.ss.usermodel.Cell) cell).setCellValue(rank.get(i++).getText());
	 }
	 FileOutputStream os=new FileOutputStream("//Users//meenakshik//eclipse-workspace//POMdemo//Testdataxml//testdata.xlsx");
	 workbook.write(os);
	 workbook.close();
	 os.close();
	 System.out.println("Successfully Written");
	 
	 }
	
	 
	
	 public static void main(String[] args) throws IOException, InterruptedException {
	 driver=BrowserConfiguration.browserSetup("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_population");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 int rowcount,colcount;
	 List<WebElement> th=driver.findElements(By.xpath("//table[2]//thead//tr[1]//th"));
	 colcount=th.size();
	 List<String> column_values = new ArrayList<>();
	 for (int h = 0; h < th.size(); h++) {
	 column_values.add(th.get(h).getText());
	 }
	 List<WebElement> tr=driver.findElements(By.xpath("//table[2]//tbody//tr"));
	 rowcount=tr.size();
	 List<WebElement> rank=new ArrayList<>();
	 rank.add(driver.findElement(By.xpath("//table[2]//tbody//tr[1]//td//b")));
	 for(int i=1;i<rowcount;i++) {
	 rank.add(driver.findElement(By.xpath("//table[2]//tbody//tr["+(i+1)+"]//th")));
	 }
	 for(int i=0;i<rowcount;i++) {
	 List<WebElement> td=driver.findElements(By.xpath("//table[2]//tbody//tr["+(i+1)+"]//td"));
	 for (int k = 0; k < td.size(); k++) {
	 column_values.add(td.get(k).getText());
	
	 }
	 }
	 webDataToExcel(rank,cloumn values,rowcount,colcount,"Sheet2");
	 }
}
	
	
	
	 

