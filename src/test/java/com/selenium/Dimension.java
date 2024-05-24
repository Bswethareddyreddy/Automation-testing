package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimension {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	    org.openqa.selenium.Dimension d=new org.openqa.selenium.Dimension(200, 300);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		String s=driver.getCurrentUrl();
		System.out.println(s);
		Thread.sleep(2000);
		driver.close();
		

	}

}
