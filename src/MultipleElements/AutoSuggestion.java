package MultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\AspireJavaProgram\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("samsung");
		List<WebElement> mobileList = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li/div[1]/div[2]/div[1]/span"));
		Thread.sleep(2000);
		for(WebElement ml:mobileList)
		{
			System.out.println(ml.getText());
		}
//		String expected="samsung a50";
//		Thread.sleep(2000);
//		for(WebElement temp:mobileList)
//		{
//			String actual=temp.getText();
//			Thread.sleep(2000);
//			if(actual.equalsIgnoreCase(expected))
//			{
//				Thread.sleep(2000);
//				System.out.println("here is expected string "+temp.getText());
//				temp.click();
//			}
//		}
	}

}
