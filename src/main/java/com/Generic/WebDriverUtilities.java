package com.Generic;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilities {
	
	/**
	 * This class contains all the generic methods which are to be performed on webpages
	 */
	
	/**
	 * This method is for select element from drop down using index
	 * @param element
	 * @param index
	 */
	public void select_DD(WebElement element, int index)
	{
		Select select = new Select(element);
		select.selectByIndex(index);
		
	}
	/**
	 * This method is for select element from drop down using visible text
	 * @param element
	 * @param text
	 */
	public void select_DD(WebElement element, String text)
	{
		Select select = new Select(element);
		select.selectByVisibleText(text);
		
	}
	
	/**
	 * This method is for select element from drop down using select by value
	 * @param value
	 * @param element
	 */
	public void select_DD(String value, WebElement element)
	{
		Select select = new Select(element);
		select.selectByValue(value);
		
	}
	
	/**
	 * This method is for perform mousehover action on the element
	 * @param driver
	 * @param element
	 */
	
	public void action_mousehover(WebDriver driver, WebElement element)
	{
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
	}
	
	/**
	 * This method is for perform right click action on the element 
	 * @param driver
	 * @param element
	 */
	
	public void action_rightclick(WebDriver driver, WebElement element)
	{
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
		
	}
	
	/**
	 * This method is for perform double click action on the element
	 * @param driver
	 * @param element
	 */
	
	public void action_doubleclick(WebDriver driver, WebElement element)
	{
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
				
	}
	
	/**
	 * This method is for perform drag and drop action on the element
	 * @param driver
	 * @param source
	 * @param target
	 */
	
	public void action_draganddrop(WebDriver driver, WebElement source, WebElement target)
	{
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
				
	}
	
	/**
	 * @author Sahana
	 * This method is to wait implicitly
	 * @param driver
	 * @param title
	 */
	public void waitImplicitly(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(AutoConstants.implicitwait, TimeUnit.SECONDS);
		
	}
	
	/**
	 * This method is to wait explicitly visibility of the element
	 * @param driver
	 * @param element
	 */
	public void visiblityofelement(WebDriver driver, WebElement element)
	{
		WebDriverWait wb = new WebDriverWait(driver, AutoConstants.explicitwait);
		wb.until(ExpectedConditions.visibilityOf(element));
		
		
	}
	
	/**
	 * This method is to wait explicitly for the element to be clickable
	 * @param driver
	 * @param element
	 */
	public void elementtobeclickable(WebDriver driver, WebElement element)
	{
		WebDriverWait wb = new WebDriverWait(driver, AutoConstants.explicitwait);
		wb.until(ExpectedConditions.elementToBeClickable(element));
				
	}
	
	public void waitforpageload(WebDriver driver)
	{
		driver.manage().timeouts().pageLoadTimeout(AutoConstants.pageloadwait, TimeUnit.SECONDS);
	}
	
	
	
	/**
	 * @author Sahana
	 * 
	 * This method is to switch to the other frame 
	 * 
	 * @param driver
	 * @param element
	 */
	public void switchframe(WebDriver driver,WebElement element) 
	{
		driver.switchTo().frame(element);
	}
	
	public void switchframe(WebDriver driver,String nameorId) 
	{
		driver.switchTo().frame(nameorId);
	}
	
	public void switchframe(WebDriver driver,int index) 
	{
		driver.switchTo().frame(index);
	}
	
	/**
	 * This method is to switch to the child window 
	 * @param driver
	 * @param title
	 */

	public void switchwindow(WebDriver driver, String title) 
	{

		Set<String> windowId = driver.getWindowHandles();
		Iterator<String> iterator=windowId.iterator();

		while(iterator.hasNext()) 
		{
			String window=iterator.next();
			String currenttitle= driver.switchTo().window(window).getTitle();
			if(currenttitle.contains(title)) 
			{	
				break;
			}

		}
	}

}
