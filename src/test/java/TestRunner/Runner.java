package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features =  {"src/test/Features/addToCart.Feature"},
        dryRun = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        glue = "steps"

)
public class Runner extends AbstractTestNGCucumberTests {

}
