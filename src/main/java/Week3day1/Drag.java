package Week3day1;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			//ClassName objectName=new ClassName();
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			//Load URL
			driver.get("https://jqueryui.com/droppable/");
			driver.switchTo().frame(0);
			WebElement ki = driver.findElementById("draggable");
			WebElement hj = driver.findElementById("droppable");
			Actions bulider=new Actions(driver);
			bulider.dragAndDrop(ki,hj).perform();
		
			
			
	}

}
