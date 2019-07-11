package tng.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TNG_02_SecondTest {
	@Test
	public void verifyTitle() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		Assert.assertEquals(pageTitle, "Gmail");
		Thread.sleep(3000);
		driver.close();

	}

	@Test(description = "This test is to demonstrate the purpose of the test")
	public void verifyTitleNegative() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Yahoo");
		Thread.sleep(3000);
		System.out.println("Negative test");
		driver.close();

	}

	@Test
	public void secondTest() {
		System.out.println("Second Test");

	}

}

// assertEqual(a,b)a==b
// assertNotEqual(a,b)a!=b
// assertTrue(x) bool(x)is True
// assertFalse(x) bool(x)is False
//
// assertIsNone(x) x is None
// assertIsNotNone(x)x is not None assertIn(a,b)a in b
// assertNotIn(a,b)a not in b
// assertIsInstance(a,b)
// isinstance(a,b)assertNotIsInstance(a,b)
