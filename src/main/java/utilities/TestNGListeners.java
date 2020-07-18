package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import core.Base;

public class TestNGListeners extends Base implements ITestListener  {

	@Override
	public void onTestStart(ITestResult result) {
		
		logger.info("Test Execution Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		logger.info("Test was passed successfully");
		logger.info("method name: " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		logger.info("Test was failed");
		logger.info("method name: " + result.getMethod().getMethodName());
		DriverUtility.screenShot();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		logger.info("method name: " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		logger.info("method name: " + result.getMethod().getMethodName());
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		logger.info("Start of Execution");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		logger.info("End of Execution");
	}

}
