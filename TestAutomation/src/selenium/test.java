package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class test {
	
	
public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.ie.driver", "C:\\IEDriver\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
        //WebDriver driver = new InternetExplorerDriver();
	
	    System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();	
	
        driver.get("https://www.robotak.org");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
       
        List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
        int count = listOfInputElements.size();
        System.out.println(count);
        
		//System.out.pritln("It's page source " + driver.getPageSource());
		driver.findElement(By.xpath("//a[@class='btn_1 rounded'][contains(text(),'Login')]")).click();
		driver.findElement(By.name("email")).sendKeys("alsayedelkholy@yahoo.com");
		
		WebElement passBox = driver.findElement(By.name("password"));
		passBox.sendKeys("As9517538624");  
		passBox.submit();
		Thread.sleep(3000);
		driver.close();
     
        
	
	
	
	}


}