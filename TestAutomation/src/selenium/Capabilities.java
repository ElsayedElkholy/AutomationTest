package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class Capabilities {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		// SSL Certificates
		option.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		// Insecured sites
		option.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		// incognito Browser
        option.addArguments("--incognito");

		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("http://bbc.com");
		
		
		
	}

}
