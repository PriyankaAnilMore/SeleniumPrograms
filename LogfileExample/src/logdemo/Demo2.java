package logdemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {
	static Logger log=Logger.getLogger("Demo2");
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j2.properties");
		WebDriver driver=new FirefoxDriver();
		log.debug("Firefox opened");
		driver.manage().window().maximize();
		log.debug("Brows maximized");
		driver.get("http://www.facebook.com");
		log.debug("facebook opened");
		
		String s=driver.getTitle();
		System.out.println("My page title is: " +s);
	}
}
