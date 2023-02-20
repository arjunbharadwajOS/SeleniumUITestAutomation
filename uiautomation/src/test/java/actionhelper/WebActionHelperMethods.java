package actionhelper;

import org.openqa.selenium.WebElement;

public class WebActionHelperMethods {

    public void writeOnEditText(WebElement element, String data) {
    	element.sendKeys(data);
    }
	
}
