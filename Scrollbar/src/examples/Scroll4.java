package examples;


	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class Scroll4 {			//horizontal scroll until element is visible
		
	    WebDriver driver;
	    @Test
	    public void ScrollHorizontally() {
	        System.setProperty("webdriver.chrome.driver", "F://MyfirstProject//chromedriver.exe");
	        driver = new ChromeDriver();

	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Launch the application		
	        driver.get("file:///F:/MyfirstProject/JBK%20Offline/index.html");

	        WebElement Element = driver.findElement(By.xpath("//*[@id='cssmenu']/ul/li[11]/a"));

	        //This will scroll the page Horizontally till the element is found		
	        js.executeScript("arguments[0].scrollIntoView();", Element);
	    }
	}
