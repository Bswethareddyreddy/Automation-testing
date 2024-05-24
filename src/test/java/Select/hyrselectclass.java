package Select;

import java.lang.StackWalker.Option;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Takescreenshots.Webelement;

public class hyrselectclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ibm.com/docs/en/bpm/8.6.0?topic=toolkit-single-select");
		WebElement hsr = driver.findElement(By.id("toc-version-selector"));	
		hsr.click();
		Select sei=new Select(hsr);
		List<WebElement> sum = sei.getOptions();
		for(WebElement option:sum) {
			System.out.println(option.getText());
		}
		sei.selectByValue("SSFPJS_8.5.7/com.ibm.wbpm.ref.doc/topics/spk_ui_tkt_single_select.html");
		String sale = sei.getFirstSelectedOption().getText();
		System.out.println(sale);

		
		

	}

}
