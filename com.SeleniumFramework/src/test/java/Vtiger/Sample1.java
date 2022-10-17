package Vtiger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {


	public static void main(String[] args) throws Throwable {
		System.setProperty("Webdriver.gecko.driver","./geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	FileInputStream fis=new FileInputStream("./Book3.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet("Sheet1");
	Row row = sh.getRow(0);
	Cell cell = row.getCell(0);
	String data = cell.getStringCellValue();
	System.out.println(data);
	
	}
}
