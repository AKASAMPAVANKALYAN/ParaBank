package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import factory.DriverFactory;

public class AccountsOverviewPage {

    public static boolean isLoaded() {
        WebDriver driver = DriverFactory.getDriver();
        return driver.findElement(By.xpath("//h1[contains(text(),'Accounts Overview')]")).isDisplayed();
    }
}
