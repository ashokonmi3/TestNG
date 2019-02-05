package test.NG;

import org.testng.annotations.Test;

public class ParallelExecution_02 {
	@Test
	public void testCase4() throws InterruptedException {
		long id = Thread.currentThread().getId();
		System.out.println("Test Case 4 is Successful - Thread id is: " + id);

		for (int i = 0; i < 10; i++) {
			System.out.println(i + 50);
			System.out.println("Test Case 4 from Class 2");

			Thread.sleep(3000);
		}

	}

	@Test
	public void testCase5() throws InterruptedException {
		long id = Thread.currentThread().getId();
		System.out.println("Test Case 5 is Successful - Thread id is: " + id);
		for (int i = 0; i < 70; i++) {
			System.out.println(i + 50);
			System.out.println("Test Case 5 from Class 2");

			Thread.sleep(3000);
		}

	}

	@Test
	public void testCase6() throws InterruptedException {
		long id = Thread.currentThread().getId();
		System.out.println("Test Case 6 is Successful - Thread id is: " + id);
		for (int i = 0; i < 100; i++) {
			System.out.println(i + 50);
			System.out.println("Test Case 6 from Class 3");

			Thread.sleep(3000);
		}
	}

}
