package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\selenium\\driver\\chromedriver.exe");
			  WebDriver driver=new ChromeDriver();
			  
			  driver.get("https://www.google.com/gmail/");
			  WebElement usern= driver.findElement(By.id("identifierId"));
			  usern.sendKeys("b.priya0705@gmail.com");
			  WebElement next1= driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
			  next1.click();
			  Thread.sleep(5000);
			  WebElement passw=driver.findElement(By.name("password"));
			  passw.sendKeys("814@priya");
			  WebElement next2= driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
			  next2.click();
			  
		}
	
}
