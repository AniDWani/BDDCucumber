package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartSteps {
    @Given("^User navigate to the BookCart application$")
    public void user_navigate_to_the_bookcase_application() {
    }

    @When("^User add the book to the cart$")
    public void user_add_the_book_to_the_cart() {

    }

    @Then("^the cart badge should get updated$")
    public void the_cart_badge_should_get_updated() {

    }

    @And("^User login into the application with username as \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_the_application_with_username_as_something_and_something
            (String username, String password) {
    }

    @And("^User search for a book \"([^\"]*)\"$")
    public void user_search_for_a_book_something(String book, String strArg1) {

    }

}
