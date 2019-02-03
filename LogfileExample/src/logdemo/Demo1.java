package logdemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
	static Logger log=Logger.getLogger("Demo1");
public static void main(String[] args) {
	
	PropertyConfigurator.configure("log4j.properties");
	WebDriver driver=new FirefoxDriver();
	log.info("Firefox opened");
	driver.manage().window().maximize();
	log.info("Brows maximized");
	driver.get("http://www.gmail.com");
	log.info("website launch");
	
	String s=driver.getTitle();
	System.out.println("My page title is: " +s);
}
}
