package com.selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handels {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String g=driver.getTitle();
		System.out.println(g);
		String source=driver.getPageSource();
		System.out.println(source);
		String id=driver.getWindowHandle();
		System.out.println(id);
		Thread.sleep(3000);
		Set<String> ids=driver.getWindowHandles();
		System.out.println(ids);
		driver.close();
		
		
		
	}

}
