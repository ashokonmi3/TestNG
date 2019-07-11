package tng.framework;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TNG_10_BeforeGroup {
	@BeforeGroups(value = "real")
	public void beforeGroupsExampleReal() {
		System.out.println("@BeforeGroups for real");
	}

	@BeforeGroups(value = "dummy")
	public void beforeGroupsExampleDummy() {
		System.out.println("@BeforeGroups for Dummy");
	}

	/*
	 * after method and after class blocks
	 */
	@Test(groups = "dummy")
	public void openDummy() {
		System.out.println("@Test dummy");
	}

	@Test(groups = "real")
	public void openReal() {
		System.out.println("@Test Real");
	}

	@AfterGroups(value = "real")
	public void afterGroupsExampleReal() {
		System.out.println("@AfterGroups for real");
	}

	@AfterGroups(value = "dummy")
	public void afterGroupsExampleDummy() {
		System.out.println("@AfterGroups for Dummy");
	}
}