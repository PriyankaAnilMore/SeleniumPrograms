package logdemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo4 {
	static Logger log=Logger.getLogger("Demo4");
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j4.properties");
		WebDriver driver=new FirefoxDriver();
		log.error("Firefox opened");
		driver.manage().window().maximize();
		log.warn("Brows maximized");
		driver.get("http://www.javabykiran.com/");
		log.info("facebook opened");
		
		String s=driver.getTitle();
		System.out.println("My page title is: " +s);
	}
}
