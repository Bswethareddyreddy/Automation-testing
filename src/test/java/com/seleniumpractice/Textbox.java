package com.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		WebElement name = driver.findElement(By.name("firstname"));
		WebElement last = driver.findElement(By.name("lastname"));
		if(name.isDisplayed()) {
			System.out.println("yes it is displayed");
		}
		else {
			System.out.println("not");
		}
		 name.sendKeys("b.swetha");
		System.out.println( name.getAttribute("value"));
		Thread.sleep(3000);
		name.sendKeys(Keys.CONTROL+"A");
		Thread.sleep(3000);
		name.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(3000);
		last.sendKeys(Keys.CONTROL+"v");
			
		
		
		
		
	}

}
