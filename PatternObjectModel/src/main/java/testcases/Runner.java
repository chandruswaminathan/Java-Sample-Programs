package testcases;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/learncucum", glue= {"pages","hooks"}, tags= {"@Smoke,@Sanity"}, monochrome = true)
public class Runner {
	
	

}
