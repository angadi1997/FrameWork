package comm.crm.Organization;

import java.io.FileInputStream;
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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Generic_utility.BaseClass;
import com.Generic_utility.Excel_Utility;
import com.Generic_utility.File_Utility;
import com.Generic_utility.Java_Utility;
import com.Generic_utility.WebDriver_Utility;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;
import com.crm.ObjectRepository.Organition;
import com.crm.ObjectRepository.ValidationAndVerification;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(com.Generic_utility.listener.class)

public class Vtigerrr extends BaseClass {
	
//@Test(retryAnalyzer=com.Generic_utility.RetryAnaly.class)
	@Test(groups={"smokeTest"})
	public void createOrganization() throws Throwable
	{
	
	
	File_Utility flib=new File_Utility();  //open system variables
	WebDriver_Utility wlib=new WebDriver_Utility();
	wlib.waitForPageToLoad(driver);
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	/*String URL = flib.getPropertyKeyValues("url");
	String UserName = flib.getPropertyKeyValues("un");
	String PassWord = flib.getPropertyKeyValues("pw");
	driver.get(URL);
	// ur system is slow?
	LoginPage login=new LoginPage(driver); 
	login.login(UserName, PassWord);*/
	
	HomePage home=new HomePage(driver);
	home.getOrganisationlink().click();
	Assert.assertEquals(true, false);
	
	Java_Utility jlib=new Java_Utility();
   int ranNum=jlib.getRanDomNum();

   Random ran=new Random();
   int RanNum=ran.nextInt(1000);

   Excel_Utility elib=new Excel_Utility();
   String data = elib.getDataFromExcel("Sheet1", 0, 0)+ranNum;

 
 Organition org=new Organition(driver);
 org.getImgpluse().click();
 org.accuntname(data);
 //SoftAssert soft=new SoftAssert();
 //soft.assertEquals("A", "B");
 
 org.getSavebtn();
 ValidationAndVerification  validate=new ValidationAndVerification(driver);
 validate.organisationValidation(driver, data);
 home.adminlink();
 home.getSignoutlink().click();
//soft.assertAll();
 
 
	}
/* @Test
 public void modifyOrg()
 {
	 System.out.println("created extra modify");
	 }*/
 }

