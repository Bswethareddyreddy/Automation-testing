package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basicjava {
	@Test(priority = 1,invocationCount=2,threadPoolSize=2)
	public void instagram() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Reporter.log("instagram page is launched", true);
		driver.quit();
		
		
	}
	
		@Test(priority = 0,enabled=false)
		public void facebook() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Reporter.log("facebook page is launched", true);
			driver.quit();
			
	//remove priority to run dependencyonmethod		
		}
		@Test(priority = 3,dependsOnMethods="instagram")
		public void Bms() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://in.bookmyshow.com/");
			Reporter.log("Bms page is launched", true);
			driver.quit();
			
			
		}

}
