package chronology;


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


public class Basic {
	@AfterMethod
	public void aftermethod() {
		Reporter.log("after method is launched",true);
		}
	@AfterClass
	public void afterclass() {
		Reporter.log("after class is launched",true);
		}
	@AfterTest
	public void aftertest() {
		Reporter.log("after test is launched",true);
		}
	@AfterSuite
	public void aftersuite() {
		Reporter.log("after suite is launched",true);
		}
	@BeforeSuite
	public void beforesuite() {
		Reporter.log("before suite is launched",true);
		}
	@BeforeClass
	public void beforesclass() {
		Reporter.log("before class is launched",true);
		}
	@BeforeMethod
	public void beforemethod() {
		Reporter.log("before method is launched",true);
		}
	@BeforeTest
	public void beforetest() {
		Reporter.log("before test is launched",true);
		}
	@Test
	public void mainmethod() {
		Reporter.log("main method is launched",true);
	}

}
