package Locators;



import javax.swing.text.Highlighter.Highlight;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		Highlight(driver,driver.findElement(By.id("email")));
		Thread.sleep(2000);
		Highlight(driver,driver.findElement(By.name("pass")));
		Thread.sleep(2000);
		Highlight(driver,driver.findElement(By.linkText("Forgotten account?")));
		Thread.sleep(2000);
		Highlight(driver,driver.findElement(By.partialLinkText("Sign up")));
		Thread.sleep(2000);
		
	}

	private static void Highlight(WebDriver driver, WebElement element) {
		// TODO Auto-generated method stub
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	}

}