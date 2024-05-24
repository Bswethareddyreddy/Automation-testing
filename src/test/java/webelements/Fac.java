package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fac {
	
	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		
		WebElement email = d.findElement(By.id("email"));
		
		
	}

}
