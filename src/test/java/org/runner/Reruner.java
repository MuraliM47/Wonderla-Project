package org.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features="@C:\\\\Users\\\\mahek\\\\eclipse-workspace\\\\.metadata\\\\SampleWonderla\\\\Reports\\\\Rerun\\\\rerun.txt",
glue="org.step",plugin={"pretty",
"html:C:\\Users\\mahek\\eclipse-workspace\\.metadata\\SampleWonderla\\Reports\\Html\\Wonderla.html",
"junit:C:\\Users\\mahek\\eclipse-workspace\\.metadata\\SampleWonderla\\Reports\\Junit\\wonderla.xml",
"json:C:\\Users\\mahek\\eclipse-workspace\\.metadata\\SampleWonderla\\Reports\\Json\\wonderla.json",
"rerun:C:\\Users\\mahek\\eclipse-workspace\\.metadata\\SampleWonderla\\Reports\\Rerun\\rerun.txt"})
public class Reruner extends AbstractTestNGCucumberTests {

}
