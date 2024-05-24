package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Log in\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		WebElement e=driver.findElement(By.xpath("//span[contains(text(),\"unsuccessful\")]"));
		System.out.println(e.getText());
		Thread.sleep(3000);
		driver.quit();

	}

}
