package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getrect {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement name = driver.findElement(By.name("firstname"));
		WebElement last = driver.findElement(By.name("lastname"));
		Thread.sleep(2000);
		Rectangle nametextfield=name.getRect();
		Rectangle lastnametextfield=last.getRect();
		Thread.sleep(2000);
		System.out.println(nametextfield.getX());
		System.out.println(lastnametextfield.getX());
		Thread.sleep(2000);
		if(nametextfield.getX()==lastnametextfield.getX()) {
			System.out.println("X axis is similar");
		}
		else
			System.out.println("x axis is not similar");
		//System.out.println(nametextfield.getHeight());
		//System.out.println(lastnametextfield.getHeight());
		

	}

}
