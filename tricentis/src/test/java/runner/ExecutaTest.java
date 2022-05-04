/**
*
* @author Roni Miguel
* GitHub: https://github.com/ronimiguel
*
*/
package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@executa",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty", "html:target/report.html", "json:target/report.json"}
		
		)

public class ExecutaTest {

}
