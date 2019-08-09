package org.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\selenium\\driver\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  WebElement username= driver.findElement(By.id("email"));
		  username.sendKeys("b.priya0705@gmail.com");
		  WebElement password=driver.findElement(By.id("pass"));
		  password.sendKeys("abc");
		  WebElement msg= driver.findElement(By.className("_5iyx"));
		  System.out.println(msg.getText());
		   System.out.println(msg.getAttribute("class"));
		  WebElement login= driver.findElement(By.xpath("//input[@value='Log In']"));
		  login.click();
		 // driver.navigate().back();
		 // driver.navigate().forward();
		 // driver.navigate().refresh(); 
		  driver.navigate().to("https://www.google.com/gmail/");
		  WebElement usern= driver.findElement(By.id("identifierId"));
		  usern.sendKeys("b.priya0705@gmail.com");
		  WebElement next1= driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		  next1.click();
		  Thread.sleep(5000);
		  WebElement passw=driver.findElement(By.name("password"));
		  passw.sendKeys("abc");
		  WebElement next2= driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		  next2.click();
		  
	}
}
