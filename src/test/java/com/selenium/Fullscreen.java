package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fullscreen {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		driver.manage().window().minimize();
		String s=driver.getTitle();
		System.out.println(s);
		String a=driver.getCurrentUrl();
		System.out.println(a);
		
	}
}
