package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipkartass {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String s=driver.getTitle();
		System.out.println(s);
		Thread.sleep(2000);
		String a=driver.getCurrentUrl();
		System.out.println(a);
		driver.quit();
	}

}
