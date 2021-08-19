package Test.vtiger;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Generic.Java_util;
import com.Generic.ReadDataFromPropertyFile;
import com.Generic.WebDriverUtilities;

public class CreateOrganizationDropdown extends ReadDataFromPropertyFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		ReadDataFromPropertyFile Readprop = new ReadDataFromPropertyFile();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		
		WebDriverUtilities util = new WebDriverUtilities();
		util.waitImplicitly(driver);
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(Readprop.getData("username"));
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(Readprop.getData("password"));
		
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		//click on Organization 
		
		driver.findElement(By.xpath("//a[text()='Organizations'][1]")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		//Fill the text organization text
		Java_util jutil = new Java_util();
		int random = jutil.random_data();
		String Orgname = "TYSS_"+ random;
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(Orgname);
		
		
		//drop-down selection 
		WebElement ele = driver.findElement(By.xpath("//select[@name='industry']"));
		
		
		util.select_DD(ele, 5);
		
		
		/*Select industry = new Select(ele);
		industry.selectByIndex(5);
		WebElement ele1 = driver.findElement(By.xpath("//select[@name='accounttype']"));
		Select type = new Select(ele1);
		type.selectByIndex(5);
		WebElement ele2 = driver.findElement(By.xpath("//select[@name='rating']"));
		Select rating = new Select(ele2);
		rating.selectByVisibleText("Active");*/
		
		
		
		//checkbox
		
		driver.findElement(By.xpath("//input[@name='emailoptout']")).click();
		driver.findElement(By.xpath("//input[@name='notify_owner']")).click();
		
		
		// description
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("All the dropdowns and checkbox enterd");
				
		//Save
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
		
		
		driver.close();
	}

}
