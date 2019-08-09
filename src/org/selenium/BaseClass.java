package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	
	public static WebDriver getDriver(String url){
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\selenium\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(url);
		 return driver;
		}
	public static void getScreenShot(WebDriver driver, String Filename) throws IOException{
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
		File des=new File("E:\\Desktop\\java ss\\"+Filename+".jpg");
		FileUtils.copyFile(src, des);
		
		}
	
	public static void cnfrmKey(WebElement element) {
		element.click();
		
	}
	public static void typeKey(WebElement element,String value){
		element.sendKeys(value);
	}
   public static void loginKey(WebElement element){
	  element.click();
   }
	  
	  
  }

