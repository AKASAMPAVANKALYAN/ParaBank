package hooks;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void startDriver() {
        DriverFactory.getDriver(); // initialize once per scenario
    }

    @After
    public void stopDriver() {
        DriverFactory.quitDriver();
    }
}
