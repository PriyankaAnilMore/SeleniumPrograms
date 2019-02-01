package alertsinselenium;


	import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.openqa.selenium.firefox.FirefoxDriver;

	/**
	* class description
	*/

	public class Alerts {
		WebDriver driver;
	
		

	                @BeforeTest
	                public void setUp() {
	                	 String path="F://MyfirstProject//chromedriver.exe";
	                	 System.setProperty("webdriver.chrome.driver", path);
	                	  driver=new ChromeDriver();
	                	 driver.get("file:///C:/Users/Dipika/Desktop/content.html");
	                                
	                          
	                                
	                                driver.manage().window().maximize();
	                }

	              
		

	                @Test
	                public void testWebAlert() throws InterruptedException {                          
	                                // clicking on try it button
	                                driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
	                                Thread.sleep(5000);

	                                // accepting javascript alert
	                                Alert alert = driver.switchTo().alert();
	                                alert.accept();

	                                // clicking on try it button
	                                driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
	                                Thread.sleep(5000);

	                                // accepting javascript alert
	                                driver.switchTo().alert().dismiss();

	                                // clicking on try it button
	                                driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
	                                Thread.sleep(5000);

	                                // accepting javascript alert
	                                System.out.println(driver.switchTo().alert().getText());
	                                driver.switchTo().alert().accept();
	                
		}
	               

	                @AfterTest
	                public void tearDown() {             
	                    driver.quit();
	                
	} 
}
	