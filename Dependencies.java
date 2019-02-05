package test.NG;

import org.testng.annotations.Test;

//public class Dependencies {
//	@Test(priority = 1)
//	public void methoda() {
//		System.out.println("This is method 1");
//	}
//
//	@Test(dependsOnMethods = { "methoda" }, priority = 4)
//	public void methodb() {
//		System.out.println("This is method 2");
//	}// This test will be failed.
//
//	@Test(priority = 2)
//	public void methodc() {
//		System.out.println("This is method 3");
//		throw new RuntimeException();
//	}
//
//	@Test(dependsOnMethods = { "methodc" }, priority = 3)
//	public void methodd() {
//		System.out.println("This is method 4");
//	}
//
//	@Test
//	public void methode() {
//		System.out.println("This is method 0");
//	}
//
//}

// ================================================
public class Dependencies {
	@Test
	public void method1() {
		System.out.println("This is method 1");
	}

	@Test(dependsOnMethods = { "method1" }, alwaysRun = true)
	public void method2() {
		System.out.println("This is method 2");

	}// This test will be failed.

	@Test
	public void method3() {
		System.out.println("This is method 3");
		throw new RuntimeException();
	}

	@Test(dependsOnMethods = { "method3" }, alwaysRun = true)
	public void method4() {
		System.out.println("This is method 4");
	}
}
