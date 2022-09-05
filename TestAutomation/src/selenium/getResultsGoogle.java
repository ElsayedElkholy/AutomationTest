package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getResultsGoogle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();        
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        driver.get("http://www.google.com");
        
        driver.findElement(By.name("q")).sendKeys("Egypt");


        WebElement searchlist = driver.findElement(By.xpath("//ul[@role='listbox']"));
        List <WebElement> allsug = searchlist.findElements(By.tagName("span"));
        System.out.println(allsug.size());
    	
        System.out.println(allsug.get(0).getText());

    	
//        for(int i = 0; i < allsug.size() ; i++ ){
//        	
//        	
//        	System.out.println(allsug.get(i).getText());
//	
//        }

	}

}
