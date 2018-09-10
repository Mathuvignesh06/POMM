package testcases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Week4day2.Loginworksheet;
import wdMethods.SeMethods;


public class ProjectMethods extends SeMethods {
	public static String sheetName,author,category,testName,dsec;
	@BeforeSuite
	public void beforesuite() {
		startResult();
	}
	@BeforeClass
	public void beforeClass() {
		startTestCase(testName,dsec);
		
	}
    @Parameters({"url", "uname", "pwd"})
	@BeforeMethod(groups="common")
	public void login(String URL, String username, String password) {
    	beforeMethod(author, category);
		startApp("chrome", URL);
		WebElement eleUname = locateElement("id", "username");
		type(eleUname, username);
		type(locateElement("id", "password"), password);
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("linkText", "CRM/SFA"));
		}
	@AfterMethod(groups="common")
	public void close() {	
		closeAllBrowsers();
	}
	@DataProvider(name="fetchData")
	public String[][] excelData() throws IOException {
    Loginworksheet excel = new Loginworksheet();
    return excel.exceldata(sheetName);	
	}
	@AfterSuite
	public void afterSuite() {
		endResult();
		
	}
}