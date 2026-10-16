package org.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features="C:\\Users\\mahek\\eclipse-workspace\\.metadata\\SampleWonderla\\src\\test\\resources\\Feature",
glue="org.step",monochrome=true,dryRun=false,snippets=SnippetType.CAMELCASE,tags="@smoke and @valid",plugin={"pretty",
"html:C:\\Users\\mahek\\eclipse-workspace\\.metadata\\SampleWonderla\\Reports\\Html\\Wonderla.html",
"junit:C:\\Users\\mahek\\eclipse-workspace\\.metadata\\SampleWonderla\\Reports\\Junit\\wonderla.xml",
"json:C:\\Users\\mahek\\eclipse-workspace\\.metadata\\SampleWonderla\\Reports\\Json\\wonderla.json",
"rerun:C:\\Users\\mahek\\eclipse-workspace\\.metadata\\SampleWonderla\\Reports\\Rerun\\rerun.txt"})
public class Runner extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
