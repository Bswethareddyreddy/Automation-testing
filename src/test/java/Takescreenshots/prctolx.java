package Takescreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class prctolx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.olx.in/");
		TakesScreenshot ta=(TakesScreenshot)driver;
		File tem=ta.getScreenshotAs(OutputType.FILE);
		File per=new File("./errorshotes/image.png");
		FileHandler.copy(tem, per);
		

	}

}
