package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class TrackChangesInApplication implements WebDriverEventListener {

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1) {
		System.out.println("After change value of:");
		
	}

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("After click on:");
	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("After find by:");
		
	}

	@Override
	public void afterNavigateBack(WebDriver arg0) {
		System.out.println("After navigate back:");
		
	}

	@Override
	public void afterNavigateForward(WebDriver arg0) {
		System.out.println("After navigate forward");
	}

	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("After navigate to:");
		
	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		System.out.println("After script:");
		
	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1) {
		System.out.println("Before change value of:");
		
	}

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("Before click on:");
		
	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("Before find by:");
		
	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		System.out.println("Before Navigate back:");
		
	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		System.out.println("Before Navigate forward:");
	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("Before Navigate to:");
		
	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		System.out.println("Before script:");
		
	}

	@Override
	public void onException(Throwable arg0, WebDriver arg1) {
		System.out.println("On Exception :");
		
	}

}
