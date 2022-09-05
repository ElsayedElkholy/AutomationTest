package selenium;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicXpath {

	public static void main(String[] args) throws InterruptedException {

		
		 System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();	
		
	        driver.get("https://www.google.com");
	        WebElement search = driver.findElement(By.name("q"));
			search.sendKeys("Selenium Tutorial");
			search.submit();
	        driver.findElement(By.xpath("(//a/h3/span)[2]")).click();
	    	Thread.sleep(3000);
			driver.close();
	        //driver.findElement(By.xpath("//a[@class=''][contains(text(),'')]")).click();
		 
		
	}

}
