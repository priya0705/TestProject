package org.selenium;

    import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class CheapAirProram {

		public static void main(String[] args) throws AWTException, InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\selenium\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.cheapair.com/");
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    Robot r=new Robot();
		    WebElement fromTxt = driver.findElement(By.id("from1"));
		    fromTxt.click();
		    fromTxt.sendKeys("Madu");
		    Thread.sleep(3000);
		    r.keyPress(KeyEvent.VK_ENTER);
		    r.keyRelease(KeyEvent.VK_ENTER);
		    WebElement toTxt = driver.findElement(By.id("to1"));
		    toTxt.click();
		    toTxt.sendKeys("Coimbatore");
		    Thread.sleep(3000);
		    r.keyPress(KeyEvent.VK_ENTER);
		    r.keyRelease(KeyEvent.VK_ENTER);
		    WebElement sDate = driver.findElement(By.xpath("//a[text()='1']"));
		    Thread.sleep(3000);
		    sDate.click();
		    WebElement eDate = driver.findElement(By.xpath("//a[text()='2']"));
		    
		    Thread.sleep(3000);
		    eDate.click();
		    WebElement searchBtn = driver.findElement(By.xpath("//button[text()='Search Flights']"));
		    searchBtn.click();
		    Set<String> w = driver.getWindowHandles();
		    List<String> lw=new ArrayList<String>(w);
		    driver.switchTo().window(lw.get(1)); 
		    WebElement popUp = driver.findElement(By.xpath("//span[@class='link fltactmdl-signup-no-thanks']"));
		    popUp.click();
		    WebElement filterBtn = driver.findElement(By.xpath("//div[@class='fltrt-filter-cat clearfix']"));
		    filterBtn.click();
		    WebElement staPoint = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-state-default ui-corner-all'][1]"));
		    staPoint.click();
		    
		    for(int i=1;i<27;i++)
		    {
		    r.keyPress(KeyEvent.VK_RIGHT);
		    r.keyRelease(KeyEvent.VK_RIGHT);
		    }
		    Thread.sleep(3000);
		    WebElement x=driver.findElement(By.className("x-icon-x "));
		    x.click();
		    
		
		
		}

	}



