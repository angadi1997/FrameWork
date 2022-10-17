package comm.crm.Campaign;


import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Generic_utility.BaseClass;
import com.Generic_utility.Excel_Utility;
import com.Generic_utility.File_Utility;
import com.Generic_utility.Java_Utility;
import com.Generic_utility.WebDriver_Utility;
import com.crm.ObjectRepository.CreateCampaign;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;
import com.crm.ObjectRepository.Organition;
import com.crm.ObjectRepository.ValidationAndVerification;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Campaign extends BaseClass {

	
	@Test(groups={"smokeTest"})
	public void createCampaign() throws Throwable {
		
	/*System.setProperty("Webdriver.gecko.driver","./geckodriver.exe");
	WebDriver driver = new FirefoxDriver();*/
		
		File_Utility flib = new File_Utility();
		/*String BROWSER=flib.getPropertyKeyValues("browser");
		WebDriver driver;
		
		if(BROWSER.equalsIgnoreCase("firefox"))
		{
			
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			}
		
		else if (BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			}
		
		
		else
		{
			driver=new ChromeDriver();
	     }*/
		WebDriver_Utility wlib=new WebDriver_Utility();
		wlib.waitForPageToLoad(driver);
		
		
		/*System.setProperty("Webdriver.gecko.driver","./geckodriver.exe");
		WebDriver driver = new FirefoxDriver();*/
		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	/*String URL = flib.getPropertyKeyValues("url");
	String UserName = flib.getPropertyKeyValues("un");
	String PassWord = flib.getPropertyKeyValues("pw");
	driver.get(URL);
	
	LoginPage login=new LoginPage(driver);
    login.login(UserName, PassWord);*/
    
    HomePage home=new HomePage(driver);
    home.getMorelink().click();
    home.getCampaignlink().click();
    


/*driver.findElement(By.xpath("//img[@style='padding-left:5px']")).click();
driver.findElement(By.name("Campaigns")).click();
driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();*/

Java_Utility jlib=new Java_Utility();
int ranNum=jlib.getRanDomNum();

Random ran=new Random();
int RanNum=ran.nextInt(1000);

Excel_Utility elib=new Excel_Utility();
String data = elib.getDataFromExcel("Sheet1", 0, 0)+ranNum;


CreateCampaign campaign=new CreateCampaign(driver);
campaign.getImagelink().click();
campaign.campaignnamelink(data);
campaign.getSavebtn();
ValidationAndVerification  validate=new ValidationAndVerification(driver);
validate.organisationValidation(driver, data);
home.adminlink();
home.getSignoutlink().click();
	}
}


/*driver.findElement(By.name("campaignname")).sendKeys(data);

driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();*/
/*String act_msg = driver.findElement(By.cssSelector("span.dvHeaderText")).getText();
if(act_msg.contains(data))
{
	 System.out.println("passed");
}
else
{
	 System.out.println("failed");
 }

home.adminlink();
home.getSignoutlink().click();*/

/*Actions a=new Actions(driver);
a.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
driver.close();*/

	/*@Test
	 public void modifyOrg()
	 {
		 System.out.println("created extra modify");
		 }*/

