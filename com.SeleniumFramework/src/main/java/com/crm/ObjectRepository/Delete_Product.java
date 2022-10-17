package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Delete_Product {

	
	public Delete_Product (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Create Product...']")
	private WebElement impusle;
	
	@FindBy(name="productname")
	private WebElement productnamelink;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	
	@FindBy(xpath="//input[@name='Delete']")
	private WebElement Deletelbtn;

	public WebElement getImpusle() {
		return impusle;
	}

	public WebElement getProductnamelink() {
		return productnamelink;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getDeletelbtn() {
		return Deletelbtn;
	}
	
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
public void Deletelbtn()
{
	Deletelbtn.click();
}
}
