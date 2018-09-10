package firstPack;

import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstFunClass {
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
//		 WebDriver driver = new ChromeDriver();
		 
		 System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		 WebDriver driver =  new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 driver.get("http://www.google.com");
		 System.out.println( driver.getTitle());
		 driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("Iphone");
		 driver.findElement(By.name("btnK")).click();
	}

}
