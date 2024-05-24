package Testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chronologyorder {
	@BeforeSuite
	public void beforesuite() {
		Reporter.log("before suit is getting launched",true);
	}
	@AfterSuite
	public void aftersuite() {
		Reporter.log("After suit is getting launched",true);
	}
	@BeforeClass
	public void beforeclass() {
		Reporter.log("before class is getting launched",true);
	}
	@AfterClass
	public void Afterclass() {
		Reporter.log("After Class is getting launched",true);
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("before Method is getting launched",true);
	}
	@AfterMethod
	public void Aftermethod() {
		Reporter.log("After method is getting launched",true);
	}
	@BeforeTest
	public void beforetest() {
		Reporter.log("before test is getting launched",true);
	}
	@AfterTest
	public void Aftertest() {
		Reporter.log("After test is getting launched",true);
	}
	
	@Test
	public void mainmethod() {
		Reporter.log("main method",true);
	}

}
