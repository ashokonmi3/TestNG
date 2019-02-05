package test.NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

//public class parameter {
//	@Parameters({ "searchTerm", "url" })
//	@Test
//	public void f(String search_Term, String url_ofSearch_engine) throws InterruptedException {
//		System.out.println("hello" + search_Term + url_ofSearch_engine);
//	}
//}
//===============
//this method gives option to the user to compare two items, if the comparison results in true then this Assert statement is passed otherwise fails the statement.

//public class parameter {
//	@Test
//	public void testAssertTrue() {
//		Assert.assertTrue(2 > 1);
//		System.out.println("compare 2 is greated than 1");
//
//		Assert.assertTrue("selenium".equals("java"));
//		System.out.println("compared two not equal string & this should not be executed");
//	}
//}
//=======================

//public class parameter {
//	@Test
//	public void testAssertFalse() {
//		Assert.assertFalse(2 > 30, "comparing 2 greater than 30");
//		System.out.println("this print will be executed as condition results in false");
//
//		Assert.assertFalse(true == true);
//		System.out.println("this will not be executed as condition results in true");
//	}
//}
//====================

//Assert.fail method fails the current test with the given message,
//user not only can set the error message but also they can set the exception which caused the failure.

//public class parameter {
//	@Test
//	public void testFail() {
//		Assert.fail("test purpose", new NoSuchFrameException("user thrown exception"));
//	}
//}

// =====================

//public class parameter {
//	public static void main(String[] args) {
//		List l = new ArrayList();
//		List l2 = new ArrayList();
//
//		// compare the empty lists
//		Assert.assertEquals(l, l2);
//
//		l2.add(3);
//		// compare the list with element
//		Assert.assertEquals(l, l2, "both List are not same");
//	}
//}
//===========================
//public class TestNGAssertNotNull {
//	static WebDriver driver ;
//	public static void main(String[] args) {
//		//check driver is not null
//		Assert.assertNotNull(driver);
//	}
//}
//==================================
//public class TestNGAssertNull {
//	public static void main(String[] args) {
//		// set the geckodriver.exe property
//		System.setProperty("webdriver.gecko.driver", "C:/Users/user/Pictures/geckodriver.exe");
//
//		WebDriver driver = new FirefoxDriver();
//		//check driver is null
//		Assert.assertNull(driver);
//	}
//}
//================================

//public class TestNGAssertSame {
//	public static void main(String[] args) {
//		String s1 = "javaselenium";
//		String s2 = "javaselenium";
//		// strings created with double quotes keyword will have same addresses if
//		// content is same
//		Assert.assertSame(s1, s2, "Strings not sharing same address when we create using double quotes");
//
//		String s3 = new String("Google");
//		String s4 = new String("Google");
//		// compare using Assert Equals, assertion passes
//		Assert.assertEquals(s3, s4, "string content comparision failed");
//		// strings created with new keyword will have different addresses
//		Assert.assertSame(s3, s4, "String as not sharing same address when created using 'new' keyword");
//	}
//}
//=======================

//Soft assert
public class parameter {
	public static void main(String[] args) {

		// set the geckodriver.exe property

		WebDriver driver = new FirefoxDriver();
		driver.get("https://rediff.com");

		SoftAssert sa = new SoftAssert();
		// compare the titles
		sa.assertEquals(driver.getTitle(), "Google", "title is not google");
		// try to print the statement
		System.out.println("this step should execute");
		System.out.println("this step also gets executed");
		// execute all the statement before below step
		sa.assertAll();
		// below step will not be executed
		System.out.println("This step will not be executed");
	}
}