package utilities;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = {"src/test/java/features"},
        tags = "@login",
        glue = {"steps"},
        plugin = {"junit:target/reports/junit.xml", "pretty", "html:target/cucumber", "json:target/cucumber.json"})

public class Runner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}