package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	
	/**
	 * This class tells about Organization Page - click on create Org, search using dropdown 
	 */
	
	public OrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createOrgBtn;

	public WebElement getCreateOrgBtn() {
		return createOrgBtn;
	}
	
	
	@FindBy(xpath="//input[@class='txtBox']")
	private WebElement searchtxtField;
	
	@FindBy(xpath="//select[@name='search_field'][1]")
	private WebElement searchinDDlist;
	
	@FindBy(xpath="//input[@name='submit']")
	private WebElement searchnowBtn;
	
}
