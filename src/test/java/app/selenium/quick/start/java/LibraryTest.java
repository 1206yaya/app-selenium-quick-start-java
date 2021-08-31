/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package app.selenium.quick.start.java;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
 
import java.net.MalformedURLException;
import java.net.URL;

public class LibraryTest {
	
	
	@Test
	public void executeFirefoxDriver() throws MalformedURLException {
		this.execute(DesiredCapabilities.firefox());
	}

	private void execute(final DesiredCapabilities capability) throws MalformedURLException {
		String SELENIUM_URL = System.getenv("SELENIUM_URL");
		if (SELENIUM_URL == null || SELENIUM_URL.length() == 0) {
			SELENIUM_URL = "http://localhost:4444/wd/hub";
		}
		System.out.println("SELENIUM_URL: " + SELENIUM_URL);
		WebDriver driver = new RemoteWebDriver(new URL(SELENIUM_URL), capability);
		driver.get("https://www.google.co.jp");
		String title = driver.getTitle();
		System.out.println("TITLE: " + title);

		driver.quit();
	}
}
