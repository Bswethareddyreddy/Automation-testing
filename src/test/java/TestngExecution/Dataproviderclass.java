package TestngExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderclass {
	@Test(dataProvider="cred")
	public void Tologin (String names1,String pass1) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.instagram.com/");
		WebElement names = driver.findElement(By.name("username"));
		WebElement pass = driver.findElement(By.name("password"));
		names.sendKeys(names1);
		Thread.sleep(3000);
		pass.sendKeys(pass1);
		Thread.sleep(3000);
		driver.quit();
	}
	
	@DataProvider(name="cred")
	public String[][] senddata(){
		String[][] data={
		                 {"swetha@gmail.com" , "swetha123"},
		                 {"vijay@gmail.com", "vijay@123"},
		                 {"paarthu@gmail.com","paathu123"}
		};
		return data;
		
	}

}
