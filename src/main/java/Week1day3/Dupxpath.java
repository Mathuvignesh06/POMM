package Week1day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class Dupxpath {
	public static void main(String[] args) throws InterruptedException {
		//Launch browser
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//ClassName objectName=new ClassName();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Load URL
		driver.get("http://leaftaps.com/opentaps/");
		//Enter Usernames
		driver.findElementByXPath("//input[@id='username]").sendKeys("DemoSalesManager");
		//Enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		//Enter Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByLinkText("Email").click();
		driver.findElementByName("emailAddress").sendKeys("kathir487@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		String leadTitle=driver.getTitle();
		if(leadTitle.equals("View Lead|opentapes CRM")) {
			System.out.println("page of the title is not displayed correctly:"+leadTitle);
		}
		else {
			System.out.println("page of the title is  displayed correctly:"+leadTitle);
		}
		driver.findElementByLinkText("Duplicate Lead").click();
		String leadTitle1=driver.getTitle();
		if(leadTitle1.equals("Duplicate Lead|opentaps CRM")) {
			System.out.println("not verify");
		}else {
			System.out.println("verify");
		}
		driver.findElementByClassName("smallSubmit").click();
		if(leadTitle.equals("View Lead|opentapes CRM")) {
			System.out.println("not conform the duplicate lead="+leadTitle);
		}
		else {
			System.out.println("conform the duplicate lead="+leadTitle);
		}
		driver.close();

	}

}

