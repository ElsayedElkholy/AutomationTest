package selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/checkboxes");
        driver.findElement(By.id("checkboxes"));
        driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/form[1]/input[1]")).click();
        boolean Checked= driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/form[1]/input[1]")).isSelected();

        if (Checked == true) {
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
