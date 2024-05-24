package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dream11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.dream11.com/");
		//entering into the frame
		driver.switchTo().frame("send-sms-iframe");
		//driver.findElement(By.id("regEmail")).sendKeys("7019527450");
		//exit into frame
		//driver.switchTo().defaultContent();

	}

}
