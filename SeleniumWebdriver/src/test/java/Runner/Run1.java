package Runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue="StepDefn")
public class Run1 extends AbstractTestNGCucumberTests {
	
}
	



