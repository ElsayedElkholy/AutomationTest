package selenium;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.Test;

public class TestResult {

    

    	@Test (priority = 1)
    	public void files() throws IOException {
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
