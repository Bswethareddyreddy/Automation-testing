package sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.irctc.co.in/");
		Thread.sleep(2000);
		WebElement general = driver.findElement(By.xpath("(//div[@role=\"button\"])[2]"));
		
		general.click();
		driver.findElement(By.xpath("//*[@id=\"journeyQuota\"]/div/div[4]/div/ul/p-dropdownitem[2]/li/span")).click();*/
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
		WebElement drpo = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		Select sel=new Select(drpo);
		sel.selectByIndex(2);
		Thread.sleep(3000);
		sel.selectByValue("ASM");
		Thread.sleep(3000);
		sel.selectByVisibleText("India");

	}

}
