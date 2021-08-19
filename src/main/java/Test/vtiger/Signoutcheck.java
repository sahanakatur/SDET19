package Test.vtiger;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Generic.ReadDataFromPropertyFile;
import com.Generic.WebDriverUtilities;
import com.ObjectRepo.HomePage;
import com.ObjectRepo.LoginPage;

public class Signoutcheck {
	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");
	
	ReadDataFromPropertyFile Readprop = new ReadDataFromPropertyFile();
			
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost:8888/");
	driver.manage().window().maximize();
	
	WebDriverUtilities util = new WebDriverUtilities();
	util.waitImplicitly(driver);
	
	
	String UN = Readprop.getData("username");
	String PWD = Readprop.getData("password");
	
	
	LoginPage lp = new LoginPage(driver);
	
	lp.login_to_App(UN, PWD);
	
		
	HomePage hp = new HomePage(driver);
	
	//hp.clickon_organization();
	hp.SignoutFromApp(driver);
	
	//driver.close();
	

}
}

