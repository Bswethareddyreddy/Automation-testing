package Takescreenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Webelement {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/");
		File Temp=driver.findElement(By.xpath("//img [@alt=\"Udemy\" and @loading=\"lazy\"]")).getScreenshotAs(OutputType.FILE);
		File per=new File("./errorshotes/image.png");
		FileHandler.copy(Temp, per);
	}

}
