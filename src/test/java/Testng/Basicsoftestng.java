package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class Basicsoftestng {
	@Test(priority=-3,dependsOnMethods = "flipkart")
	public void amazon() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("amazon");
		driver.quit();
	}


@Test(priority=1,invocationCount=3,threadPoolSize=3)
public void myntra() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/");
	Reporter.log("myntra");
	driver.quit();
}

@Test(priority=-1)
public void flipkart() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Reporter.log("flipkart");
	driver.quit();
}

@Test (priority=-2,enabled=false)
public void w3school() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/");
	Reporter.log("w3school");
	driver.quit();
}

}
