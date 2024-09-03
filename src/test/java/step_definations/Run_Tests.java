package step_definations;/*
package step_definations;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.github.mkolisnyk.cucumber.runner.RetryAcceptance;

import cucumber.api.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@ExtendedCucumberOptions(
        jsonReport = "target/81/cucumber.json",
        jsonUsageReport = "target/81/cucumber-usage.json",
        usageReport = true,
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        overviewChartsReport = true,
        pdfPageSize = "A4 Landscape",
        toPDF = false,
        outputFolder = "target/81",
        retryCount = 0)
@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/feature" },
        tags = {"@login"},plugin = {
        		"usage:target/81/cucumber-usage.json","html:target/81", "json:target/cucumber-reports/CucumberTestReport.json","json:target/81/cucumber.json",
                "pretty:target/81/cucumber-pretty.txt",
                 "junit:target/81/cucumber-results.xml" })

public class Run_Tests {


	public static int retries = 0;
    public Run_Tests() {
    }
    @RetryAcceptance
    public static boolean retryCheck(Throwable e) {
        return true;
    }
}

*/
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/feature",
        glue="step_definations",
        monochrome = true,
        tags= "@login"
)
public class Run_Tests {
}
