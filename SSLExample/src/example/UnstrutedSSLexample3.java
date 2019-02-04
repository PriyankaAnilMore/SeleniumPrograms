package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
//using internet explorer
public class UnstrutedSSLexample3 {
	public static void main(String[] args) {
		DesiredCapabilities cap=DesiredCapabilities.internetExplorer();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.ie.driver","F://PriyankaMore selenium programs//IEDriverServer.exe");;
		WebDriver driver=new InternetExplorerDriver(cap);
		driver.get("http://www.javabykiran.com");
		
	}


}
