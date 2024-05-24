package com.seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownmultipleselect {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		WebElement multi = driver.findElement(By.id("ide"));
		Select ms=new Select(multi);
		List<WebElement> ide = ms.getOptions();
		for(WebElement dum:ide)
		System.out.println(dum.getText());
		ms.selectByValue("ec");
		ms.selectByVisibleText("Visual Studio");
	}

}
