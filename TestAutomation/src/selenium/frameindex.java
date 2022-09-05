package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameindex {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://jqueryui.com/droppable/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        // index iframe is 0 
        driver.switchTo().frame(0);
       
        //Drag & Drop
        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        
        action.clickAndHold(drag).moveToElement(drop).release().build().perform();
	}

}
