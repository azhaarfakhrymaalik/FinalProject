package StepDefinitions;

import helper.Utility;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

import static helper.Utility.quitDriver;
import static helper.Utility.startDriver;
import static java.lang.Thread.sleep;

public class Hooks {

    @BeforeAll
    public static void setUp() {
    }

    @AfterAll
    public static void tearDown() {
    }

    public static WebDriver getDriver() {
        return Utility.getDriver();
    }

    @Before("@web")
    public void beforeTest() {
        Utility.startDriver();
    }

    @After("@web")
    public void afterTest() throws InterruptedException {
        Thread.sleep(3000);
        Utility.quitDriver();
    }
}
