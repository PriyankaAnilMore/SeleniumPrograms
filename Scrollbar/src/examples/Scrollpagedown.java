package examples;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrollpagedown {
public static void main(String[] args) throws Exception {
	WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://www.javabykiran.com/");
Thread.sleep(5000);
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("scrollBy(0,3000)");
}
}
