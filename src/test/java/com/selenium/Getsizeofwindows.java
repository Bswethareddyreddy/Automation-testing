package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getsizeofwindows {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicibank.com/");
		Thread.sleep(5000);
		org.openqa.selenium.Dimension d=driver.manage().window().getSize();
		System.out.println(d);
		driver.close();

	}

}
