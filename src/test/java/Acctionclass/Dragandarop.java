package Acctionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragandarop {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trello.com/");
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("swethacamma@gmail.com");
		driver.findElement(By.xpath("(//span[@class=\"css-178ag6o\"])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Bswetha@1994");
		driver.findElement(By.xpath("(//span[@class=\"css-178ag6o\"])[1]")).click();
		driver.findElement(By.xpath("//div[text()='automation']")).click();
		WebElement scr = driver.findElement(By.linkText("Friday"));
		WebElement dest = driver.findElement(By.xpath("//h2[text()='drag and drop']/../../..//button[text()='Add a card']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(scr, dest).perform();
		
		
		

	}

}
