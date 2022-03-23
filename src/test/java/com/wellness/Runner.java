package com.wellness;

import com.wellness.utilities.DriverManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/*
 * @CucumberOptions :
            annotation provides the same options as the cucumber jvm command line.
            for example: we can specify the path to feature files, path to step definitions, if we want to run the execution
            in dry mode or not etc.This is very helpful and importance if we are using IDE such eclipse only to execute our project.

            Plugin:
                    plugin Option is used to specify different formatting options for the output reports.
                    Various options that can be used as for-matters are:
                    Note – Format option is deprecated . Use Plugin in place of that.
                    *Pretty: Prints the Gherkin source with additional colors and stack traces for errors.
                    *HTML: This will generate a HTML report at the location mentioned in the for-matter itself.
                    *JSON: This report contains all the information from the gherkin source in JSON Format.
                              This report is meant to be post-processed into another visual format by 3rd party tools such
                              as Cucumber Jenkins.
                    *JUnit: This report generates XML files just like Apache Ant’s JUnit report task.
                               This XML format is understood by most Continuous Integration servers,
                               who will use it to generate visual reports.
            dryRun:
                    This option can either set as true or false (default value is false).
                    If it is set as true, it means that Cucumber will only check that every Step mentioned in
                    the Feature File have corresponding code written in Step Definition file or not.
                    So in case any of the function is missed in the Step Definition for any Step in
                    Feature File, it will give us the message. So If you're writing scenarios first and
                    then implementing step definitions then add dryRun = true.
        Monochrome:
                    This option can either set as true or false (default value is false).
                    If it is set as true, it means that the console output for the Cucumber test are much more readable.
                    And if it is set as false, then the console output is not as readable as it should be.
                    For practice just add the code ‘monochrome = true‘ in TestRunner class.
          Features:
                    Features Options helps Cucumber to locate the Feature file in the project folder structure.
                    All we need to do is to specify the folder path and Cucumber will automatically find all the ‘.features‘
                    extension files in the folder.
              Glue:
                    It is almost the same think as Features Option but the only difference is that it helps Cucumber to locate
                    the Step Definition file. Whenever Cucumber encounters a Step, it looks for a Step Definition inside all the files
                    present in the folder mentioned in Glue Option.
     Snippet Style:
                    Cucumber generates code snippets in Underscore style by default. If you want to change the format of cucumber snippets
                    then you can set snippet type in your cucumber options. There are two types of snippets,
                    * SnippetType.CAMELCASE
                    * SnippetType.UNDERSCORE
              tags:
                    The tags can be used when specifying what tests to run through any of the running mechanism.
                    So, tags is just another parameter in the cucumber options annotation.
                    We can also pass multiple tags as values separated by commas if we need so.


            Note:
                    * Package contains both runner class and step definitions, no need declare the glue path
                    *

 */
@CucumberOptions(
        plugin = { "pretty",
                "json:target/cucumber.json",
                "html:target/cucumber.html"
        },
        dryRun = false,
        features = "src/test/resources/Compiled",
        tags = "@check"
)
public class Runner extends AbstractTestNGCucumberTests {
    TestNGCucumberRunner testNGCucumberRunner;

    public Runner( ) {
        testNGCucumberRunner = new TestNGCucumberRunner ( this.getClass ( ) );
    }

    @BeforeTest
    public void initializeBrowser ( ) {
        DriverManager driverManager = new DriverManager ( );
        driverManager.initializeDriver ( );
    }


}
