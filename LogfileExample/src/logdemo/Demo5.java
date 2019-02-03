package logdemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo5 {
	static Logger log=Logger.getLogger("Demo5");
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j5.properties");
		WebDriver driver=new FirefoxDriver();
		log.error("Firefox opened");
		driver.manage().window().maximize();
		log.error("Brows maximized");
		driver.get("http://www.javabykiran.com/");
		log.error("facebook opened");
		
		String s=driver.getTitle();
		System.out.println("My page title is: " +s);
	}
}
