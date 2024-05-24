package com.seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		WebElement single = driver.findElement(By.id("course"));
		
		Select s=new Select(single);
		List<WebElement> sum = s.getOptions();
		for(WebElement option:sum)
			System.out.println(option.getText());
		s.selectByValue("net");
		WebElement cum = s.getFirstSelectedOption();
		System.out.println("first selected"+cum.getText());
		
	}

}
