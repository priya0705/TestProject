package org.selenium;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownnSelect {

	
	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "D:\\Eclipse workspace\\selenium\\driver\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 WebElement DD=driver.findElement(By.id("day"));
	 Select s=new Select(DD);
	 s.selectByIndex(0);
	 Thread.sleep(2000);
	 s.selectByValue("3");
	 s.selectByValue("4");
	 Thread.sleep(2000);
	 System.out.println(s.isMultiple());
	 List<WebElement> opt=s.getOptions();
	 for(int i=0;i<opt.size();i++){
		 WebElement wl=opt.get(i);
		 System.out.println(wl.getText());
		 
	 }
	
	 WebElement fso=s.getFirstSelectedOption();
	 System.out.println(fso.getText());
	
	 
	 
	}

}
