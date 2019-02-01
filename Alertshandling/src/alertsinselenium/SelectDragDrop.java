package alertsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDragDrop {
	public static void main(String[] args) throws Exception {
		String path = "F://MyfirstProject//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Dipika/Desktop/content.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//select[@id='SelectID_One']")).click();
		driver.findElement(By.xpath("//select[@id='SelectID_One']//following::option[text()='Green']")).click();
		WebElement element = driver.findElement(By.xpath("//select[contains(@class,'form-control')]"));
		Select se = new Select(element);
		se.selectByValue("Green");
		System.out.println(1);
		se.selectByIndex(2);
		System.out.println(2);
		element.click();
		WebElement element1 = driver.findElement(By.xpath("//button[contains(text(),'Try it')]"));
		element1.click();
		System.out.println(3);
	}
}