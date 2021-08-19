package AmazonWorkings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Emicalculator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement HL_src = driver.findElement(By.xpath("//div[@id='loanamountslider']//span"));
		
		WebElement HL_dest = driver.findElement(By.xpath("//div[@id='loanamountsteps']//span[@class='tick d-none d-sm-table-cell'][2]"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(HL_src, HL_dest).perform();
		
		WebElement int_src = driver.findElement(By.xpath("//div[@id='loaninterestslider']//span"));
		WebElement int_dest= driver.findElement(By.xpath("//div[@id='loanintereststeps']//span[text()='12.5']"));
		
		action.dragAndDrop(int_src, int_dest).perform();
		
		
		driver.close();
		
		
		
		
		
	}

}
