package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Propertiesmyntra {

	public static void main(String[] args) throws IOException  {
		//location /path of the file
		File f=new File("C:\\Basicselanium\\Testdata1\\test.properties");
		FileInputStream fis=new FileInputStream(f);
		//create an object of properties file
		Properties prop=new Properties();
		//load the data in the properties file
		prop.load(fis);
		//using the data from the propertied file
		String ur = prop.getProperty("url");
		//common steps
		WebDriver driver=new ChromeDriver();
		driver.get(ur);
		

	}

}
