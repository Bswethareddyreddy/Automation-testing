package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Staleelementexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.myntra.com/");
		WebElement element = driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]"));
		driver.navigate().refresh();
		element.sendKeys("watches");

	}

}
