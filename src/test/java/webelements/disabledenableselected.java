package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class disabledenableselected {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		WebElement log = driver.findElement(By.xpath("//input[@aria-label=\"Password\"]"));
		System.out.println(log.isDisplayed());
		System.out.println(log.isEnabled());
		System.out.println(log.isSelected());

	}

}
