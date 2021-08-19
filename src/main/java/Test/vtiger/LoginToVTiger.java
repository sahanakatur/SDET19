package Test.vtiger;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.dom4j.DocumentException;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Generic.ReadDataFromJson;

//Read Data from JSON file

public class LoginToVTiger extends ReadDataFromJson {

	public static void main(String[] args) throws FileNotFoundException, IOException, DocumentException, ParseException {
		
		ReadDataFromJson Readjson = new ReadDataFromJson();

		WebDriver driver = new ChromeDriver();
		driver.get(Readjson.readdata_json("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(Readjson.readdata_json("username"));
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(Readjson.readdata_json("password"));
		
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		driver.close();

	}

}
/*
// Read Data from XML file

public class LoginToVTiger extends ReadDataFromXml {

	public static void main(String[] args) throws FileNotFoundException, IOException, DocumentException {
		
		ReadDataFromXml Readxml = new ReadDataFromXml();

		WebDriver driver = new ChromeDriver();
		driver.get(Readxml.readdata_xml("//login/url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(Readxml.readdata_xml("//login/username"));
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(Readxml.readdata_xml("//login/password"));
		
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		driver.close();

	}

}*/
/* Read Data from PropertyFile
public class LoginToVTiger extends ReadDataFromPropertyFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		ReadDataFromPropertyFile Readprop = new ReadDataFromPropertyFile();

		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(Readprop.getData("username"));
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(Readprop.getData("password"));
		
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		driver.close();

	}

}*/
