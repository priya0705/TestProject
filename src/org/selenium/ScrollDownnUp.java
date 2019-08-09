package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownnUp {
	
   public static void main(String[] args) throws InterruptedException {
				
	System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    WebElement link =driver.findElement(By.linkText("Create Page"));
    
    JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", link);
	
	Thread.sleep(3000);
	
	WebElement username= driver.findElement(By.id("email"));
    js.executeScript("arguments[0].scrollIntoView(false)",username);

	}

}
