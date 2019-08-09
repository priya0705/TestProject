package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {

	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\selenium\\driver\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File src= ts.getScreenshotAs(OutputType.FILE);
		 File des=new File("E:\\Desktop\\java ss\\login.jpg");
		 FileUtils.copyFile(src, des);
		 
		  WebElement username= driver.findElement(By.id("email"));
		  username.sendKeys("b.priya0705@gmail.com");
		  
		  WebElement password=driver.findElement(By.id("pass"));
		  password.sendKeys("abc");
		  
		  WebElement login= driver.findElement(By.xpath("//input[@value='Log In']"));
		  login.click();
		
	}

}
