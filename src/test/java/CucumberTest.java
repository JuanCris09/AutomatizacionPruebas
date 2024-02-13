
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
    plugin = {"de.monochromata.cucumber.report.PrettyReports:target/cucumber",
            "pretty", "json:target/cucumber-reports/Cucumber.json",
            "org.example.util.reporting.JReporter"
    })
public class CucumberTest {
}
