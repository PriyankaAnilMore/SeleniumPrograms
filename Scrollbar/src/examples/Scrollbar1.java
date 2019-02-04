package examples;


	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class Scrollbar1 {

	    WebDriver driver;
	    @Test
	    public void ByPixel() {
	        System.setProperty("webdriver.chrome.driver", "F://MyfirstProject//chromedriver.exe");
	        driver = new ChromeDriver();

	        JavascriptExecutor js = (JavascriptExecutor) driver;
		
	        driver.get("http://www.javabykiran.com/");

	        driver.manage().window().maximize();

	      	
	        js.executeScript("window.scrollBy(0,1000)");
	    }
	}

