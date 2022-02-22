package WindowHHS;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WndowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\AspireJavaProgram\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String ParentWinId=driver.getWindowHandle();
		System.out.println(ParentWinId);
		driver.findElement(By.xpath("//button[@id='win1']")).click();
		Thread.sleep(2000);
		Set<String> allwinid = driver.getWindowHandles();
		ArrayList al = new ArrayList(allwinid);
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		driver.switchTo().window(ParentWinId);
		
		
	}
}
