package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignproduct {
	
	
	
	public CreateCampaignproduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//dec
	
	@FindBy(xpath=("//img[@style='padding-left:5px']"))
	private WebElement morelink;
	
	@FindBy(xpath=("//img[@title='Select']"))
	private WebElement PlusImage;
	
	@FindBy(id="search_txt")
	private WebElement searchtextfield;
	
	@FindBy(name="search")
	private WebElement searchbutton;
	
	@FindBy(xpath=("//input[@class='crmButton small save']"))
	private WebElement SaveButton;
	//getter method
	 public WebElement getPlusImage()
	 {
		 return PlusImage;
	 }
	 public WebElement getsearchtextfield()
	 {
		 return searchtextfield;
	 }
	 
		
	 public WebElement getsearchbutton()
	 {
		 return searchbutton;
	 }
	 public WebElement  getSaveButton()
	 {
		 return  SaveButton;
	 }
	 
	 public void PlusImage()
	 
	 {
		 PlusImage.click();
	 }
	 public void searchtextfield(String data1)
	 {
		 searchtextfield.sendKeys(data1);
	 }
	 public void searchbutton()
	 {
		 searchbutton.click();
	 }
	 public void SaveButton()
	 {
		 SaveButton.click();
	 }

}
	
