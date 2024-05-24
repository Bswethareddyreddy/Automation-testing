package com.selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class addproducttoflipcart {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		String pafrent=driver.getWindowHandle();
		driver.findElement(By.name("q")).sendKeys("mobile"+Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class=\"_4rR01T\"])[1]")).click();
		Set<String> child = driver.getWindowHandles();
		child.remove(pafrent);
		for(String pr:child) {
			driver.switchTo().window(pr);
			
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")).click();
		}\\