package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Eventlistener {
	public static void main(String[] args) {

		String path = "F://MyfirstProject//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
EventFiringWebDriver eventdriver=new EventFiringWebDriver(driver);
		TrackChangesInApplication trackchange=new TrackChangesInApplication();
		eventdriver.register(trackchange);
		
		eventdriver.get("https://javabykiran.com/javabykiranfiles/");
		eventdriver.manage().window().maximize();
		WebElement user=eventdriver.findElement(By.xpath("//input[@type='text']"));
		user.sendKeys("priyankamore141194@gmail.com");
		
		WebElement password=eventdriver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("123456");
		
		WebElement login=eventdriver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		
		
		
	}
}