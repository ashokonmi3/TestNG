package tng.framework;

import org.testng.Assert;
import org.testng.annotations.Test;

//public class TNG_03_Multipletest {
//	@Test
//	public void testA() {
//		Assert.assertEquals("Gmail", "Gmail");
//		System.out.println("Test A");
//	}
//
//	@Test
//	public void testC() {
//		System.out.println("Test c");
//		Assert.assertEquals("Gmail", "Google");
//	}
//
//	@Test
//	public void testB() {
//		System.out.println("Test B");
//		Assert.assertEquals("Yahoo", "Yahoo");
//	}
//
//}
/// s/ =======================
// if x==7
//
// test pass#
// Method Checks that#

/*
 * assertEqual(a,b) a==b assertNotEqual(a,b) a!=b assertTrue(x)bool(x)is True
 * assertFalse(x)bool(x)is False assertIs(a,b)a is b assertIsNot(a,b)a is not b
 * // assertIsNone(x)x is None assertIsNotNone(x)x is not None assertIn(a,b)a in
 * b // assertNotIn(a,b)a not in b //
 * assertIsInstance(a,b)isinstance(a,b)assertNotIsInstance(a,b)
 */
// not isinstance(a, b)
//
public class TNG_03_Multipletest {
	@Test(priority = 3)
	public void abcd() {
		System.out.println("I am in priority 3");
		Assert.assertEquals("Gmail", "Gmail");

	}

	@Test
	public void abcde() {// highest priority
		System.out.println("I am without priority");

		Assert.assertEquals("Yahoo", "Yahoo");
	}

	@Test(priority = 2)
	public void xyz1() {
		System.out.println("I am in priority 2");

		Assert.assertEquals("Gmail", "Google");
	}

	@Test(priority = 0)
	public void pqr() {
		System.out.println("I am in priority 0 and pqr");
		Assert.assertEquals("Yahoo", "Yahoo");
	}

	@Test(priority = 0)
	public void apqr() {
		System.out.println("I am in priority 0 and apqr");
		Assert.assertEquals("Yahoo", "Yahoo");
	}

	@Test(priority = 1)
	public void pqr1() {
		System.out.println("I am in priority 1");
		Assert.assertEquals("Yahoo", "Yahoo");
	}

	@Test(priority = 1, enabled = false)
	public void xyz() {
		Assert.assertEquals("Google", "Google");
	}

}
