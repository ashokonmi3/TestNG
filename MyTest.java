package test.NG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MyTest {
	@Test
	public void firstTest() {
		System.out.println("first Test");

	}

	@Test
	public void secondTest() {
		System.out.println("Second Test");

	}

	@Test
	public void thirddTest() {
		System.out.println(a);

	}

	@Test
	public void fourthTest() {
		System.out.println("verify starts");
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals("gmail", "GMAIL");
		System.out.println("verify ends");

	}
}
