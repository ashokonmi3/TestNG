package test.NG;

import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSuite01 {
	@BeforeClass
	public void login() {
		System.out.println("Login Successful");
	}

	@AfterClass
	public void logout() {
		System.out.println("Logout Successful");
	}

	@Test(priority = 1)
	public void addVendor() {
		System.out.println("Add Vendor Successful");
	}

	@Test(priority = 2)
	public void addProduct() {
		System.out.println("Add Product Successful");
		System.out.println("Add Product Successful");

	}

	@Test(priority = 3)
	public void addCurrency() {
		System.out.println("Add Currency Successful");
	}
}
