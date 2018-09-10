package Week3day1;

import javax.swing.Action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//ClassName objectName=new ClassName();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Load URL
		driver.navigate().to("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		WebElement hop = driver.findElementById("draggable");
		Actions bulider=new Actions(driver);
		bulider.dragAndDropBy(hop, 23, 23).perform();
	}
}
