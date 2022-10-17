package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//initialization
	
	
	
	public  LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(name="user_name")
	 private WebElement UserNameTextField;
	
	@FindBy(name="user_password")
	private WebElement PassWordTextField;
	
	@FindBy(id="submitButton")
	private WebElement submitBtn;
	
	
	//getter method

	public WebElement getUserNameTextField() {
		return UserNameTextField;
	}

	public WebElement getPassWordTextField() {
		return PassWordTextField;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	

	//business logic
		/*
		 * this method is used to login the app
		 */
		

	public void login(String UserName,String PassWord)
	{
		UserNameTextField.sendKeys(UserName);
		PassWordTextField.sendKeys(PassWord);
		submitBtn.click();
		
	}
	}
