package Week1day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	@Test

	public void main() {
		//Launch browser
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//ClassName objectName=new ClassName();
		ChromeDriver driver=new ChromeDriver();
		//Load URL
		driver.get("http://leaftaps.com/opentaps/");
		//Enter Usernames
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		//Enter Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		//Enter logout button
		String text=driver.findElementById("form").getText();
		if(text.contains("welcome")) {
			System.out.println("matched");
		}else
			System.out.println("not matched");
		
		

	}

}
