package StepDefinitions;

import helper.Utility;
import io.cucumber.java.*;

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
