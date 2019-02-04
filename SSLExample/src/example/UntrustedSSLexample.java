package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class UntrustedSSLexample {						//Using Firefox driver
public static void main(String[] args) {
	FirefoxProfile profile=new FirefoxProfile();
profile.setAcceptUntrustedCertificates(true);
WebDriver driver=new FirefoxDriver(profile);
driver.get("http://www.amazon.com");
}
}
