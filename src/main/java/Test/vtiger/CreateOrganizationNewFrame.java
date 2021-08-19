package Test.vtiger;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Generic.ReadDataFromPropertyFile;
import com.Generic.WebDriverUtilities;

public class CreateOrganizationNewFrame extends ReadDataFromPropertyFile{

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		ReadDataFromPropertyFile Readprop = new ReadDataFromPropertyFile();

		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverUtilities util = new WebDriverUtilities();
		util.waitImplicitly(driver);
		
		//driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(Readprop.getData("username"));
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(Readprop.getData("password"));
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		//click on Organization 
		
		driver.findElement(By.xpath("//a[text()='Organizations'][1]")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		//Fill all the text fields
		
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("PQRS");
		
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		
		//to switch to childwindow
		
		String parent = driver.getWindowHandle();
		
		Set<String>child = driver.getWindowHandles();
		
		for(String b:child)
		{
			if(!parent.equals(b))
			{
				driver.switchTo().window(b);
				driver.findElement(By.xpath("//a[text()='ABCD']")).click();
			
				Alert a = driver.switchTo().alert();
				a.accept();
			}
			driver.switchTo().window(parent);
		}
				
			
		// description
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("All the dropdowns and checkbox enterd");
						
		//Save
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
				
				
		driver.close();

	}

}
