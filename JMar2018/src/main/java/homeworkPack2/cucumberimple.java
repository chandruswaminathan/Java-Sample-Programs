package homeworkPack2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/main/java/cucumber/createLead.feature", glue="week1day1")
public class cucumberimple {

}
