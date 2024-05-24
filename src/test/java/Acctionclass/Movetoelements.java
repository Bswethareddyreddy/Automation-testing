package Acctionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Actions as=new Actions(driver);
	//	as.moveByOffset(188, 36).perform();
	//	driver.findElement(By.linkText("Kurtas & Suits")).click();
		// 2nd statargy
		WebElement abc = driver.findElement(By.xpath("(//a[@href=\"/shop/women\"])[1]"));
		as.moveToElement(abc).perform();
		driver.findElement(By.linkText("Kurtas & Suits")).click();
		
		

	}

}
