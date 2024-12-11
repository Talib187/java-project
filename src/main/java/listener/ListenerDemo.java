package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo implements ITestListener {

	  public  void onStart(ITestContext context) {
		    System.out.println("On start method, test execution started.");
		  }
	
	 public void onTestStart(ITestResult result) {
		    System.out.println("On test start method, will run on each test.");
		  }
	 
	  public void onTestSuccess(ITestResult result) {
		    System.out.println("On passing the test method");
		  }

	  public void onTestFailure(ITestResult result) {
		    System.out.println("Test method failed");
		  }
	  
	  public void onTestSkipped(ITestResult result) {
		    System.out.println("Test method skipped");
		  }
	  
	  public void onFinish(ITestContext context) {
		    System.out.println("Test execution finished");
		  }
}
