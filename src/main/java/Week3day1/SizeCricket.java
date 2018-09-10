package Week3day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeCricket {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//ClassName objectName=new ClassName();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Load URL
		driver.get("https://www.google.com");
		driver.findElementById("lst-ib").sendKeys("Cricket",Keys.ENTER);
		List<WebElement> ft = driver.findElementsByXPath("//*[contains(text(),'Cricket')or contains(text(),'cricket')]");
		System.out.println(ft.size());
		

}
}