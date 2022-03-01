package TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FailxmlCreation {
	@Test
	public void m1()
	{
		Reporter.log("1",true);
	}
	@Test
	public void m2()
	{
		Reporter.log("2",true);
		AssertJUnit.fail();
	}
	@Test
	public void m3()
	{
		Reporter.log("3",true);
		AssertJUnit.fail();
	}
	@Test
	public void m4()
	{
		Reporter.log("4",true);
	}
}
