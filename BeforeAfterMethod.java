package test.NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {
	public WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		System.out.println("Initialization of webdriver");
	}

	@Test
	public void verifyPageTitle1() {
		driver.get("https://www.gmail.com");
		Assert.assertEquals("Gmail", driver.getTitle());
	}

	@Test
	public void verifyPageTitle2() {
		driver.get("http://www.rediff.com/");
		Assert.assertEquals("Yahoo", driver.getTitle());
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("closing of webdriver");
		driver.quit();
	}

}
