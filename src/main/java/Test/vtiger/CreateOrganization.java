package Test.vtiger;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Generic.Java_util;
import com.Generic.ReadDataFromPropertyFile;
import com.Generic.WebDriverUtilities;
import com.ObjectRepo.HomePage;
import com.ObjectRepo.LoginPage;

public class CreateOrganization extends ReadDataFromPropertyFile {
	/**
	 * This is to create Organization
	 * @param args
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws InterruptedException 
	 */

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");
		
		ReadDataFromPropertyFile Readprop = new ReadDataFromPropertyFile();
				
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		
		WebDriverUtilities util = new WebDriverUtilities();
		util.waitImplicitly(driver);
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String UN = Readprop.getData("username");
		String PWD = Readprop.getData("password");
		
		//driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(Readprop.getData("username"));
		//driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(Readprop.getData("password"));
		
		//driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		
		LoginPage lp = new LoginPage(driver);
		
		lp.login_to_App(UN, PWD);
		
		//click on Organization 
		//driver.findElement(By.xpath("//a[text()='Organizations'][1]")).click();
		
		HomePage hp = new HomePage(driver);
		hp.clickon_organization();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		//Fill all the text fields
		
		Java_util jutil = new Java_util();
		int random = jutil.random_data();
		String Orgname = "TYSS_"+ random;
		//System.out.println(Orgname);
		
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(Orgname);
				
		driver.findElement(By.xpath("//input[@name='website']")).sendKeys("www.ABCD.com");
		//driver.findElement(By.xpath("//input[@name='tickersymbol']")).sendKeys("AD");
		driver.findElement(By.xpath("//input[@id='employees']")).sendKeys("50");
		driver.findElement(By.xpath("//input[@id='email2']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9885636456");
		driver.findElement(By.xpath("//input[@id='fax']")).sendKeys("9885636456");
		driver.findElement(By.xpath("//input[@id='otherphone']")).sendKeys("9445636856");
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("abcd@yahoo.com");
		driver.findElement(By.xpath("//input[@id='ownership']")).sendKeys("XYZ");
		driver.findElement(By.xpath("//input[@id='siccode']")).sendKeys("123");
		
		//Billing details
		driver.findElement(By.xpath("//textarea[@name='bill_street']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@name='bill_pobox']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@name='bill_city']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@name='bill_state']")).sendKeys("Karnataka");
		driver.findElement(By.xpath("//input[@name='bill_code']")).sendKeys("560123");
		driver.findElement(By.xpath("//input[@name='bill_country']")).sendKeys("India");
		
			
		// shipping details
		driver.findElement(By.xpath("//textarea[@name='ship_street']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@name='ship_pobox']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@name='ship_city']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@name='ship_state']")).sendKeys("Karnataka");
		driver.findElement(By.xpath("//input[@name='ship_code']")).sendKeys("560456");
		driver.findElement(By.xpath("//input[@name='ship_country']")).sendKeys("India");
		
		// description
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("All text fields entered");
		
		//Save
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
		
		
		//Signout
		
		hp.SignoutFromApp(driver);
		
		
		driver.close();
		
		
	}

}
