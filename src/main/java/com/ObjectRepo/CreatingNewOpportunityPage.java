package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Generic.AutoConstants;
import com.Generic.Java_util;
import com.Generic.WebDriverUtilities;

public class CreatingNewOpportunityPage extends WebDriverUtilities{
	
	public CreatingNewOpportunityPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * Elements of creating New Opportunity Page
	 */
	@FindBy(xpath="//input[@name='potentialname']")
	private WebElement Opportunity_Name;
	
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif'][1]")
	private WebElement relatedTo_OrgLookupBtn;
	
	@FindBy(xpath="//table[@class='small']/tbody/tr[7]/td[2]/input[1]")
	private WebElement User_radioBtn;
	
	@FindBy(xpath="//table[@class='small']/tbody/tr[7]/td[2]/input[2]")
	private WebElement Group_radioBtn;
	
	@FindBy(xpath="//select[@name='assigned_group_id']")
	private WebElement assigned_group_DD;
	
	@FindBy(xpath="//table[@class='small']/tbody/tr[8]/td[2]/img")
	private WebElement campaign_lookupBtn;
	
	@FindBy(xpath="//table[@class='small']/tbody/tr[*]/td[*]//input[@title='Save [Alt+S]']")
	private WebElement save_Btn;
	
	@FindBy(xpath="//select[@name='sales_stage']")
	private WebElement sales_stage_DD;
	
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement childWin_SearchText;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement childwin_searchBtn;
	
	@FindBy(xpath="//table[@class='small']/tbody/tr[2]/td[1]/a")   //tr[*] need to check whether to hardcode or generalize
	private WebElement childwin_Orgname;
	
	@FindBy(xpath="//table[@class='small']/tbody/tr[*]/td[*]//img[@id='jscal_trigger_closingdate']")
	private WebElement Expected_closeDate;
	
	@FindBy(xpath="//div[@class='calendar']//table//tbody//tr[3]//td[7]")
	private WebElement closeDate_select;

	public WebElement getCloseDate_select() {
		return closeDate_select;
	}

	public WebElement getExpected_closeDate() {
		return Expected_closeDate;
	}

	public WebElement getChildwin_Orgname() {
		return childwin_Orgname;
	}

	public WebElement getChildWin_SearchText() {
		return childWin_SearchText;
	}

	public WebElement getOpportunity_Name() {
		return Opportunity_Name;
	}

	public WebElement getRelatedTo_OrgLookupBtn() {
		return relatedTo_OrgLookupBtn;
	}
	
	public WebElement getUser_radioBtn() {
		return User_radioBtn;
	}

	public WebElement getGroup_radioBtn() {
		return Group_radioBtn;
	}

	public WebElement getAssigned_group_DD() {
		return assigned_group_DD;
	}

	public WebElement getCampaign_lookupBtn() {
		return campaign_lookupBtn;
	}

	public WebElement getSave_Btn() {
		return save_Btn;
	}

	public WebElement getSales_stage_DD() {
		return sales_stage_DD;
	}
	
	
		
	/**
	 * Business Logic
	 */
	
	/**
	 * method for TC_10
	 * @param driver
	 * @param Opportunity_name
	 */
	
	public void creatingOpportunity(WebDriver driver, String Opportunity_name)
	{
		Java_util jutil = new Java_util();
		int random = jutil.random_data();
		
		Opportunity_Name.sendKeys(Opportunity_name+random);
		
		relatedTo_OrgLookupBtn.click();
		switchwindow(driver, AutoConstants.Org_childWindow);
		childWin_SearchText.sendKeys("tyss");
		childwin_searchBtn.click();
		childwin_Orgname.click();
		switchwindow(driver, AutoConstants.MainWindowTitle);
		Group_radioBtn.click();
		assigned_group_DD.click();
		select_DD(assigned_group_DD, 2);
		campaign_lookupBtn.click();
		switchwindow(driver, AutoConstants.Campaigns_childwindow);
		driver.close();
		switchwindow(driver, AutoConstants.MainWindowTitle);
		save_Btn.click();
				
		
	}
	/**
	 * method for TC_11 and TC_12
	 * @param driver
	 * @param Opportunity_name
	 */
	public void creatingOpportunity_cal(WebDriver driver, String Opportunity_name)
	{
		Java_util jutil = new Java_util();
		int random = jutil.random_data();
		
		Opportunity_Name.sendKeys(Opportunity_name+random);
		
		relatedTo_OrgLookupBtn.click();
		switchwindow(driver, AutoConstants.Org_childWindow);
		childWin_SearchText.sendKeys("tyss");
		childwin_searchBtn.click();
		childwin_Orgname.click();
		switchwindow(driver, AutoConstants.MainWindowTitle);
		Group_radioBtn.click();
		assigned_group_DD.click();
		select_DD(assigned_group_DD, 2);
		Expected_closeDate.click();
		closeDate_select.click();
		
		save_Btn.click();
				
		
	}	
		
	
	/**
	 * 
	 * @param driver
	 * @param Opportunity_name
	 */

public void creatingOpportunity_salesstage(WebDriver driver, String Opportunity_name, String sales_stage)
{
	Java_util jutil = new Java_util();
	int random = jutil.random_data();
	
	Opportunity_Name.sendKeys(Opportunity_name+random);
	
	relatedTo_OrgLookupBtn.click();
	switchwindow(driver, AutoConstants.Org_childWindow);
	childWin_SearchText.sendKeys("tyss");
	childwin_searchBtn.click();
	childwin_Orgname.click();
	switchwindow(driver, AutoConstants.MainWindowTitle);
	Group_radioBtn.click();
	assigned_group_DD.click();
	select_DD(assigned_group_DD, 2);
	Expected_closeDate.click();
	closeDate_select.click();
	sales_stage_DD.click();
	
	select_DD(sales_stage_DD,sales_stage);
	
	save_Btn.click();
			
	
}	
	
}


	
	


