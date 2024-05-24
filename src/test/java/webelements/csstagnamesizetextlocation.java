package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class csstagnamesizetextlocation {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/demo-request");
		Thread.sleep(3000);
		WebElement text = driver.findElement(By.linkText("Try Free"));
		text.getAttribute("href");
		
		
		Thread.sleep(3000);
		System.out.println(text.getCssValue("position"));
		System.out.println(text.getLocation());
		System.out.println(text.getText());
		System.out.println(text.getTagName());
		System.out.println(text.getSize());
		
		

	}

}
