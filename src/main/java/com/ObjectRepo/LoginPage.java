package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement usernametextfld;
	
	@FindBy(xpath= "//input[@name='user_password']")
	private WebElement passwordtextfld;
	
	@FindBy(xpath = "//input[@id='submitButton']")
	private WebElement submitbtn;

	public WebElement getUsernametextfld() {
		return usernametextfld;
	}

	public WebElement getPasswordtextfld() {
		return passwordtextfld;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	
	public void login_to_App(String username, String password)
	{
		usernametextfld.sendKeys(username);
		passwordtextfld.sendKeys(password);
		submitbtn.click();
	}
	
	public void login_to_App()
	{
		usernametextfld.sendKeys("admin");
		passwordtextfld.sendKeys("admin");
		submitbtn.click();
	}
	
		
}
