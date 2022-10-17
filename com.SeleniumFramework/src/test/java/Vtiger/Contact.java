package Vtiger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Contact {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("Webdriver.gecko.driver","./geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	FileInputStream fis=new FileInputStream("./common_Data.properties.txt");
	Properties pro = new Properties();
	pro.load(fis);
	String URL = pro.getProperty("url");
	String UserName = pro.getProperty("un");
	String PassWord = pro.getProperty("pw");
	driver.get(URL);
	driver.findElement(By.name("user_name")).sendKeys(UserName);
	driver.findElement(By.name("user_password")).sendKeys(PassWord);
	driver.findElement(By.id("submitButton")).click();

	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();

	}
}
