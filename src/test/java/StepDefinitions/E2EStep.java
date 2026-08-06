package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.E2EPage;

public class E2EStep {

    private E2EPage e2ePage;

    public E2EStep() {
        this.e2ePage = new E2EPage(Hooks.getDriver());
    }

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        e2ePage.goToLoginPage();
    }

    @When("user input valid username {string} and password {string}")
    public void userInputValidUsernameAndPassword(String username, String password) {
        e2ePage.enterUsername(username);
        e2ePage.enterPassword(password);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        e2ePage.clickLogin();
    }

    @Then("user is navigated to home page")
    public void userIsNavigatedToHomePage() {
        e2ePage.verifyOnHomePage();
    }

    @When("user add item {string} to cart")
    public void userAddItemToCart(String itemName) {
        e2ePage.addItemToCart(itemName);
    }

    @And("user click cart icon")
    public void userClickCartIcon() {
        e2ePage.clickCartIcon();
    }

    @And("user click checkout button")
    public void userClickCheckoutButton() {
        e2ePage.clickCheckout();
    }

    @And("user fill checkout information with First Name {string}, Last Name {string}, Postal Code {string}")
    public void userFillCheckoutInformation(String firstName, String lastName, String postalCode) {
        e2ePage.fillCheckoutInfo(firstName, lastName, postalCode);
    }

    @And("user click continue button")
    public void userClickContinueButton() {
        e2ePage.clickContinue();
    }

    @And("user click finish button")
    public void userClickFinishButton() {
        e2ePage.clickFinish();
    }

    @Then("user should see order complete message {string}")
    public void userShouldSeeOrderCompleteMessage(String expectedMessage) {
        e2ePage.verifyOrderCompleteMessage(expectedMessage);
    }
}