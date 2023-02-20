package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import actionhelper.WebActionHelperMethods;
import actionhelper.WebDriverHelperMethods;
import uiautomation.TestRunner;

public class BasePageClass extends TestRunner{
	
    static WebActionHelperMethods webActionHelperMethods;
    static WebDriverHelperMethods webDriverHelperMethods;

    public BasePageClass() {
        PageFactory.initElements(driver, this);
        webActionHelperMethods= new WebActionHelperMethods();
        webDriverHelperMethods= new WebDriverHelperMethods();
    }

}
