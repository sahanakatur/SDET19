package Test.vtiger;

import org.testng.annotations.Test;

import com.Generic.AutoConstants;
import com.Generic.BaseClass;
import com.ObjectRepo.CreatingNewOpportunityPage;
import com.ObjectRepo.HomePage;
import com.ObjectRepo.OpportuniesPage;
import com.ObjectRepo.OpportunityInfoPage;

public class TC_11 extends BaseClass {
	
	@SuppressWarnings("unused")
	@Test (groups ={"SmokeTest"})
	public void TC_11Test()
	{
		HomePage hp = new HomePage(driver);
		hp.clickon_Opportunity();
		
		OpportuniesPage OP = new OpportuniesPage(driver);
		OP.clickOn_createOpportunity();
		
		CreatingNewOpportunityPage newOppo = new CreatingNewOpportunityPage(driver);
		newOppo.creatingOpportunity_cal(driver, AutoConstants.creatingOpportunity);
		
		
		OpportunityInfoPage OppoInfo = new OpportunityInfoPage(driver);
		OppoInfo.verify();
		if(true)
		{
			System.out.println("pass");
		}
		else
		{	
			System.out.println("Fail");
		}	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

//public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
//		
//		System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");
//		
//		ReadDataFromPropertyFile Readprop = new ReadDataFromPropertyFile();
//				
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://localhost:8888/");
//		driver.manage().window().maximize();
//		
//		WebDriverUtilities util = new WebDriverUtilities();
//		util.waitImplicitly(driver);
//		
//		LoginPage lp = new LoginPage(driver);
//		lp.login_to_App(Readprop.getData("username"), Readprop.getData("password"));
//		
//		HomePage hp = new HomePage(driver);
//		hp.clickon_Opportunity();
//		
//		OpportuniesPage OP = new OpportuniesPage(driver);
//		OP.clickOn_createOpportunity();
//		
//		CreatingNewOpportunityPage newOppo = new CreatingNewOpportunityPage(driver);
//		newOppo.creatingOpportunity_cal(driver, AutoConstants.creatingOpportunity);
//		
//		
//		OpportunityInfoPage OppoInfo = new OpportunityInfoPage(driver);
//		OppoInfo.verify();
//		if(true)
//		{
//			System.out.println("pass");
//		}
//		else
//		{	
//			System.out.println("Fail");
//		}	
//		hp.SignoutFromApp(driver);
//		
//		driver.close();
//	
//	}
//
//}
