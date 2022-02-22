package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FBlogin 
{
   WebDriver driver;  //global var
   String url="https://www.facebook.com/";
   @Test
   public void browserLaunch() throws InterruptedException
   {
	   System.setProperty("webdriver.chrome.driver", "E:\\AspireJavaProgram\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	   driver = new ChromeDriver();
	   Thread.sleep(2000); 
	   driver.get(url);
   }
   @Test
   public void registration() throws InterruptedException
   {
	   driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]")).click();
		Thread.sleep(2000);
   }
   @Test
   public void FirstName() throws InterruptedException
   {
	   driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("priya");
		Thread.sleep(2000);
   }
   @Test
   public void LastName() throws InterruptedException
   {
	   driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("tangal");
		Thread.sleep(2000);
		 
   }
   @Test
   public void MoNo() throws InterruptedException
   {
	   driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("987654322");
		Thread.sleep(2000);
		
   }
   @Test
   public void password() throws InterruptedException
   {
	   driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("989898765");
		Thread.sleep(2000);
		
   }
   @Test
   public void genderSelection() throws InterruptedException
   {
	   driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
		Thread.sleep(2000);  
   }
   
   public void submitButton()
   {
	   
   }
   public void browserClose() throws InterruptedException
   {
	   Thread.sleep(2000);
	   driver.close();
   }
}
