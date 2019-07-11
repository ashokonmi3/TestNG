package tng.framework;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TNG_15_Testsuite02 {
	@BeforeClass
	public void login() {
		System.out.println("Login Successful");
	}

	@org.testng.annotations.AfterClass
	public void logout() {
		System.out.println("Logout Successful");
	}

	@Test(priority = 1)
	public void deleteVendor() {
		System.out.println("Delete Vendor Successful");
	}

	@Test(priority = 2)
	public void deleteProduct() {
		System.out.println("Delete Product Successful");
	}

	@Test(priority = 3)
	public void deleteCurrency() {
		System.out.println("Delete Currency Successful");
	}

}
