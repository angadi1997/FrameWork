package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomProduct {

	public PomProduct (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//decla
	@FindBy(xpath="//img[@alt='Create Product...']")
	private WebElement impusle;
	
	@FindBy(name="productname")
	private WebElement productnamelink;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	
	//getter
	public WebElement getImpusle() {
		return impusle;
	}

	public WebElement getProductnamelink() {
		return productnamelink;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	
	//business
	public void impusle()
	{
		impusle.click();
	}
	public void productnamelink(String data)
	{
		productnamelink.sendKeys(data);
	}
	public void savebtn()
	{
		savebtn.click();
	}

	

	
	
}
