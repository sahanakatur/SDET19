package AmazonWorkings;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcDropdowns {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//Actions action = new Actions(driver);
		//action.moveByOffset(10, 10).click().perform();
		
		driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		
		for(WebElement l:list)
		{
			System.out.println(l.getText());
			
			if(l.getText().equals("EMI"))
			{
				l.click();
				Thread.sleep(3000);
				System.out.println("Pass");
				
			}
		}
		
		driver.findElement(By.xpath("//a[text()='Select Product']")).click();
		
		List<WebElement> list2 = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		
		for(WebElement l2 : list2)
		{
			System.out.println(l2.getText());
			
			if(l2.getText().equals("Lifestyle"))
			{
				l2.click();
				Thread.sleep(3000);
				System.out.println("Pass");
				
			}
		}
		
	 	driver.close();
			
		
	}

}
