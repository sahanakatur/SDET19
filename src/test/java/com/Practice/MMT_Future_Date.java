package com.Practice;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MMT_Future_Date {

	public static void main(String[] args) {
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
				
				driver.findElement(By.id("fromCity")).sendKeys("BOM");
				driver.findElement(By.xpath("//div[text()='BOM']")).click();
				
				driver.findElement(By.id("toCity")).sendKeys("PNQ");
				driver.findElement(By.xpath("//div[text()='PNQ']")).click();
				
				driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
				
				int count = 0;
				
				while(count<=11)
				{
				try {
				// select future date
				driver.findElement(By.xpath("//div[@aria-label='Mon Nov 08 2021']")).click();
				break;
				}
				catch(Exception e)
				{
					driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
					count++;
				}
				}
								
				driver.close();

	}

}
