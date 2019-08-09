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

public class Screenshot {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse workspace\\selenium\\driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		 Thread.sleep(3000);
		 
		 TakesScreenshot ts=(TakesScreenshot)driver;
		File Src= ts.getScreenshotAs(OutputType.FILE);
		File des= new File("E:\\Desktop\\java ss\\cnfrm.jpg");
		FileUtils.copyFile(Src,des);
		 WebElement cnfrmAlrt=driver.findElement(By.name("confirmation"));
		 cnfrmAlrt.click();
	}

}
