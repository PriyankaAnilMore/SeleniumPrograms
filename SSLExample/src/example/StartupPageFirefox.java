package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class StartupPageFirefox {
	public static void main(String[] args) throws InterruptedException {
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.startup.homepage","http://www.javabykiran.com");
		
	profile.setPreference("int1.accept_languages","no,enus,en");
	profile.setPreference("general.useragent override","Any UserAgent ");
	
	
	
	WebDriver driver=new FirefoxDriver(profile);
	driver.getTitle();
	System.out.println("Title is:"+driver.getTitle());
	}



}
