package Week3day1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testcases.ProjectMethods;

public class CreateLead extends ProjectMethods{
	@BeforeClass(groups="common")
	public void setData() {
		sheetName ="login";
	}
	@Test(dataProvider="fetchData", groups= {"sanity"}/*, dependsOnGroups="smoke"*/)
	public void Lead(String cname,String fname,String lname){	
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cname);
		type(locateElement("id", "createLeadForm_firstName"), fname);
		type(locateElement("id", "createLeadForm_lastName"), lname);
		type(locateElement("id", "createLeadForm_primaryEmail"), "gopinath@testleaf.com");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "9597704568");
		click(locateElement("name", "submitButton"));			
	}
	
}
