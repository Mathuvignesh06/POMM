package Week3day1;

import javax.swing.Action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sort {
  @Test(invocationCount=3,threadPoolSize=2)
	public void main() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//ClassName objectName=new ClassName();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Load URL
		driver.navigate().to("https://jqueryui.com/sortable/");
		driver.switchTo().frame(0);
		WebElement io = driver.findElementByXPath("//li[text()='Item 4']");
		int y = io.getLocation().getY();
		System.out.println(io);
		//WebElement io1 = driver.findElementByXPath("//li[text()='Item 1']");
		//Actions builder=new Actions(driver);
		//builder.dragAndDropBy(io1, 0, y).perform();

	}
  @Test(priority=-1)
  public void method2() {
	System.out.println("Madhu");
}
  @Test(priority=2)
  public void method3() {
	System.out.println("Sathish");
}

}
