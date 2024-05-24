package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indipendentanddepen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dunzo.com/bangalore");
		driver.findElement(By.xpath("//a[@href=\"/search\"]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Search for item or a store\"]")).sendKeys("orange");
		//find independent x-path
		driver.findElement(By.xpath("//p[text()='Orange - Kinnow']/../../..//button[text()='ADD']")).click();
		
		

	}

}
