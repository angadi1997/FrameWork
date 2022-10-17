package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organition {

	//init



	public  Organition(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	//Declaration


	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement imgpluse;


	@FindBy(name="accountname")
	private WebElement accuntname;

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;

	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement HederText;

	
	//getter
	public WebElement getImgpluse() {
		return imgpluse;
	}

	public WebElement getAccuntname() {
		return accuntname;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getHederText() {
		return HederText;
	}


	public void  imgpluse()
	{
		imgpluse.click();
	}
	public void accuntname(String data)
	{
		accuntname.sendKeys(data);
	}
	public void savebtn()
	{

		savebtn.click();
	}
	public void HederText(){
		HederText.click();
	}

}


