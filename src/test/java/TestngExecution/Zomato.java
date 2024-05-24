package TestngExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Zomato {
	@Test(groups="systemtesting")
	public void Zomatolaunch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/bangalore");
		Reporter.log("zomato page",true);
	}

}
