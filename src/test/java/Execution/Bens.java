package Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bens {
	@Test(groups="functional")
	
public void launched() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mercedes-benz.co.in/");
		Reporter.log(" is launched", true);
		driver.quit();
	
}
}
