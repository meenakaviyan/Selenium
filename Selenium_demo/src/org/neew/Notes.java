package org.neew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Notes {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
	        "C:\\Users\\arivu\\eclipse-workspace\\Selenium_Pro\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		
		String user="//td[text()='Important Note:']/parent::tr/parent::tbody/parent::table/preceding-sibling::form/"
				+ "child::table/descendant::tr[2]/child::td[2]/child::input";
		driver.findElement(By.xpath(user)).sendKeys("meenakannan");
		
		
		String pass = "//td[text()='Important Note:']/parent::tr/parent::tbody/parent::table/preceding-sibling::form"
				+ "/child::table/descendant::tr[3]/child::td[2]/child::input";
		driver.findElement(By.xpath(pass)).sendKeys("6UJ6V2");
		
		driver.findElement(By.xpath("(//input)[last()]")).click();
		
	}

}
