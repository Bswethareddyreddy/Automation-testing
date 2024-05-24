package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.mana
		driver.get("https://www.facebook.com/signup");
		
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		
		firstname.sendKeys("swetha",Keys.CONTROL+"A");

		Thread.sleep(2000);
		firstname.sendKeys(Keys.CONTROL+"C");
		Thread.sleep(2000);
		lastname.sendKeys(Keys.CONTROL+" V");
		Thread.sleep(2000);
		
		
		
	}

}
