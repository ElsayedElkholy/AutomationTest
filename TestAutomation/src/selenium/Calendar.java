package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hotels.com");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        WebElement date = driver.findElement(By.name("date_form_field"));
        JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].setAttribute('value','"+"2022-09-19 - 2022-09-29"+"');", date);
        
	}

}
