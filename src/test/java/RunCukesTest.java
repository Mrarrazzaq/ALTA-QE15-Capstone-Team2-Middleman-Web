package runCukes;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {
                "hooks",
                "step_definitions"
        },
        features = {"classpath:features/"},
        plugin = {"pretty",
                "html:target/site/cucumber-pretty.html",
                "json:target/cucumber/cucumber.json"
        }
)
public class RunCukesTest {
}
