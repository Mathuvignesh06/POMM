package Week4day2;

import java.io.IOException;

import org.apache.commons.math3.stat.descriptive.rank.Median;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnReporthtml {

	public static void main(String[] args) throws IOException {
		
		//Creatre empty html file
	ExtentHtmlReporter html=new ExtentHtmlReporter("./report/result7.html");
	//Performing operation on empty file
	ExtentReports extent = new ExtentReports();
	//parsing value into html report or attach extent to html object
	extent.attachReporter(html);
	//Creation of test case
	//class level
	ExtentTest test = extent.createTest("Login", "Login into Leaftap application");
	ExtentTest subTest = test.createNode("Leads");
	subTest.pass("Username Entered successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img11.png").build());
	subTest.pass("PWD entered successfully");
	subTest.pass("login pass");
	//data level-to differentiate the 2 data's
	//ExtentTest createNode = test.createNode("leads");
	//createNode.warning("Warning");
	//createNode.info("info");
	extent.flush();
	

	}

}