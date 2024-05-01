package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html"

        },
        features = "src/test/resources/feature/accounte.feature",
        glue = {"stepdefinition","src/main/java/org/example/pageObject"}
)

public class Testrunner extends AbstractTestNGCucumberTests {

}
