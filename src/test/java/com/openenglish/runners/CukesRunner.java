package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
        plugin = {
                "pretty",
                "json:target/cucumber.json",
                "html:target/default-html-reports"},
        features = "src/test/resources/features",
        glue = "com/fleet/step_definitions",C:\Users\90531\IdeaProjects\OpenEnglishC\src\test\java\step_definitions
        dryRun = true
        //tags = "@TRN-1241"
    )
public class CukesRunner {
}
