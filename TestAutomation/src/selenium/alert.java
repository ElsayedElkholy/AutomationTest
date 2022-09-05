package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
                "C:\\chrome\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.echoecho.com/javascript4.htm");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        
        driver.findElement(By.xpath("//input[@value='confirm box']")).click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        driver.findElement(By.xpath("//input[@value='prompt box']")).click();
        String message = alert.getText();
        System.out.println("message = "+ message);
        alert.sendKeys("alsayedelkholy");
        alert.accept();


		driver.close();
		
		
		
	}

}
