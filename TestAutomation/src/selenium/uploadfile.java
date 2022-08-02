package selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfile {
    public static void main(String[] args) throws InterruptedException {
    	
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/upload");
        WebElement uploadElement = driver.findElement(By.id("file-upload"));

        uploadElement.sendKeys("E:\\7.jpg");
        driver.findElement(By.id("file-submit")).click();
        
        String uploaded_message=driver.findElement(By.xpath("(//body/div/div/div/h3)[1]")).getText();
      
        org.testng.Assert.assertEquals(uploaded_message, "File Uploaded!");
        System.out.println(uploaded_message);   ;     
        Thread.sleep(3000);
		driver.quit();

    }    
}
