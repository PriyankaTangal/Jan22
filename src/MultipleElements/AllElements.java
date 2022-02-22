package MultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\AspireJavaProgram\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=samsung%20mobile&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		Thread.sleep(2000);
		List<WebElement> mobileList = driver.findElements(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']//a/div[2]/div[1]/div[1]"));
		System.out.println(mobileList.size());
		for(WebElement ml:mobileList)
		{
			System.out.println(ml.getText());
		}

	}

}
