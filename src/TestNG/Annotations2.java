package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	@Test
	public void m1()
	{
		Reporter.log("1",true);
	}
	@Test
	public void m2()
	{
		Reporter.log("2",true);
	}
	@BeforeMethod
	public void m3()
	{
		Reporter.log("3",true);
	}
	@AfterMethod
	public void m4()
	{
		Reporter.log("4",true);
	}
	@AfterClass
	public void m5()
	{
		Reporter.log("5",true);
	}
	@BeforeClass
	public void m6()
	{
		Reporter.log("6",true);
	}
	@BeforeTest
	public void m7()
	{
		Reporter.log("7",true);
	}
	@BeforeGroups
	public void m8()
	{
		Reporter.log("8",true);
	}
	public void m9()
	{
		Reporter.log("9",true);
	}
	public void m10()
	{
		Reporter.log("10",true);
	}
	

}
