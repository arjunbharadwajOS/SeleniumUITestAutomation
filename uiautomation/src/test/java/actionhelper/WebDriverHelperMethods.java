package actionhelper;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;


public class WebDriverHelperMethods {
		
    public void verifyBrowserTitle(WebDriver driver, String startsWith) {	
    	Boolean titleText = driver.getTitle().contains(startsWith);
    	assertEquals(titleText, true);
    }
	
}
