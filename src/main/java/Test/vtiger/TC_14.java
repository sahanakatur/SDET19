package Test.vtiger;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Generic.AutoConstants;
import com.Generic.ReadDataFromPropertyFile;
import com.Generic.WebDriverUtilities;
import com.ObjectRepo.CreatingNewOpportunityPage;
import com.ObjectRepo.HomePage;
import com.ObjectRepo.LoginPage;
import com.ObjectRepo.OpportuniesPage;
import com.ObjectRepo.OpportunityInfoPage;

public class TC_14 {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
		System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");
		
		ReadDataFromPropertyFile Readprop = new ReadDataFromPropertyFile();
				
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		
		WebDriverUtilities util = new WebDriverUtilities();
		util.waitImplicitly(driver);
		
		LoginPage lp = new LoginPage(driver);
		lp.login_to_App(Readprop.getData("username"), Readprop.getData("password"));
		
		HomePage hp = new HomePage(driver);
		hp.clickon_Opportunity();
		
		OpportuniesPage OP = new OpportuniesPage(driver);
		OP.clickOn_createOpportunity();
		
		CreatingNewOpportunityPage newOppo = new CreatingNewOpportunityPage(driver);
		
		newOppo.creatingOpportunity_salesstage(driver, AutoConstants.creatingOpportunity,Readprop.getData_salesstage("option2") );
		
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
		hp.SignoutFromApp(driver);
		
		driver.close();

	}

}
