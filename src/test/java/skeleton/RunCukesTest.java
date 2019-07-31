package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/skeleton/scenario2.feature",
				glue="skeleton",
				tags={"@login,@search,@logout"},
				plugin={"json:target/cucumber.json"})
public class RunCukesTest {
}
