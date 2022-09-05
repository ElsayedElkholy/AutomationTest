package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://bbc.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //driver.findElement(By.xpath("//*[text()='News']")).click();

        //driver.findElement(By.xpath("//*[contains(text(),'News')]")).click();
        System.out.println(driver.findElement(By.id("homepage-link")).getAttribute("href")); // get Attributes
		
		
	}

}
