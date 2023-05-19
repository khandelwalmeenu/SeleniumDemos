package com.example;



import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserCommands {
	
	static WebDriver driver;
	public static void main (String[]args) {
		
		System.out.println("Which browser?");
		Scanner sc = new Scanner(System.in);		
		
		driver=BrowserConfiguration.browserSetup("https://www.amazon.com", "chrome");
	
		
		
}
}


