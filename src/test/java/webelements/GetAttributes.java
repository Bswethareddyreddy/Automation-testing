package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributes {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/demo-request");
		Thread.sleep(3000);
		String text = driver.findElement(By.linkText("Try Free")).getAttribute("href");
		Thread.sleep(3000);
		System.out.println(text);

	}

}
