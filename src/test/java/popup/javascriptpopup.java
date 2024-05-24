package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptpopup {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		/*driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");
		driver.findElement(By.linkText("CONTINUE")).click();
		//alert popup
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();*/
		
		/*//conformation popup
		driver.get("https://licindia.in/");
		driver.findElement(By.linkText(" Login ")).click();
		Alert a=driver.switchTo().alert();
		a.dismiss();*/
		
		//prompt popup
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()=\"Try it\"]")).click();
		Alert as=driver.switchTo().alert();
		as.sendKeys("swetha");
		as.accept();;
	}

}
