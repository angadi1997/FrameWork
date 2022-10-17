package comm.crm.Campaign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.Generic_utility.BaseClass;
import com.Generic_utility.Excel_Utility;
import com.Generic_utility.File_Utility;
import com.Generic_utility.Java_Utility;
import com.Generic_utility.WebDriver_Utility;
import com.crm.ObjectRepository.CreateCampaign;

import com.crm.ObjectRepository.CreateCampaignproduct;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;
import com.crm.ObjectRepository.PomProduct;
import com.crm.ObjectRepository.ValidationAndVerification;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createCampaingwithProduct extends BaseClass{

	
	
	@Test(groups={"rgressionTest"})
	public void createCampaingwithProduct() throws Throwable
		
	{
		/*System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/

		
		/*String BROWSER=flib.getPropertyKeyValues("browser");
		WebDriver driver;
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		else
		{
			driver=new ChromeDriver();
		}*/
		
		File_Utility flib=new File_Utility();

		WebDriver_Utility wlib=new WebDriver_Utility ();
		wlib.waitForPageToLoad(driver);

		String URL=flib.getPropertyKeyValues("url");
		String UserName=flib.getPropertyKeyValues("un");
		String PassWord=flib.getPropertyKeyValues("pw");

		driver.get(URL);
		/*	driver.findElement(By.name("user_name")).sendKeys(UserName);
		driver.findElement(By.name("user_password")).sendKeys(PassWord);
		driver.findElement(By.id("submitButton")).click();*/
		LoginPage login=new LoginPage(driver);
		login.login(UserName,PassWord);
		
		 HomePage home=new HomePage(driver);
		 home.getProductlink().click();
		
        
		/*driver.findElement(By.xpath("//a[.='Products']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();*/

		Java_Utility jlib=new Java_Utility();
		int ranNum=jlib.getRanDomNum();

		Excel_Utility elib=new  Excel_Utility();
		String data=elib.getDataFromExcel("Sheet1", 0, 0) +ranNum;

		PomProduct create=new PomProduct(driver);
		create.getImpusle().click();
		create.productnamelink(data);
		create.getSavebtn().click();
		home.getMorelink().click();
	//wlib.mouseOverOnElement(driver,findElement(By.xpath("//img[@style='padding-left:5px']")));
	     home.getCampaignlink().click();
		
        Java_Utility jlib1=new Java_Utility();
		int ranNum1=jlib1.getRanDomNum();

		Excel_Utility elib1=new  Excel_Utility();
		String data1=elib1.getDataFromExcel("Sheet1", 0, 0) +ranNum1;

		CreateCampaign create1=new CreateCampaign(driver);
		create1.getImagelink().click();
		create1.campaignnamelink(data1);
		
		//navigate to product
		/*driver.findElement(By.xpath("//img[@title='Select']")).click();
		wlib.swithToWindow1(driver, "Products&action");
		driver.findElement(By.id("search_txt")).sendKeys(data);
		driver.findElement(By.name("search")).click();*/
		
		CreateCampaignproduct creat2=new CreateCampaignproduct(driver);
		creat2.getPlusImage().click();
		wlib.swithToWindow(driver, "Products&action");
		creat2.searchtextfield(data);
		creat2.getsearchbutton().click();
		
		driver.findElement(By.xpath("//a[text()='"+data+"']")).click();
		wlib.swithToWindow(driver, "Campaigns&action");
		creat2.getSaveButton();
		
		 ValidationAndVerification  validate=new ValidationAndVerification(driver);
		 validate.organisationValidation(driver, data);
		 home.adminlink();
		 home.getSignoutlink().click();
		
		//driver.findElement(By.xpath("//input[@class='crmButton small save']")).click();
		
	}
	}
	/*@Test
	 public void modifyOrg()
	 {
		 System.out.println("created extra modify");
		 }*/
	
	



