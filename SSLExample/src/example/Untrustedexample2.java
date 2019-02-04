package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Untrustedexample2 {
	//using chrome driver
public static void main(String[] args) {
	DesiredCapabilities cap=DesiredCapabilities.chrome();
	cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	System.setProperty("webdriver.chrome.driver","F://MyfirstProject//chromedriver.exe");
	WebDriver driver=new ChromeDriver(cap);
	driver.get("http://www.javabykiran.com");
}
}
