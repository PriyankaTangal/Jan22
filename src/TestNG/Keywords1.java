package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords1 
{
	@Test(invocationCount=1)
	public void TC1()
	{
		Reporter.log("TC1 pass",true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("TC2 pass",true);
	}
	@Test
	public void TC3()
	{
		Reporter.log("TC3 pass",true);
	}
	@Test
	public void TC4()
	{
		Reporter.log("TC4 pass",true);
	}
	@Test(priority=1)
	public void TC5()
	{
		Reporter.log("TC5 pass",true);
	}@Test
	public void TC6()
	{
		Reporter.log("TC6 pass",true);
	}
	@Test
	public void TC7()
	{
		Reporter.log("TC7 pass",true);
	}
}
