package tng.framework;

import org.testng.annotations.Test;

public class TNG_09_Grouping {
	@Test(groups = { "sanity", "regression", "UI", "Navigation" }, priority = 1)
	public void login() {
		System.out.println("Login Successful");
	}

	@Test(groups = { "sanity" }, priority = 3)
	public void fundTransfer() {
		System.out.println("Fund Transfer Successful");
	}

	@Test(groups = { "sanity" }, priority = 2)
	public void search() {
		System.out.println("Search Successful");
	}

	@Test(groups = { "regression" }, priority = 2)
	public void advancedSearch() {
		System.out.println("Advanced Search Successful");
	}

	@Test(groups = { "regression" }, priority = 3)
	public void prePaidRecharge() {
		System.out.println("PrePaid Recharge Successful");
	}

	@Test(groups = { "UI" }, priority = 4)
	public void billPayments() {
		System.out.println("Bill Payments Successful");
	}

	@Test(groups = { "sanity", "regression" }, priority = 10)
	public void logout() {
		System.out.println("Logout Successful");
	}
}
