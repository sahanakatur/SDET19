package AmazonWorkings;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MMT_dataProvider {

//public static void main(String[] args) {
	
	@Test (dataProvider = "getdata")
	public void selectcities(String src, String dest)
	{
		
		System.out.println("Source= " +src+" and Destination = "+dest);
			
		
		// to get the current date
		
		Date dateObject = new Date();
		
		System.out.println(dateObject.toString());
		
		//Wed Aug 04 18:05:32 IST 2021
		//0		1  2	3		4	5
		//Wed Aug 04 2021
		
		String CurrentDate = dateObject.toString();
		String[] arr = CurrentDate.split(" ");
		
		String day = arr[0];
		String month = arr[1];
		String todaysdate = arr[2];
		String year = arr[5];
		
		String MMTDate = day+" "+month+" "+todaysdate+" "+year;
		
		System.out.println(MMTDate);
		
		// Working on Make My Trip webpage
		
	 	WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		action.moveByOffset(20, 20).click().perform();
		
		
		driver.findElement(By.id("fromCity")).sendKeys(src);
		driver.findElement(By.xpath("//div[text()='"+src+"']")).click();
		
		driver.findElement(By.id("toCity")).sendKeys(dest);
		driver.findElement(By.xpath("//div[text()='"+dest+"']")).click();
		
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		
		// select current date
		driver.findElement(By.xpath("//div[@aria-label='"+ MMTDate +"']")).click();
		
				
		driver.close();
	}
		
		@DataProvider
		public Object[][] getdata()
		{
			Object [][]arr = new Object[5][2];
			
			arr[0][0] = "BOM";
			arr[0][1] = "PNQ";
			
			arr[1][0] = "DEL";
			arr[1][1] = "CLO";
			
			arr[2][0] = "HYD";
			arr[2][1] = "CCU";
			
			arr[3][0] = "BLR";
			arr[3][1] = "GOI";
			
			arr[4][0] = "MAA";
			arr[4][1] = "BLR";
			
			return arr;
					
			
		}
		 
		
	}

