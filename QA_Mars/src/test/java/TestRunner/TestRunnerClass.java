package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty","html:target/CucumberReport.html"},
        features = "src/test/resources/FeatureFile"
        , glue = {"StepDefinition" , "Hooks"}
)

public class TestRunnerClass
{

}
