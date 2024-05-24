package Select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singleselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/DELL/Desktop/hotel.html");
		WebElement menu = driver.findElement(By.id("Empire"));
		//single select
		Select s=new Select(menu);
		//s.selectByIndex(0);
		//s.selectByValue("d");
		//multiple select
		s.selectByIndex(0);
		s.selectByValue("d");
		
		

	}

}
