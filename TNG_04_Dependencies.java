package tng.framework;

import org.testng.annotations.Test;

//public class TNG_04_Dependencies {
//	@Test(priority = 1)
//	public void methodA() {
//		System.out.println("This is method 1");
//	}
//
//	@Test(dependsOnMethods = { "methodA" }, priority = 4)
//	public void methodB() {
//		System.out.println("This is method 2");
//	}// This test will be failed.
//
//	@Test(priority = 2)
//	public void methodC() {
//		System.out.println("This is method 3");
//		throw new RuntimeException();
//	}
//
//	@Test(dependsOnMethods = { "methodC" }, priority = 3)
//	public void methodD() {
//		System.out.println("This is method 4");
//	}
//
//	@Test
//	public void methodE() {
//		System.out.println("This is method 0");
//	}
//
//}

// ================================================
public class TNG_04_Dependencies {
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
