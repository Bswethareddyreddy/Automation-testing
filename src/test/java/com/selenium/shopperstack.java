package com.selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class shopperstack {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.shoppersstack.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
	for(;;) {
		try {
			driver.findElement(By.partialLinkText("Swagger Documentation")).click();
			break;
		}catch(Exception e) {
			js.executeScript("window.scrollBy(0,500)",true);
		}
	}
	String parent = driver.getWindowHandle();
	Set<String> child = driver.getWindowHandles();
	child.remove(parent);
	for(String window :child) {
		driver.switchTo().window(window);
		driver.findElement(By.linkText("Send email to shoppersstack")).click();
	}
	}
}
