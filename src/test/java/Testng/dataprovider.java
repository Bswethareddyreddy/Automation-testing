package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	@DataProvider(name="cred")
	public String[][]senddata(){
		String[][]data= {
				{"yash@gmail.com","yash123"},
				{"ambi@gmail.com","ambi123"},
				{"sandeep@eizitech.com","sand123"}
				
		};
		return data;
		}
	@Test(dataProvider="cred")
	public void tologin(String email,String password) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		
	}

}
