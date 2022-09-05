package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

public class findByAll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://facebook.com");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // find ByAll
        //driver.findElement(new ByAll(By.id("email"),By.name("email"))).sendKeys("alsayedelkholy@yahoo.com");
       
        // find ByChained ( Child )
        //driver.findElement(new ByChained(By.className("_6ltg"), By.tagName("button"))).click();

        // find ByIdOrName
        driver.findElement(new ByIdOrName("email")).sendKeys("alsayedelkholy@yahoo.com");

	}

}
