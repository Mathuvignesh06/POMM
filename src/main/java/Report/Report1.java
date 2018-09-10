package Report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Report1 {
	public ExtentReports extent;
	public ExtentTest test,subTest;
	public void startResult() {
		ExtentHtmlReporter html=new ExtentHtmlReporter("./report/result7.html");
		html.setAppendExisting(true);
		extent=new ExtentReports();
		extent.attachReporter(html);
	}
	public void reportStop(String stopDsec,String status) {
		if(status.equalsIgnoreCase("PASS")){
			subTest.pass(stopDsec);
		}else if(status.equalsIgnoreCase("FAIL")) {
			subTest.fail(stopDsec);
		}

	}
	public void startTestCase(String testName,String dsec) {
		test=extent.createTest(testName, dsec);

	}
	public void beforeMethod(String author,String category) {
		subTest = test.createNode("leads");
		test.assignAuthor(author);
		test.assignCategory(category);
	}
	public void endResult() {
		extent.flush();
	}

}
