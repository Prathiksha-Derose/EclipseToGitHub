package com.sc.selenium.xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Class {
	
	public static void selectClass() {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	}
	public static void main(String[] args) {
		selectClass();

	}

}
