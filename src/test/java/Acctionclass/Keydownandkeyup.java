package Acctionclass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keydownandkeyup {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dunzo.com/bangalore");
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.keyDown(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		a.keyDown(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		a.keyUp(Keys.ARROW_UP).perform();
		

	}

}
