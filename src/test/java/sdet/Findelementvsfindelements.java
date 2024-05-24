package sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelementvsfindelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//find element single web element
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("mobile");
		//2
		
	WebElement ele=driver.findElement(By.xpath("//div[@class=\"navFooterVerticalColumn navAccessibility\"]"));
	System.out.println(ele.getText());
		
		
		

	}

}
