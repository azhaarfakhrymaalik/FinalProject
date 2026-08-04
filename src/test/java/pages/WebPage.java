package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static helper.Utility.driver;

public class WebPage {

    public WebPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    // Element untuk membaca teks error di layar
    @FindBy(css = "[data-test='error']")
    private WebElement errorMessageContainer;

    public void enterUsername(String username) {
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLoginLink() {
        loginButton.click();
    }

    // Mengambil text error untuk validasi Langkah 5
    public String getErrorMessageText() {
        return errorMessageContainer.getText();
    }
}
