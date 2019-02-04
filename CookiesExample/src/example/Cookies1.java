package example;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cookies1 {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.gmail.com");
	driver.manage().window().maximize();
	Set<Cookie> cookies=driver.manage().getCookies();
	for(Cookie cookie1: cookies){
		System.out.println("All details of cookies:");
		System.out.println("cookie name is >>"+cookie1.getName());
		System.out.println("cookie domain name is>>"+cookie1.getDomain());
		System.out.println("cookie expiry is>>"+cookie1.getExpiry());
		System.out.println("cookie path is>>"+cookie1.getPath());
System.out.println("cookie value is>>"+cookie1.getValue());

	}
}
}
