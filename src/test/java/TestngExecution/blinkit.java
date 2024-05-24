package TestngExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class blinkit {
	@Test(groups="smoke")
	public void blinkitlaunch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://blinkforhome.com/");
		Reporter.log("blinkit page",true);
	}



}
