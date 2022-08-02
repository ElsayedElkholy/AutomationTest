package selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
                "C:\\chrome\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
        String v1 = driver.findElement(By.xpath("(//table[@id='customers']/tbody/tr[4]/td[1])")).getText();
        String v2 = driver.findElement(By.xpath("(//table[@id='customers']/tbody/tr[4]/td[3])")).getText();
        assertEquals(v1+","+v2, "Ernst Handel,Austria");
        System.out.println("Success :"+v1+","+v2);
		driver.close();
		
		
	}

}
