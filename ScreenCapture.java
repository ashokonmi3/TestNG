package test.NG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenCapture {

	@Test
	public void TestJavaS1() {
		// Open Firefox
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Pass the url
		driver.get("http://www.google.com");

		// Take screenshot and store as a file format
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			// now copy the screenshot to desired location using copyFile //method
			FileUtils.copyFile(src, new File("C:/My/error.png"));
		}

		catch (IOException e) {
			System.out.println(e.getMessage());

		}
	}
}