package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import factory.DriverFactory;

public class AccountActivityPage {

    public static int getTransactionCount() {
        WebDriver driver = DriverFactory.getDriver();
        return driver.findElements(By.cssSelector("#transactionTable tbody tr")).size();
    }
}
