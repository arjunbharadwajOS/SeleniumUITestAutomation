package uiautomation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SeleniumTest extends TestRunner{
    
    @Given("I am on the Google search page")
    public void I_visit_google() {
    	driver.get(URL);
    	driver.manage().window().maximize();
    }

    @When("I search for {string}")
    public void search_for(String query) {
        googlePage.searchForProducts(query);
   }

   @Then("the page title should start with {string}")
   public void checkTitle(final String titleStartsWith) {
	   googlePage.getTitle(titleStartsWith);
   }

}
