package com.seleniumpractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		//single window
		String parent=driver.getWindowHandle();
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> child = driver.getWindowHandles();
		for(String childwindow:child);
		driver.switchTo().window(parent);

	}

}
