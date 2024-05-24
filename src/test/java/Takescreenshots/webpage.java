package Takescreenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class webpage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Temp=ts.getScreenshotAs(OutputType.FILE);
		File per=new File("./errorshotes/image.png");
		FileHandler.copy(Temp, per);

	}

}

