package AmazonWorkings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltiptext {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		WebElement Ele = driver.findElement(By.xpath("//img[@title='Chat...']"));
		System.out.println(Ele.getAttribute("title"));
		
		driver.close();

	}

}
