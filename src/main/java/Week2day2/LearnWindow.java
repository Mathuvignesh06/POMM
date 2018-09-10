package Week2day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

		public static void main(String[] args) throws InterruptedException, IOException {
			//Launch browser
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			//ClassName objectName=new ClassName();
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://legacy.crystalcruises.com/");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.findElementByLinkText("GUEST CHECK-IN").click();
			System.out.println((driver.getTitle()));
			
			Set<String> hello = driver.getWindowHandles();
			List<String> hhello=new ArrayList<String>();
			hhello.addAll(hello);
			driver.switchTo().window(hhello.get(1));
			
			
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			
			driver.findElementByLinkText("View Offer»").click();
			
			 hello = driver.getWindowHandles();
			 hhello=new ArrayList<String>();
			hhello.addAll(hello);
			driver.switchTo().window(hhello.get(2));
			File sc = driver.getScreenshotAs(OutputType.FILE);
			File dec=new File("./snaps/ima2.png");
			FileUtils.copyFile(sc, dec);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.quit();
			
			
			
			
		

	}

}
