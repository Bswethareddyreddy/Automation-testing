package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class propertietest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Testdata\\testdata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String URL=prop.getProperty("url");
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		
		
		

	}

}
