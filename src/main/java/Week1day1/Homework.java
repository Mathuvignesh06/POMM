package Week1day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework {

	public static void main(String[] args) {
		// //Launch browser
				System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
				//ClassName objectName=new ClassName();
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				//Load URL
				driver.get("http://www.leafground.com/");
			    driver.findElementByLinkText("Drop down").click();
			    WebElement src = driver.findElementById("dropdown1");
				Select sel=new Select(src);
				sel.selectByIndex(2);
				WebElement src1 = driver.findElementByName("dropdown2");
				Select sel1=new Select(src1);
				sel1.selectByVisibleText("Selenium");
				WebElement li = driver.findElementByName("dropdown3");
				Select ki=new Select(li);
				ki.selectByValue("1");
				WebElement ol = driver.findElementByClassName("dropdown");
				Select ui=new Select(ol);
				List<WebElement> alloptions=ui.getOptions();
				int count=alloptions.size();
				for(int i=0;i<count;i++) {
					System.out.println(alloptions.get(i).getText());
					
					
				}
				//driver.findElementByXPath("//*[@id='contentblock']/section/div[5]/select").sendKeys("Selenium");
				//driver.findElementByXPath("//*[@id='contentblock']/section/div[6]/select").sendKeys("Selenium",Keys.CONTROL,"Appium",Keys.CONTROL);
				WebElement msel = driver.findElementByXPath("(//select)[6]");
				Select ms = new Select(msel);
				ms.selectByIndex(1);
				ms.selectByIndex(2);
				
				List<WebElement> allOp = ms.getAllSelectedOptions();
				for (WebElement op : allOp) {
					System.out.println(op.getText());
					
				}
				
				//driver.findElementByXPath("//*[@id='contentblock']/section/div[5]/select");	
				
	}

}
