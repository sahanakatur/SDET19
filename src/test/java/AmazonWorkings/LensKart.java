package AmazonWorkings;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LensKart {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lenskart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//select item from trending 
		
		driver.findElement(By.xpath("//input[@placeholder='What are you looking for ?']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='trending_list menu-link']/li"));
		
		for(WebElement l:list)
		{
			System.out.println(l.getText());
		}
		
		driver.findElement(By.xpath("//a[text()='Ray ban']")).click();
		
		driver.close();
		

	}

}
