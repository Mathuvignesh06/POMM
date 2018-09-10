package Week1day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Createlead1 {
	@Test
	public  void main() {
		
		// //Launch browser
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//ClassName objectName=new ClassName();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Load URL
		driver.get("http://leaftaps.com/opentaps/");
		//Enter Usernames
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		//Enter Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Testleaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("mathu");
		driver.findElementById("createLeadForm_lastName").sendKeys("viki");
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select sel=new Select(src);
		sel.selectByVisibleText("Cold Call");
		 WebElement li = driver.findElementById("createLeadForm_marketingCampaignId");
			Select ki=new Select(li);
			ki.selectByValue("CATRQ_AUTOMOBILE");
			driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Vignesh");
			driver.findElementById("createLeadForm_lastNameLocal").sendKeys("vviki");
			driver.findElementById("createLeadForm_personalTitle").sendKeys("s");
			driver.findElementById("createLeadForm_generalProfTitle").sendKeys("mr");
			driver.findElementById("createLeadForm_departmentName").sendKeys("prof");
			driver.findElementById("createLeadForm_annualRevenue").sendKeys("500000");

			WebElement ol = driver.findElementById("createLeadForm_industryEnumId");
			Select ui=new Select(ol);
			List<WebElement> alloptions=ui.getOptions();
			int count=alloptions.size();
			ui.selectByIndex(count-1);
			
				
			WebElement ty = driver.findElementById("createLeadForm_ownershipEnumId");
			Select re=new Select(ty);
			List<WebElement> alloptions1=re.getOptions();
			int count1=alloptions1.size();
			re.selectByIndex(count1-1);
			 WebElement qw = driver.findElementById("createLeadForm_currencyUomId");
				Select aw=new Select(qw);
				aw.selectByValue("ALL");
				driver.findElementById("createLeadForm_sicCode").sendKeys("323");
			driver.findElementById("createLeadForm_numberEmployees").sendKeys("34440");
			driver.findElementById("createLeadForm_tickerSymbol").sendKeys("#$");
			driver.findElementById("createLeadForm_description").sendKeys("hello world");
			driver.findElementById("createLeadForm_importantNote").sendKeys("hi i am mathu");
			driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
			driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("743");
			driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("ashok");
			driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("445454545");
			driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("23445");
			driver.findElementById("createLeadForm_primaryEmail").sendKeys("q@hmail.com");
			driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("leaf.com");
			driver.findElementById("createLeadForm_generalToName").sendKeys("rk");
			driver.findElementById("createLeadForm_generalAddress1").sendKeys("kk.dist");
			driver.findElementById("createLeadForm_generalAttnName").sendKeys("kkio");
			driver.findElementById("createLeadForm_generalAddress2").sendKeys("kkdist1");
			driver.findElementById("createLeadForm_generalCity").sendKeys("ngl");
			driver.findElementById("createLeadForm_generalPostalCode").sendKeys("545453");
			driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("54");
			WebElement sr = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
			Select sel1=new Select(sr);
			sel1.selectByValue("AK");
			WebElement yu = driver.findElementById("createLeadForm_generalCountryGeoId");
			Select dc=new Select(yu);
			dc.selectByValue("BOL");
			driver.findElementByClassName("smallSubmit").click();

	}

	}
