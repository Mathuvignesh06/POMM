package Week3day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Homeworkindeed {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	//ClassName objectName=new ClassName();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//Load URL
	driver.navigate().to("https://www.indeed.co.in/Fresher-jobs");
	
	 List<WebElement> tyu = driver.findElementsByTagName("a");
	System.out.println(tyu.size());
	 WebElement vh = driver.findElementById("sja1");
	 
	 Actions bulider=new Actions(driver);
	 bulider.contextClick(vh).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	
	
		
	}
	
}
