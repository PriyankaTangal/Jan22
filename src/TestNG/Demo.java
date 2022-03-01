package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
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

}
