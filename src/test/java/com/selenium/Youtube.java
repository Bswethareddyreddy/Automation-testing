package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("god songs");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"style-scope ytd-searchbox\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//yt-formatted-string[contains(@aria-label,\"Hanuman Chalisa\")])[1]")).click();
		Thread.sleep(2000);
		

	}

}
