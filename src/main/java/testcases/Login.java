package testcases;




import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends wdMethods.SeMethods {

	@Test(groups="smoke")
	public void login() {
	startApp("chrome", "http://leaftaps.com/opentaps");
	WebElement eleUname = locateElement("id", "username");
	type(eleUname, "DemoSalesManager");
	type(locateElement("id", "password"), "crmsfa");
	click(locateElement("class", "decorativeSubmit"));
	}}





