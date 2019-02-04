package windowhandlers1;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String pw=driver.getWindowHandle();
		Set<String> allwindow=driver.getWindowHandles();

Iterator<String>itr=allwindow.iterator();
while(itr.hasNext()){
	String cw=itr.next();
	if(!pw.equals(cw)){
		driver.switchTo().window(cw);
		System.out.println("Child window is: "+driver.getTitle());
	driver.close();	
	}
	
}
driver.switchTo().window(pw);
System.out.println(1);
}}
