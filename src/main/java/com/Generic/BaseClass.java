package com.Generic;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.ObjectRepo.HomePage;
import com.ObjectRepo.LoginPage;

public class BaseClass {
	
	public WebDriver driver;
	public ReadDataFromPropertyFile Readprop = new ReadDataFromPropertyFile();
	public 	WebDriverUtilities util = new WebDriverUtilities();
	
	
	
	@Parameters("BROWSER") 
	@BeforeClass (groups ={"SmokeTest","RegressionTest"})
	public void LaunchBrowser() throws FileNotFoundException, IOException
	//public void LaunchBrowser(String BROWSER) throws FileNotFoundException, IOException
	{
		String BROWSER = Readprop.getData("Browser");
		
		if(BROWSER.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Firefox not launching");
			//driver = new ChromeDriver();
		}
		
		driver.get(Readprop.getData("url"));
		
		driver.manage().window().maximize();
				
		util.waitImplicitly(driver);
		util.waitforpageload(driver);
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
	}
	
	@BeforeMethod
	public void logintoAppln() throws FileNotFoundException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.login_to_App(Readprop.getData("username"), Readprop.getData("password"));
		
		
	}
	
	@AfterMethod
	public void LogoutAppln() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		hp.SignoutFromApp(driver);
	}
	
	
	
	
	
	
	
	

}
