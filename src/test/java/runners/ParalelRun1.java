package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/html-reports/raporPR1.html",
                "json:target/json-reports/cucumberPR1.json",
                "junit:target/xml-report/cucumberPR1.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@smoke",
        dryRun = false
)

public class ParalelRun1 {
}
