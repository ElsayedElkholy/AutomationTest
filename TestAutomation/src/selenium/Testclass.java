package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
                "C:\\chrome\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("facebook");
		search.submit();
        driver.findElement(By.xpath("(//div/div/div/div/a/h3)[1]")).click();
		String url_check=driver.getCurrentUrl();
	      
	    org.testng.Assert.assertEquals(url_check, "https://ar-ar.facebook.com/");		
        System.out.println("Success :"+driver.getCurrentUrl());
        
		driver.navigate().back();
		driver.navigate().back();
		WebElement search2 = driver.findElement(By.name("q"));
		search2.sendKeys("Selenium Tutorial");
		search2.submit();
        driver.findElement(By.xpath("(//div/div/div/div/a/h3)[2]")).click();
		String url_check2=driver.getCurrentUrl();
	      
	    org.testng.Assert.assertEquals(url_check2, "https://www.tutorialspoint.com/selenium/index.htm");		
        System.out.println("Success :"+driver.getCurrentUrl());
		driver.close();
		

}

}
