package Testrunner;


	
	import org.junit.runner.RunWith;

	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/java/features",glue="steps", monochrome=true,tags= {"@reg or @smoke"})
	public class testRunner {
	

}
