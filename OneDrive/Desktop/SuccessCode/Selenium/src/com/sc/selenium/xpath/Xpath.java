package com.sc.selenium.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpath {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
//      WebElement search=  driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/header/div/div[2]/form/div/div/input"));
//      search.sendKeys("mobile");
////      search.sendKeys(Keys.ENTER);
//      search.sendKeys(Keys.RETURN);
		
		driver.findElement(By.xpath("//a[@title='Login'][1]")).click();
	WebElement s=driver.findElement(By.xpath("//button[text()='Request OTP']"));
	
	System.out.println(s.getText());
//		driver.close();
      
		
		
		
	}
	
	
	

}
