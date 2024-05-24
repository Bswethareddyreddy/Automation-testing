package Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Cars {
@Test(groups="functional")
	
	public void launched() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.carwale.com/new-cars/");
			Reporter.log(" carwala is launched", true);
			driver.quit();
		
	}

}
