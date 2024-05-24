package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;




public class myntra {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	String ExceptedResult="Door mat";
	driver.manage().window().maximize();
	driver. manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.myntra.com/");
	Actions a=new Actions(driver);
	a.moveByOffset(387,36).perform();
	driver.findElement(By.linkText("Door Mats")).click();
	Assert.assertEquals(driver.getTitle(), ExceptedResult,"page is not landed");
	
		
		
}
}
