package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
                "C:\\chrome\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/reg/");
        WebElement day = driver.findElement(By.id("day"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement year = driver.findElement(By.id("year"));

        Select dayvalue= new Select(day);
        Select monthvalue= new Select(month);
        Select yearvalue= new Select(year);

        dayvalue.selectByIndex(11);
        monthvalue.selectByValue("10");
        yearvalue.selectByVisibleText("1997");

		driver.close();
	}

}
