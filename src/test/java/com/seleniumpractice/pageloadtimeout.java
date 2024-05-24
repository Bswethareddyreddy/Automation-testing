package com.seleniumpractice;



import java.time.Duration;
import java.time.Instant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class pageloadtimeout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Instant starttime=Instant.now();
        System.out.println(starttime.toString());
		driver.get("https://www.facebook.com/signup");
		Instant endtime=Instant.now();
        System.out.println(endtime.toString());
        Duration time=Duration.between(starttime, endtime);
        System.out.println("actual time"+time.toMillis());

	}

}
