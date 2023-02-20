package uiautomation;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import pages.GooglePage;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import util.Utility;
import driver.DriverManagerType;
import driver.UIDriver;


@CucumberOptions(tags = "", features = {"src/test/java/features/uiautomation.feature"}, glue = {"uiautomation"}, plugin = {})

public class TestRunner extends AbstractTestNGCucumberTests {
	
	protected static GooglePage googlePage;
	protected static WebDriver driver;
    Properties properties;
    static String URL;
	
    @BeforeSuite
    public void setUp() {
    	String propertyPath = System.getProperty("user.dir") + "//src//test//java//resource//Env.properties";
        try {
            driver = UIDriver.getDriver(DriverManagerType.CHROME);
            properties = Utility.loadProperties(propertyPath);
            URL = properties.getProperty("URL");
            googlePage = new GooglePage();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
