package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Point {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.hdfcbank.com/personal");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		org.openqa.selenium.Point p=new org.openqa.selenium.Point(100, 200);
		driver.manage().window().setPosition(p);
		//driver.manage().window().setPosition(new Point(100, 200));
		

	}

}
