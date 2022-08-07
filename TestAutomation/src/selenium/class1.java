package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class class1 {
	WebDriver driver;

	@BeforeMethod
	public void setup()
	{System.setProperty("webdriver.chrome.driver",
            "C:\\chrome\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();

    driver.get("https://www.google.com");

	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys("Selenium Tutorial");
	search.submit();}

	@AfterMethod
    public void quit(){

	driver.quit();}

	@Test (priority = 1 )
    public void TestSeconedResults(){
        driver.findElement(By.xpath("(//a/h3/span)[2]")).click();
		String url_check=driver.getCurrentUrl();
	      
	    org.testng.Assert.assertEquals(url_check, "https://www.javatpoint.com/selenium-tutorial");		
        System.out.println("Success :"+driver.getCurrentUrl());
    	}
	@Test (priority = 2 )

    public void TestThirdResults()  {
    	
        driver.findElement(By.xpath("(//a/h3/span)[3]")).click();
		String url_check=driver.getCurrentUrl();
	      
	    org.testng.Assert.assertEquals(url_check, "https://www.tutorialspoint.com/selenium/index.htm");		
        System.out.println("Success :"+driver.getCurrentUrl());
    	}
}
