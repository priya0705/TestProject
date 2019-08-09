package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\selenium\\driver\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.toolsqa.com/automation-practice-table/");
		List<WebElement> tbdy= driver.findElements(By.tagName("tbody"));
		//it has no.of elements so to retrieve that we used for loop 
		for(int i=0;i<tbdy.size();i++){
			WebElement trow=tbdy.get(i);
					//to get rows one by one
			List<WebElement>tdata= trow.findElements(By.tagName("td"));
			List<WebElement>thd=trow.findElements(By.tagName("th"));
				//it has no.of data elements so to retrieve that we used for loop 
			for(int j=0;j<tdata.size();j++){
			WebElement we=	tdata.get(j);
			System.out.println(we.getText());
			for(int k=0;k<thd.size();k++){
				WebElement whd=	tdata.get(k);
				System.out.println(whd.getText());
				}

			}
					}
	}

}
