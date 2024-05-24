package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Denzo {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.dunzo.com/");
		
		driver.findElement(By.xpath("//p[text()=\"Search\"]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Search for item or a store\"]")).sendKeys("oranges");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()=\"ADD\"])[1]")).click();
		
		
		Thread.sleep(2000);
		driver.quit();

	}

}



//driver.findElement(By.xpath("//div[@id=\"header\"]/div/div/div/div[3]/a[2]/div/div/div/p")).click();