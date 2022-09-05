package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://ebay.com");        
        //WebElement electronics = driver.findElement(By.linkText("Electronics"));
        //Actions action = new Actions(driver);
        //action.moveToElement(electronics).build().perform();
        
        
        //WebElement search = driver.findElement(By.id("gh-ac"));
        //search.sendKeys("iphone");
        //Actions action = new Actions(driver);
        //action.doubleClick(search).build().perform();
        WebElement fashion = driver.findElement(By.linkText("Fashion"));
        Actions action = new Actions(driver);
        action.moveToElement(fashion).contextClick().build().perform();
        
        

		
		
	}

}
