package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Invocation {
	@BeforeTest
	public void m1()
	{
		Reporter.log("1",true);
	}
	@BeforeTest
	public void m2()
	{
		Reporter.log("2",true);
	}
	@Test
	public void m3()
	{
		Reporter.log("3",true);
	}
	@BeforeMethod
	public void m4()
	{
		Reporter.log("4",true);
	}

}
