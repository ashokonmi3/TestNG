package tng.framework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TNG_08_Parameters {
	@Parameters({ "searchTerm", "url" })
	@Test
	public void f(String search_Term, String url_ofSearch_engine) throws InterruptedException {
		System.out.println("hello " + search_Term + url_ofSearch_engine);
		System.out.println("test completed");

	}
}
