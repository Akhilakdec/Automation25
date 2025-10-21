package CucumberOptions;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/FeatureFiles",
glue="StepDefinitions",tags="@test1")

public class TestRunner {

}
