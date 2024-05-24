package Acctionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Contextclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//driver.findElement(By.xpath("//button[text()=\"Stay signed out\"]")).click();
		
		WebElement ele = driver.findElement(By.xpath("(//input[@value=\"I'm Feeling Lucky\"])[2]"));
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
		

	}

}
