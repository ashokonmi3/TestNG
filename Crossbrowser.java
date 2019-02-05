package test.NG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {

	WebDriver driver;

	/**
	 * This function will execute before each Test tag in testng.xml
	 * 
	 * @param browser
	 * @throws Exception
	 */
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception {
		// Check if parameter passed from TestNG is 'firefox'
		if (browser.equalsIgnoreCase("firefox")) {
			// create firefox instance
			// System.setProperty("webdriver.firefox.marionette", ".\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		// Check if parameter passed as 'chrome'
		else if (browser.equalsIgnoreCase("chrome")) {
			// set path to chromedriver.exe
			// System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
			// create chrome instance
			driver = new ChromeDriver();
		}
		// Check if parameter passed as 'Edge'
		else if (browser.equalsIgnoreCase("Edge")) {
			// set path to Edge.exe
			// System.setProperty("webdriver.edge.driver", ".\\MicrosoftWebDriver.exe");
			// create Edge instance
			driver = new EdgeDriver();
		} else {
			// If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testParameterWithXML() throws InterruptedException {
		driver.get("http://www.rediff.com/");
		// Find user name
		Assert.assertEquals("Yahoo", driver.getTitle());

	}
}