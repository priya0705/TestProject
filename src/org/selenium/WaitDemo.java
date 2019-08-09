package org.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitDemo {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\selenium\\driver\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  WebElement username= driver.findElement(By.id("email"));
		  username.sendKeys("b.priya0705@gmail.com");
	}

}
