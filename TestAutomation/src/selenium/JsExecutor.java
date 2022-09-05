package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/guru99home/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement submit = driver.findElement(By.id("philadelphia-field-submit"));
        //submit.Click();
        
        
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        // Scroll Down
        // js.executeScript("arguments[0].scrollIntoView(true);", submit);
        // Click by JavaScript
        //js.executeScript("arguments[0].click();", submit);
        
        // Get All Strings by JavaScript
    	//String pageText = js.executeScript("return document.documentElement.innerText;").toString();
    	        
     	js.executeScript("arguments[0].style.border='3px solid red'", submit);

	}

}
