package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //driver.get("http://ebay.com"); 
        //WebElement search = driver.findElement(By.id("gh-ac"));
        //Actions action = new Actions(driver);
        //action.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("iphone").build().perform();      
        
        driver.get("http://skyscanner.com"); 
        WebElement ori = driver.findElement(By.id("fsc-origin-search"));
        ori.clear();
        ori.sendKeys("Amsterdam");
        ori.sendKeys(Keys.TAB);
        
        Actions action = new Actions(driver);
        action.sendKeys("Amman").build().perform();
        
        for(int i=00 ; i>4 ; i++) {
        	
            action.sendKeys(Keys.TAB).build().perform();
        }
        action.sendKeys(Keys.ENTER).build().perform();

        

        
        
        //driver.close();
	}

}
