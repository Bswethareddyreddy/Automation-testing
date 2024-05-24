package com.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String d=driver.getTitle();
		System.out.println(d);
		String s=driver.getCurrentUrl();
		System.out.println(s);
		Dimension s1=new org.openqa.selenium.Dimension(400,200);
		driver.manage().window().setSize(s1);
		driver.manage().window().setPosition(new Point(200,300 ));
		driver.manage().window().fullscreen();
		Point p=driver.manage().window().getPosition();
		System.out.println(p);
		driver.manage().window().minimize();
		driver.close();

	}

}
