package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions setting=new ChromeOptions();
		//setting.addArguments("---disable-notifications");
		//setting.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(setting);
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");

	}

}
