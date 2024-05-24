package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("mobile");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//img[@alt=\"POCO C55 (Power Black, 128 GB)\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA ihZ75k _3AWRsL\"")).click();
	}
}