package JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("flowers",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()=\"Images\"]")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(;;) {
			try {
				driver.findElement(By.xpath("(//span[text()=\"Country Living Magazine\"])[1]")).click();
				break;
			}catch(Exception e) {
			
				js.executeScript("window.scrollBy(0,500)", true);
			}
		}

	}

}
