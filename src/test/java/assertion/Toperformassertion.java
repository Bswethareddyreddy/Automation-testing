package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;



public class Toperformassertion {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ExceptedResult="Online Shopping for Women - Shop For Women Clothes, Shoes, Bags & More";
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver. manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		driver.findElement(By.partialLinkText("Women")).click();
		Assert.assertEquals(ExceptedResult,driver.getTitle(),"our driver control"));

	}

}
