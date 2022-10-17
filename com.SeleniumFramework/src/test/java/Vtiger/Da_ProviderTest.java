package Vtiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Da_ProviderTest {

	@Test(dataProvider="dataProviderTest")
	public void companyDetails(String name,String phonum,String num) throws Throwable 
	{
		System.setProperty("Webdriver.gecko.driver","./geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:8888/");
        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");
        driver.findElement(By.id("submitButton")).click();
        
       driver.findElement(By.xpath("//a[.='Products']")).click();
      driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
      driver.findElement(By.name("productname")).sendKeys(name);
      driver.findElement(By.id("productcode")).sendKeys(phonum);
      driver.findElement(By.id("serial_no")).sendKeys(num);
      driver.findElement(By.xpath("//input[@title='Save [Alt+S]'']")).click();
      
      driver.quit();
      Thread.sleep(2000);
	}
	
	
	@DataProvider
	public Object[][] dataProviderTest()
	{
		Object[][] objArr=new Object[3][3];
		objArr[0][0]="hee";
		objArr[0][1]="4567894891";
		objArr[0][2]="01";
		
		objArr[1][0]="abcd";
		objArr[1][1]="4589125876";
		objArr[1][2]="02";
		
		objArr[2][0]="bcdfg";
		objArr[2][1]="7586944583";
		objArr[2][2]="03";
		
		return objArr;
	}
    }





