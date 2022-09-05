package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Limiting {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://bbc.com");
        WebElement footer = driver.findElement(By.className("orb-footer-primary-links"));
        
        System.out.println(footer.findElements(By.tagName("a")).size()); 
        

        
        
    


	
	}

}
