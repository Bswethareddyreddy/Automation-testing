package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		
		firstname.sendKeys("swetha");
		
		
		
		Thread.sleep(2000);
		
		
		
	}

}
WebElement ele = driver.findElement(By.id("men"));
//Actions a=new Actions (driver);
//a.moveToElement(ele).click().perform();
//driver.findElement(By.xpath("(//a[@href=\"/sub-category/men-tshirt\"])[1]")).click();
}