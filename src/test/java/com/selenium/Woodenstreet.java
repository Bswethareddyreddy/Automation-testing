package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Woodenstreet {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.xpath("//a[.=\"Sofas\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//p[@class=\"category-name\"])[1]")).click();
		Thread.sleep(3000);
		
		

	}

}
