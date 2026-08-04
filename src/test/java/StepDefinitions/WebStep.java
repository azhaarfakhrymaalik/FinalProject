package StepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.WebPage;

import static helper.Utility.driver;

public class WebStep {

    WebPage webPage;

    public WebStep() {
        this.webPage = new WebPage(driver);
    }

    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("I fill the username field with {string}")
    public void iFillTheUsernameFieldWith(String username) {
        webPage.enterUsername(username);
    }

    @When("I fill the password field with {string}")
    public void iFillThePasswordFieldWith(String password) {
        webPage.enterPassword(password);
    }

    @When("I click on the login button")
    public void iClickOnTheLoginButton() {
        webPage.clickLoginLink();
    }

    // VALIDASI POSITIF
    @Then("I should be redirected to the dashboard page")
    public void i_should_be_redirected_to_the_dashboard_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertTrue(currentUrl.contains("inventory.html"), "Gagal dialihkan ke dashboard!");
        driver.quit();
    }

    // VALIDASI NEGATIF & BATAS
    @Then("I should see an error message {string}")
    public void i_should_see_an_error_message(String expectedErrorMessage) {
        String actualErrorMessage = webPage.getErrorMessageText();
        Assertions.assertEquals(expectedErrorMessage, actualErrorMessage, "Pesan error tidak sesuai!");
        driver.quit();
    }
}
