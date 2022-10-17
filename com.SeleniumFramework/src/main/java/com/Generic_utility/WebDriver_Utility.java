package com.Generic_utility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver_Utility {

	
	
	
	
	
	/*wait for page load before identifying any synchronized in DOM
	 * 
	 */
	
	public  void waitForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
	
	public void waitForElementWithCustomTimeOut(WebDriver driver , WebElement element,int pollingTime)
	{
	FluentWait wait=new FluentWait(driver);
	wait.pollingEvery(Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(element));
	}
/*
	 After every action it will for next action to perform
	 */
	
	public void scriptTimeOut(WebDriver driver)
	{
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
	}
	
	/*
	 * 
	 */
	public void webForElementToBeClickable(WebDriver driver,WebElement element )
	{
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/*
	 * used to select the value from the dropdown based on index
	 */

	public void select(WebElement element , int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	/*
	 * 	 * used to select the value from the dropdown based on text

	 */
	
	public void select(WebElement element , String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void swithToWindow(WebDriver driver , String partialWindowTitle) {
	       Set<String> set = driver.getWindowHandles();
	         Iterator<String> it = set.iterator();

	          while (it.hasNext()) {
			          String wID = it.next();
			          driver.switchTo().window(wID);
			          String currentWindowTitle = driver.getTitle();
			          if(currentWindowTitle.contains(partialWindowTitle)) 
			          {
			        	  break;
			          }
	          }}
	/*
	 * used to switch to AlertWindow and accept click on ok button
	 */

	public void swithToAlertAndAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/*
	 * used to switch to AlertWindow and dismiss click on cancel button

	 */
	public void swithToAlertAndDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
/*
 * used to switch the frame window based on id or name attribute
 */
	public void swithToFrame(WebDriver driver , String id_name_attribute) 
	{
		driver.switchTo().frame(id_name_attribute);
	}
	
	public void swithToFrame(WebDriver driver , int index)
	{
		driver.switchTo().frame(index);
	}
	/*
	 * used to place mouse cursor on specified element
	 */
	
	public void mouseOverOnElement(WebDriver driver , WebElement elemnet)
	{
		Actions act = new Actions(driver);
		act.moveToElement(elemnet).perform();
		}
	/*
	 * used to right click on specific element
	 */
	
	public void rightClickOnElement(WebDriver driver , WebElement elemnet)
	{
		Actions act = new Actions(driver);
		act.contextClick(elemnet).perform();
	}
	
	
	public void moveByOffest(WebDriver driver,int x,int y)
	{
		Actions act = new Actions(driver);
        act.moveByOffset(x, y).click().perform();
	}
	public void mouseOverAction(WebDriver driver,WebElement Element)
	{
		Actions A=new Actions(driver);
		A.moveToElement(Element).perform();
	}
}
	


	



