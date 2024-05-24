package TestngExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Foodpanda {
	@Test(groups="intigration")
	public void Foodpandalaunch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.foodpanda.com/about-foodpanda/");
		Reporter.log("foodpanda page",true);
	}


}
