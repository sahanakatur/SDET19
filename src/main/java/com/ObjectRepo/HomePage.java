package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Generic.WebDriverUtilities;

/**
 * 
 * @author 91962
 * This class defines the HomePage and its elements - Organization, Contacts, Opportunities and Signout
 * 
 */

public class HomePage extends WebDriverUtilities{
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/** 
	 *  This is for Opportunities
	 */
	
	@FindBy(xpath="//a[text()='Opportunities']")
	private WebElement OpportunityLink;
	
	
	public WebElement getOpportunityLink() {
		return OpportunityLink;
	}

	/**
	 * This is about Organization 
	 */
	@FindBy(xpath = "//a[text()='Organizations'][1]")
	private WebElement Organizationlink;

	public WebElement getOrganizationlink() {
		return Organizationlink;
	}
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement Contactslink;
	
	public WebElement getContactslink() {
		return Contactslink;
	}

	/**
	 * This is for Signout
	 * 
	 */
	
	@FindBy(xpath ="//img[@src='themes/softed/images/user.PNG']")
	private WebElement signoutlogo;
	
	@FindBy(xpath = "//a[.='Sign Out']")
	private WebElement signoutbtn;

		
	public WebElement getSignoutlogo() {
		return signoutlogo;
	}


	public WebElement getSignoutbtn() {
		return signoutbtn;
	}


	/**
	 * Business Library methods for Organization, Opporturties, Contacts and Signout
	 * 
	 */
	
	public void clickon_Opportunity()
	{
		OpportunityLink.click();
	}
	
	public void clickon_organization()
	{
		Organizationlink.click();
	}
	
	public void clickon_contacts()
	{
		Contactslink.click();
	}
	
	public void SignoutFromApp(WebDriver driver) throws InterruptedException
	{
		
		action_mousehover(driver, signoutlogo);
	
		signoutbtn.click();
		
	}

}
