package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePage extends BasePageClass {
   
    @FindBy(name = "q")
    WebElement searchField;


    public void searchForProducts(String queryText) {
        webActionHelperMethods.writeOnEditText(searchField,queryText);
        searchField.submit();
    }
    
    public void getTitle(final String titleStartsWith ) {
    	webDriverHelperMethods.verifyBrowserTitle(driver, titleStartsWith);
    }
}
