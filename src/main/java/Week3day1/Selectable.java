package Week3day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//ClassName objectName=new ClassName();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Load URL
		driver.navigate().to("https://jqueryui.com/selectable/");
		driver.switchTo().frame(0);
		WebElement ele1 = driver.findElementByXPath("//*[@id=\'selectable\']/li[1]");
		WebElement ele2 = driver.findElementByXPath("//*[@id=\'selectable\']/li[3]");
		WebElement ele3 = driver.findElementByXPath("//*[@id=\'selectable\']/li[5]");
		WebElement ele4 = driver.findElementByXPath("//*[@id=\'selectable\']/li[7]");
		
		Actions builder=new Actions(driver);
		builder.sendKeys(Keys.CONTROL).click(ele1).click(ele2).click(ele3).click(ele4).perform();
		
		
	}

	
}
