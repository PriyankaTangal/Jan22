package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//1.system Login and user verify
public class Annotation1
{
  @BeforeClass
  public void browserLaunching()
  {
	  Reporter.log("Browser Launch successfull", true);
  }
  @AfterMethod
  public void EnterUserName()
  {
	  Reporter.log("Enter User name successfull", true);
  }
  @Test
  public void EnterPassword()
  {
	  Reporter.log("Enter password successfull", true);
  }
  @Test
  public void Loginbtn()
  {
	  Reporter.log("Click on login button successfull", true); 
  }
  
  
  
}
