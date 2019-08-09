package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FBLoginPrac {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\selenium\\driver\\chromedriver.exe" );
		WebDriver d=new ChromeDriver(options);
		d.get("https://www.facebook.com/");
		
	    d.findElement(By.id("email")).sendKeys("b.priya0705@mail.com");
	    
	    d.findElement(By.id("pass")).sendKeys("814abc");
	
		WebElement label=d.findElement(By.className("_5iyx"));
		System.out.println(label.getText());
		d.findElement(By.xpath("//input[@value='Log In']")).click();
	
		
		d.navigate().back();
		d.navigate().forward();
			
	}
}                                      
