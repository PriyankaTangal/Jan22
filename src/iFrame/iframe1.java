package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\AspireJavaProgram\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		WebDriver parentWin = driver.switchTo().frame("frame1");
		System.out.println(driver.findElement(By.xpath("//body[text()='Parent frame']")).getText());
		
		WebElement ChildWin = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(ChildWin);
		System.out.println(driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText());
		System.out.println(driver.switchTo().defaultContent().getTitle());
		System.out.println(driver.switchTo().parentFrame().getTitle());
		
		

	}

}
