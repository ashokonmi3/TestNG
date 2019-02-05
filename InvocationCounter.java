package test.NG;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//public class InvocationCounter {
//	@Test(invocationCount = 3)
//	public void f() {
//		System.out.println("Java selenium");
//
//	}
//}
// =========================

//public class InvocationCounter {
//	@Test(invocationCount = 10, invocationTimeOut = 30000)
//	public void f() {
//		System.out.println("Java selenium");
//
//	}
//}
// ============================
// public class InvocationCounter {
// @Test(invocationCount = 7, threadPoolSize = 7)
// public void f() {
// System.out.println("Thread Name : " + Thread.currentThread().getName());
// }
// }
// =======================

//public class InvocationCounter {
//	// 5 seconds max
//	@Test(timeOut = 5000)
//	public void f() throws Exception {
//		// sleep for 10 seconds
//		Thread.sleep(10000);
//		System.out.println("will take more than 10 seconds");
//	}
//
//	// 5 seconds max
//	@Test(timeOut = 5000)
//	public void g() throws Exception {
//		System.out.println("will be completed withing 5 seconds");
//	}
//}
// ===========================
/*
 * Expected Exceptions ---Sometimes we might have scenarios where we expect an
 * exception as result, In such cases we have verify that an exception is being
 * thrown by the program during execution.
 * 
 * For Example, you have deleted an a product from the list, to verify whether
 * the product is not there, you can try to find the product but as the product
 * is not there so it should throw an NoSuchElementException in selenium.
 * 
 * TestNG provides a way to handle such exceptions, we need to set the property
 * of the expectedException to the required exception
 * 
 */
//public class InvocationCounter {
//	@Test(expectedExceptions = ArithmeticException.class)
//	public void f1() {
//		throw new ArithmeticException("for demo purpose only");
//	}
//
//	@Test(expectedExceptions = ArithmeticException.class)
//	public void f2() {
//		throw new ArrayIndexOutOfBoundsException("Throw different exception than expected one");
//	}
//
//	@Test(expectedExceptions = ArithmeticException.class)
//	public void f3() {
//		System.out.println("this method don't throw any exception");
//	}
//}
// ==========================

public class InvocationCounter {
	@Test(expectedExceptions = { NoSuchElementException.class, ElementNotVisibleException.class })

	public void f1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		// name which has no match in google page
		driver.findElement(By.name("who-cares")).click();
	}
}