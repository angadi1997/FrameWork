package Vtiger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MyTrip {

	public static void main(String[] args ) throws Throwable {
		System.setProperty("Webdriver.gecko.driver","./geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	FileInputStream fis=new FileInputStream("./comm_data_Properties1.txt");
	Properties pro = new Properties();
	pro.load(fis);
	String URL = pro.getProperty("url");
	String From = pro.getProperty("from");
	String To = pro.getProperty("to");
	driver.get(URL);
	driver.findElement(By.id("fromCity")).click();
	
	FileInputStream fis1=new FileInputStream("./Book5.xlsx");
	Workbook book = WorkbookFactory.create(fis1);
	Sheet sh = book.getSheet("Sheet1");
	Row row = sh.getRow(0);
	Cell cell = row.getCell(0);
	String data = cell.getStringCellValue();
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(data);
	driver.findElement(By.xpath("//p[contains(text(),'Mumbai')]")).click();
	driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
	driver.findElement(By.xpath("//p[contains(text(),'New Delhi')]")).click();
	driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
	
	Thread.sleep(1000);
	String month = "September 2022";
	String date = "30";
	driver.findElement(By.xpath("//div[text()='"+month+"']"
			+"/ancestor::div[@class='DayPicker-Months']/descendant::p[text()='"+date+"']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='RETURN']")).click();
	Thread.sleep(2000);
	
    String month1 = "October 2022";
	String date1 = "1";
	driver.findElement(By.xpath("//div[text()='"+month1+"']"
			+"/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date1+"']")).click();
	
	
	//driver.findElement(By.xpath("//span[text()='Travellers & CLASS']")).click();
	

	
	 }
}
