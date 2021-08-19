package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunityInfoPage {
	
	public OpportunityInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='small']/../../..//span[@class='dvHeaderText']")
	private WebElement verify_text;
	

	public WebElement getVerify_text() {
		return verify_text;
	}
	
	public boolean verify()
	{
		return verify_text.toString().contains("Campaign Information");
	}
	

}
