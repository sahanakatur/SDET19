package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportuniesPage {
	
	public OpportuniesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * Elements in Opportunity Page
	 */
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createOppotunityBtn;

	public WebElement getCreateOppotunityBtn() {
		return createOppotunityBtn;
	}
	
	/**
	 * Business Library Methods
	 */
	
	public void clickOn_createOpportunity()
	{
		createOppotunityBtn.click();
	}

}
