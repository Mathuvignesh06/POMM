package Week3day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MergeHomework {
	@Test
	public static void main(String[] args) throws InterruptedException {
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
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
		Set<String> allwin = driver.getWindowHandles();
		List<String> al=new ArrayList<String>();
		al.addAll(allwin);
		driver.switchTo().window(al.get(1));
		driver.findElementById("ext-gen27").sendKeys("priya");
		driver.findElementById("ext-gen114").click();
		driver.close();
		
		
		 allwin = driver.getWindowHandles();
		 al=new ArrayList<String>();
		al.addAll(allwin);
		int parent=0;
		driver.switchTo().window(al.get(parent));
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
		allwin = driver.getWindowHandles();
		al=new ArrayList<String>();
		al.addAll(allwin);
		driver.switchTo().window(al.get(1));
		driver.findElementByXPath("//*[@id='ext-gen29']").sendKeys("Sarma");
		driver.findElementById("ext-gen114").click();
		driver.close();
		allwin = driver.getWindowHandles();
		 al=new ArrayList<String>();
		al.addAll(allwin);
		int parents=0;
		driver.switchTo().window(al.get(parents));
		driver.findElementById("ComboBox_partyIdFrom").sendKeys("10627");
		driver.findElementById("ComboBox_partyIdTo").sendKeys("10126");
		driver.findElementByLinkText("Merge").click();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		allwin = driver.getWindowHandles();
		 al=new ArrayList<String>();
		al.addAll(allwin);
		int parentss=0;
		driver.switchTo().window(al.get(parentss));
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementById("ext-gen246").sendKeys("10627");
		driver.findElementById("ext-gen334").click();
		Thread.sleep(1000);
		driver.close();
		
			}

}
