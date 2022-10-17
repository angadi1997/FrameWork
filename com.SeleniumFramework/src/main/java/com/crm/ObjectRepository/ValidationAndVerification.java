package com.crm.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidationAndVerification {

	
	
	public ValidationAndVerification(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(css="span.lvtHeaderText")
	private WebElement actualOrganizationData;

	//getter

	public WebElement getActualOrganizationData() {
		return actualOrganizationData;
	}
	
	//bussiness
	public void organisationValidation(WebDriver driver,String data)
	{
		
		String act_msg =actualOrganizationData.getText();

		 if(act_msg.contains(data))
		 {
		 	 System.out.println("passed");
		 }
		 else
		 {
		 	 System.out.println("failed");
		 	}
	}

	}
