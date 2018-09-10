package Week2day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {
	public static void main(String[] args) {
	//Launch browser
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	//ClassName objectName=new ClassName();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//Load URL
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	driver.switchTo().frame("iframeResult");
	driver.findElementByXPath("//button[text()='Try it']").click();
	driver.switchTo().alert().getText();
	driver.switchTo().alert().sendKeys("Mathu");
	driver.switchTo().alert().accept();

}
}
