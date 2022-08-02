package selenium;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/checkboxes");
        //driver.findElement(By.xpath("(//body/div/div/div/form/input)[1]")).click();
        //boolean Checked1= driver.findElement(By.xpath("(//body/div/div/div/form/input)[1]")).isSelected();
        //boolean Checked2= driver.findElement(By.xpath("(//body/div/div/div/form/input)[2]")).isSelected();
        List<WebElement> checkboxes = driver.findElements(By.xpath("//body/div/div/div/form/input"));
        checkboxes.get(0).click();
        boolean Checked1= checkboxes.get(0).isSelected();
        boolean Checked2= checkboxes.get(1).isSelected();

        if (Checked1 == true && Checked2 == true) {
        System.out.println("Success");
        }
        else
        {
            System.out.println("Fail");

        }
		Thread.sleep(3000);
        driver.quit();
	}

}
