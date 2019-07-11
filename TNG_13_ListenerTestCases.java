package tng.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TNG_13_ListenerTest.class)

public class TNG_13_ListenerTestCases {
	WebDriver driver = new ChromeDriver();

	// Test to pass as to verify listeners.
	@Test
	public void Login() {
		driver.get("file:///C:/My/Study/javaselenium/webpages/login.html");
		driver.findElement(By.name("username")).sendKeys("root");
		driver.findElement(By.name("password")).sendKeys("root");
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		driver.quit();
	}

	// Forcefully failed this test as verify listener.
	@Test
	public void TestToFail() {
		System.out.println("This method to test fail");
		Assert.assertTrue(false);
	}
}