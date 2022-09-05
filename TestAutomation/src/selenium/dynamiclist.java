package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dynamiclist {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
                "C:\\chrome\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.booking.com");
        driver.findElement(By.xpath("(//header/nav/ul/li/a)[2]")).click();
        driver.findElement(By.cssSelector("[id$=origin-airport-display]")).click();
        driver.findElement(By.id("ap-CAI/9087")).click();
        driver.findElement(By.xpath("//form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]")).click();
        driver.findElement(By.cssSelector("[id$='ap-CAI/9087']")).click();

        //driver.findElement(By.cssSelector("#ss")).click();
        //System.out.println(driver.findElement(By.xpath("(//span[@class='search_hl_name'])[2]")).getText());
        




		driver.close();
	}

}
