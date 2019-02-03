package logdemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo6 {
	static Logger log=Logger.getLogger("Demo6");
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j6.properties");
		WebDriver driver=new FirefoxDriver();
		log.fatal("Firefox opened");
		driver.manage().window().maximize();
		log.fatal("Brows maximized");
		driver.get("http://www.javabykiran.com/");
		log.fatal("facebook opened");
		
		String s=driver.getTitle();
		System.out.println("My page title is: " +s);
	}
}
