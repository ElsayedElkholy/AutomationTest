package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/checkboxes");
        
		int count = driver.findElements(By.xpath("//body/div/div/div/form/input")).size();
		List<WebElement> checkboxes = driver.findElements(By.xpath("//body/div/div/div/form/input"));

		for(int i=0 ; i < count; i++ ) {        
			boolean x= checkboxes.get(i).isSelected();
			if (x == true) {
		        System.out.println("Element number "+i+" already selected");

			}
			else{
		        checkboxes.get(i).click();
		        System.out.println("Element number "+i+" is selected");


			}
		}
	}

}
