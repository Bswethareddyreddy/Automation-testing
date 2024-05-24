package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement name = driver.findElement(By.name("firstname"));
		WebElement last = driver.findElement(By.name("lastname"));
		name.sendKeys("swetha");
		Thread.sleep(2000);
		name.sendKeys(Keys.CONTROL+"A");
		Thread.sleep(2000);
		name.sendKeys(Keys.CONTROL+"C");
		Thread.sleep(2000);
		last.sendKeys(Keys.CONTROL+"V");
		Thread.sleep(2000);
		
	}

}
