package tng.framework;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/*Listeners are required to generate logs or customize TestNG reports in Selenium Webdriver.

There are many types of listeners and can be used as per requirements.
Listeners are interfaces used in selenium web driver script
Demonstrated the use of Listener in Selenium
Implemented the Listeners for multiple classes
*/
public class TNG_13_ListenerTest implements ITestListener {

	@Override
	public void onFinish(ITestContext Result) {

	}

	@Override
	public void onStart(ITestContext Result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {

	}

	// When Test case get failed, this method is called.
	@Override
	public void onTestFailure(ITestResult Result) {
		System.out.println("The name of the testcase failed is :" + Result.getName());
	}

	// When Test case get Skipped, this method is called.
	@Override
	public void onTestSkipped(ITestResult Result) {
		System.out.println("The name of the testcase Skipped is :" + Result.getName());
	}

	// When Test case get Started, this method is called.
	@Override
	public void onTestStart(ITestResult Result) {
		System.out.println(Result.getName() + " test case started");
	}

	// When Test case get passed, this method is called.
	@Override
	public void onTestSuccess(ITestResult Result) {
		System.out.println("The name of the testcase passed is :" + Result.getName());
	}

}
