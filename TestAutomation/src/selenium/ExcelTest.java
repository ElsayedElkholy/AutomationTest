package selenium;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class ExcelTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
                "C:\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        
        driver = new ChromeDriver(options);
       

	}
	@AfterMethod
	private void quit() {
		driver.quit();

	}
	@Test (priority = 1)
	public void TestCase() throws IOException   {
		URLcheck();
		ExelFile();
		
	}
	
	public void URLcheck() throws  IOException  { 
		driver.manage().window().maximize();
		driver.get("https://www.vertex42.com/ExcelTemplates/excel-gantt-chart.html");
        driver.findElement(By.xpath("//a[@class='btnDL'][contains(text(),Excel)]")).click();
        checker();
	}
	
	public void checker() throws IOException {
		
	    String url_check=driver.getCurrentUrl();

	    if (url_check == "https://www.vertex42.com/Files/download2/themed.php?file=gantt-chart_L.xlsx") {
			System.out.println("Success :"+driver.getCurrentUrl());
			driver.findElement(By.xpath("//a[@class='btnDL'][contains(text(),Download)]")).click();
			quit();
			}
		else 
	    {
	    	driver.navigate().refresh();
	    	checker();
	    	}
	    }	
        
	

	@Test (priority = 2)
	public void ExelFile() throws IOException {
		File file = new File("C:\\Users\\OWNER\\Downloads/gantt-chart_L.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("GanttChart"); 
        int counter = 0 ;

		for(int i=sheet.getRow(8).getRowNum();i<=sheet.getLastRowNum();i++) {        		
			counter+=1;
		}
		
		System.out.print(counter);
		assertEquals(counter, 36);

		workbook.close();
		}
	}
	
	
	

	
