package Week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

	public static void main(String[] args) {
			//Launch browser
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			//ClassName objectName=new ClassName();
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			//Load URL
			driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		   driver.findElementByXPath("/html/body/div[1]");
		   driver.findElementByXPath("/html/body/div[1]/p[1]/button").click();
		   driver.switchTo().frame("childIframe");
		   WebElement frame=driver.findElement(By.cssSelector("body > div.ui-layout-east.ui-layout-pane.ui-layout-pane-east"));
		   driver.switchTo().frame(frame);
		   //driver.findElementByXPath("/html/body/div[2]/p/button").click();
	

	}

}
