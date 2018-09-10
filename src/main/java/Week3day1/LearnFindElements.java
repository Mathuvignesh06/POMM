package Week3day1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnFindElements {
	@Test
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//ClassName objectName=new ClassName();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Load URL
		driver.get("https://www.google.com");
		driver.findElementById("lst-ib").sendKeys("Vignesh",Keys.ENTER);
		List<WebElement> gh = driver.findElementsByTagName("a");
		System.out.println(gh.size());
		int count=1;
		for (WebElement each : gh) {
			String text = each.getText();
			if (text.contains("Vignesh")) {
				count++;
				
			}
		}
		System.out.println(count);
		File scr1=driver.getScreenshotAs(OutputType.FILE);
		File dec=new File("./snaps/ima1.png");
		FileUtils.copyFile(scr1, dec);


	}}