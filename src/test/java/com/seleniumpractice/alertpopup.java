package com.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		WebElement alt = driver.findElement(By.id("alertBox"));
		alt.click();
		Alert ae=driver.switchTo().alert();
		System.out.println(ae.getText());
		ae.accept();
		//System.out.println(ae.getText());

	}

}
