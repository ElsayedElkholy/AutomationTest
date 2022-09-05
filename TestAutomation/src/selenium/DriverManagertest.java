package selenium;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverManagertest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();        
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


        driver.get("http://www.google.com");
        
        driver.findElement(By.name("q")).sendKeys("Egypt");


        WebElement searchlist = driver.findElement(By.xpath("//ul[@role='listbox']"));
        List <WebElement> allsug = searchlist.findElements(By.tagName("span"));
        System.out.println(allsug.size());
        
        for(int i=0; i<allsug.size(); i++){
        	
        	
        	System.out.println(allsug.get(i).getText());
	
        }
        //System.out.println(searchlist.findElements(By.tagName("span")).size()); 



        
       
        		
    


	}

}
