package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener{

	public ExtentSparkReporter sparkReporter; // UI of the Report
	public ExtentReports extent;  // populate common info in the report.
	public ExtentTest test; // Creating test cases entries in the report and update the status in the test method.
	
	public void onStart(ITestContext context) {
		// UI of the report
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Functional Testin");
		sparkReporter.config().setTheme(Theme.DARK);
		
		// Attaching the test in the UI.
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester", "Mohammad Talib");
		extent.setSystemInfo("Window", "10");
		
	}
	
	public void onTestSuccess(ITestResult result) {
		
		test = extent.createTest(result.getName());
		test.log(Status.PASS, "Passed test case is: "+result.getName());
		
	}
	
	public void onTestFailure(ITestResult result) {
		
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Failed test case is: "+result.getName());
		test.log(Status.FAIL, "Test failed reason is: "+ result.getThrowable());
		
	}
	
	public void onTestSkipped(ITestResult result) {
		
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Failed test case is: "+result.getName());
		test.log(Status.SKIP, "Test failed reason is: "+ result.getThrowable());
		
	}
	
	public void onFinish(ITestContext context) {
		extent.flush();
	}
}
