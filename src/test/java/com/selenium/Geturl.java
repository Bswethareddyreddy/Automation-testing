package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Geturl {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://licindia.in/apply-now");
		String d=driver.getTitle();
		System.out.println(d);
		Thread.sleep(3000);
		String s=driver.getCurrentUrl();
		System.out.println(s);
		driver.manage().window().minimize();
		driver.quit();
	}

}
