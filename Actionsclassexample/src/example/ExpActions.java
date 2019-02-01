package example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ExpActions {
public static void main(String[] args) {
	 String path="F://MyfirstProject//chromedriver.exe";
	 System.setProperty("webdriver.chrome.driver", path);
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://javabykiran.com/javabykiranfiles/");
	 Actions builder=new Actions(driver);
	 WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
	 Action allactions=builder.moveToElement(username).click().keyDown(username, Keys.SHIFT).sendKeys(username, "javabykiran").doubleClick(username).contextClick().build();
	 allactions.perform();
	 
	
		                //sleep for 3secs to load the page
		// Thread.sleep(3000);
		                //SCROLL DOWN
		 builder.sendKeys(Keys.PAGE_DOWN).build().perform();
	//	 Thread.sleep(3000);
		                //SCROLL UP
		 builder.sendKeys(Keys.PAGE_UP).build().perform();
		                //driver.close();
        }
	 
}

