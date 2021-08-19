package AmazonWorkings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MobileSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile under 15000", Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='brandsRefinements']/descendant::li[@aria-label='Redmi']//i[@class='a-icon a-icon-checkbox']")).click();
		
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("//a[text()='Price: High to Low']")).click();
		
		//WebElement price = driver.findElement(By.xpath("//div[@data-index='0']//div//span[text()='₹24,949']"));
		WebElement price = driver.findElement(By.xpath("//div[@data-index='0']//div//span[@data-a-color='price']"));
		String S= price.getText();
		System.out.println(S);
		
		StringBuffer strbuf = new StringBuffer(S);
		StringBuffer str1 = strbuf.deleteCharAt(S.length()-7);
		StringBuffer str2 = strbuf.deleteCharAt(str1.length()-4);
		System.out.println(str2);
		
		String st = new String(str2);
		
		int priceint = Integer.parseInt(st);
		System.out.println(priceint);
		
		if(priceint<=15000)
		{
			System.out.println("pass");
		}
		else
			System.out.println("Fail");
		
		driver.close();
	}

}
