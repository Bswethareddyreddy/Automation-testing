package Select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselect {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		WebElement multi = driver.findElement(By.id("cars"));
	Select s=new Select(multi);
	s.selectByValue("90");
	s.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
	s.selectByValue("399");
	Thread.sleep(3000);
	s.deselectByValue("399");
	System.out.println(s.getFirstSelectedOption().getText());
	System.out.println(s.isMultiple());
		
	}

}
