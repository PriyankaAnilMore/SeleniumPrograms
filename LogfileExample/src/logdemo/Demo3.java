package logdemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {
	static Logger log=Logger.getLogger("Demo3");
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j3.properties");
		WebDriver driver=new FirefoxDriver();
		log.warn("Firefox opened");
		driver.manage().window().maximize();
		log.warn("Brows maximized");
		driver.get("http://www.javabykiran.com/");
		log.warn("facebook opened");
		
		String s=driver.getTitle();
		System.out.println("My page title is: " +s);
	}
}
