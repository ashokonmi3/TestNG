package tng.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TNG_14_AssertVsVerify {
	private WebDriver driver;
	private String baseUrl;

	@BeforeTest
	public void setUp() throws Exception {

		driver = new ChromeDriver();
		// Implicit wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Assign the URL to be invoked to a String variable
		baseUrl = "https://google.com/";
	}

	// @Test
	// public void testPageTitle() throws Exception {
	// // Open baseUrl in Firefox browser window
	// driver.get(baseUrl);
	//
	// // Get the page title
	// String pageTitle = driver.getTitle();
	// // Print the title to console
	// System.out.println("The actual title is: " + pageTitle);
	//
	// // CASE 1
	// // Check if actual and expected values are equal
	// Assert.assertEquals("Google", pageTitle);
	// // Printing success message
	// System.out.println("Assert equals passed.");

	// CASE 2
	// Making the test fail
	// Assert.assertNotEquals("WebDriver Demo Website", pageTitle);
	// Following lines will not be executed as above assert condition fails
	// System.out.println("Assert not equals failed");

	// CASE 3
	// Verify title not equal using try-catch block
	// try {
	// // Making the test fail
	// Assert.assertNotEquals("WebDriver Demo Website", pageTitle);
	// } catch (Error e) {
	// // Following lines will be printed when the assert condition fails
	// System.out.println("Assert not equals failed. But test execution is not
	// aborted.");
	// System.out.println("Error message: " + e.toString());
	// }
	// }

	@Test
	public void softAssert() {
		SoftAssert softAssertion = new SoftAssert();
		System.out.println("softAssert Method Was Started");
		softAssertion.assertEquals(false, true, "failed");
		softAssertion.assertEquals(0, 1, "brokedown");
		System.out.println("this is after softAssert Method Executed");
		softAssertion.assertAll();

	}

	@Test
	public void testCasetwo() {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("*** test case two started ***");
		softAssert.assertEquals("Hello", "Hello", "First soft assert failed");
		System.out.println("hard assert success....");
		softAssert.assertTrue("Hello".equals("hello"), "Second soft assert failed");
		softAssert.assertTrue("Welcome".equals("welcomeeee"), "Third soft assert failed");
		System.out.println("*** test case two executed successfully ***");
		softAssert.assertAll();
	}

	// @Test
	// public void hardAssert() {
	// System.out.println("hardAssert Method Was Started");
	// Assert.assertFalse(true);
	// System.out.println("after hardAssert Method Was Executed");
	// }

	// End of @Test
	@Test
	public void hardAssert1() {

		SoftAssert sa = new SoftAssert();
		// compare the titles
		sa.assertEquals(driver.getTitle(), "rediff", "title is not google");
		// try to print the statement
		System.out.println("this step should execute");
		System.out.println("this step also gets executed");
		// execute all the statement before below step
		sa.assertAll();
		// below step will not be executed
		System.out.println("This step will not be executed");

	}

	@AfterTest
	public void tearDown() throws Exception {
		// Close the Firefox browser
		driver.close();
	}
}
