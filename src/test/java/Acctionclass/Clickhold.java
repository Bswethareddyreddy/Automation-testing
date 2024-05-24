package Acctionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickhold {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("7019527450");
		Thread.sleep(3000);
		WebElement eye = driver.findElement(By.xpath("//div[@class=\"showPassword shownhide\"]"));
		Actions  as=new Actions(driver);
		as.clickAndHold(eye).perform();
		Thread.sleep(2000);
		as.release(eye).perform();

	}

}
