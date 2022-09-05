package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowGuru {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/popup.php");
        
		driver.findElement(By.linkText("Click Here")).click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		Set<String> ids=driver.getWindowHandles();
		
		Iterator <String> itr= ids.iterator();
		String parentID = itr.next();
		String childID = itr.next();
		
		driver.switchTo().window(childID);
		driver.findElement(By.name("emailid")).sendKeys("alsayedelkholy@gmail.com");
		
		String url2=driver.getCurrentUrl();
		System.out.println(url2);

	}
}

