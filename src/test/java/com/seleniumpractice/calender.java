package com.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		int day=30;
	//	driver.findElement(By.id("first_date_picker")).click();
	//	driver.findElement(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//a[text()="+day+"]")).click();
		
		//second calender
		driver.findElement(By.id("second_date_picker")).click();
		driver.findElement(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td[not(contains(@class,\" ui-datepicker-other-month \"))]//a[text()="+day+"]")).click();
		
		

	}

}
