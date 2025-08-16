package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import factory.DriverFactory;

public class TransferFundsPage {

    public static void transfer100() {
        WebDriver driver = DriverFactory.getDriver();
        // open transfer page
        try { driver.findElement(By.linkText("Transfer Funds")).click(); } catch (Exception ignored) {}
        driver.findElement(By.id("amount")).clear();
        driver.findElement(By.id("amount")).sendKeys("100");
        new Select(driver.findElement(By.id("fromAccountId"))).selectByIndex(0);
        new Select(driver.findElement(By.id("toAccountId"))).selectByIndex(1);
        driver.findElement(By.cssSelector("input[value='Transfer']")).click();
    }
}
