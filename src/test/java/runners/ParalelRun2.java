package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/html-reports/raporPR2.html",
                "json:target/json-reports/cucumberPR2.json",
                "junit:target/xml-report/cucumberPR2.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@E2E",
        dryRun = false
)
public class ParalelRun2 {

}
