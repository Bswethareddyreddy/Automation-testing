package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tejxpaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		//x-path by attributes
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		//x-path by text functin
		//driver.findElement(By.xpath("//span[text()=\"Shopping cart\"]")).click();
		//x-path by contains
		WebElement unsucess = driver.findElement(By.xpath("//span[contains(text() ,\"unsuccessful\")]"));
		System.out.println(unsucess.getText());

	}

}
