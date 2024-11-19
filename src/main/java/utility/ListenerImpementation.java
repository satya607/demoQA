package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImpementation implements ITestListener  {
	 private static ExtentReports extentReports;
	    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

	    @Override
	    public void onStart(ITestContext context) {
	        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extent-report.html");
	        sparkReporter.config().setReportName("Automation Test Report");
	        sparkReporter.config().setDocumentTitle("Test Results");

	        extentReports = new ExtentReports();
	        extentReports.attachReporter(sparkReporter);
	        extentReports.setSystemInfo("Tester", "Satya");
	    }

	    @Override
	    public void onTestStart(ITestResult result) {
	        ExtentTest test = extentReports.createTest(result.getMethod().getMethodName());
	        extentTest.set(test);
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        extentTest.get().pass("Test Passed");
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        extentTest.get().fail("Test Failed: " + result.getThrowable());
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        extentTest.get().skip("Test Skipped");
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        extentReports.flush();
	    }
}
