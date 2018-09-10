package Week1day1;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class createlead {

	public static void main(String[] args) throws IOException {
		//Launch browser
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
				
				WebElement src = driver.findElementById("createLeadForm_dataSourceId");
				Select sel=new Select(src);
				sel.selectByVisibleText("Cold Call");
				
			    WebElement li = driver.findElementById("createLeadForm_marketingCampaignId");
				Select ki=new Select(li);
				ki.selectByValue("CATRQ_AUTOMOBILE");
				
				WebElement ol = driver.findElementById("createLeadForm_industryEnumId");
				Select ui=new Select(ol);
				List<WebElement> alloptions=ui.getOptions();
				int count=alloptions.size();
				for(int i=0;i<count;i++) {
					System.out.println(alloptions.get(i).getText());
					
				WebElement ty = driver.findElementById("createLeadForm_ownershipEnumId");
				Select re=new Select(ty);
				List<WebElement> alloptions1=re.getOptions();
				int count1=alloptions1.size();
				re.selectByIndex(count1-1);
				}
				//snapshot
				File scr1=driver.getScreenshotAs(OutputType.FILE);
				File dec=new File("./snaps/ima1.png");
				FileUtils.copyFile(scr1, dec);
					
				}
					
	}


