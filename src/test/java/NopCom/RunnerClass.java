package NopCom;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/Resources/java/NopCom",format = {},tags= {"@Checkout" })
public class RunnerClass {


}
