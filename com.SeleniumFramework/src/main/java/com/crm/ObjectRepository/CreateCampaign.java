package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaign {
	
	
//ini
	public CreateCampaign (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//decl


@FindBy(xpath="//img[@title='Create Campaign...']")
private WebElement imagelink;

@FindBy(name="campaignname")
private WebElement campaignnamelink;
@FindBy(xpath="//input[@title='Save [Alt+S]']")
private WebElement savebtn;


//getter



public WebElement getImagelink() {
	return imagelink;
}
public WebElement getCampaignnamelink() {
	return campaignnamelink;
}
public WebElement getSavebtn() {
	return savebtn;
}

public void campaignnamelink(String data)
{
	campaignnamelink.sendKeys(data);
}
public void savebtn()
{
	savebtn.click();
}

}



