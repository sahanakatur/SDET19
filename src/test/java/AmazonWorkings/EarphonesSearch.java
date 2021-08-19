package AmazonWorkings;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EarphonesSearch {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("earphones");
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='s-suggestion']"));
		
		for(WebElement earphone:list)
		{
			System.out.println(earphone.getText());
			
			if (earphone.getText().contains("jbl"))
			{
				earphone.click();
				break;
			}
		}
		
		
	//	driver.close();

	}

}
