package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class UIDriver {
	
	public static WebDriver getDriver(DriverManagerType browserName) {
	    switch (browserName.getDriver()) {
	        case "ChromeDriver":
	            ChromeOptions chromeOptions = new ChromeOptions();
	            chromeOptions.addArguments("--disable-notifications");
	            return new ChromeDriver(chromeOptions);
	        case "firefoxdriver":
	            return new FirefoxDriver();
	        case "edgedriver":
	            return new EdgeDriver();
	        case "iedriver":
	            return new InternetExplorerDriver();
	    }
	    return null;
	}

}
