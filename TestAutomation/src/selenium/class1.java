package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

    public static void TestSeconedResults() throws InterruptedException{
    	System.setProperty("webdriver.chrome.driver",
                "C:\\chrome\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Selenium Tutorial");
		search.submit();
		driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[10]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/h3[1]/span[1]")).click();		
		String url_check=driver.getCurrentUrl();
	      
	    org.testng.Assert.assertEquals(url_check, "https://www.javatpoint.com/selenium-tutorial");		
        System.out.println("Success :"+driver.getCurrentUrl());
	    Thread.sleep(3000);
		driver.close();
    	}
    
    public static void TestThirdResults() throws InterruptedException{
    	System.setProperty("webdriver.chrome.driver",
                "C:\\chrome\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Selenium Tutorial");
		search.submit();
		driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[10]/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/a[1]/h3[1]/span[1]")).click();		
		String url_check=driver.getCurrentUrl();
	      
	    org.testng.Assert.assertEquals(url_check, "https://www.tutorialspoint.com/selenium/index.htm");		
        System.out.println("Success :"+driver.getCurrentUrl());
	    Thread.sleep(3000);
		driver.close();
    	}
}
