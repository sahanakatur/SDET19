package AmazonWorkings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookSearch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Harry Potter",Keys.ENTER);

		WebElement price = driver.findElement(By.xpath("//span[contains(text(),'Harry Potter Hagu Shapagrasta Magu')]/ancestor::div[@class='sg-col-inner'][1]/descendant::span[text()='₹239']"));
				
		System.out.println(price.getText());
		
		
		
		
		
		
		driver.close();
		
	}

}
