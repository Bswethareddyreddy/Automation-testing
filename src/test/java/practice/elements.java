package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elements {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		WebElement mesh = driver.findElement(By.xpath("(//input[@font-weight=\"book\"])[1]"));
		mesh.sendKeys("baby products");
		Thread.sleep(4000);
		mesh.clear();
		Thread.sleep(4000);
		mesh.sendKeys("kurta");
		mesh.click();
		System.out.println(mesh.getAttribute("font-weight"));
		System.out.println(mesh.getRect());
		System.out.println(mesh.getCssValue(null));
		
		
		
	}

}
