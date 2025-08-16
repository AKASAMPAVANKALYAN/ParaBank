package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import factory.DriverFactory;

public class BillPayPage {

    public static void pay50() {
        WebDriver driver = DriverFactory.getDriver();
        // open bill pay page
        try { driver.findElement(By.linkText("Bill Pay")).click(); } catch (Exception ignored) {}
        driver.findElement(By.name("payee.name")).sendKeys("Electric Company");
        driver.findElement(By.name("payee.accountNumber")).sendKeys("12345");
        driver.findElement(By.name("amount")).sendKeys("50");
        new Select(driver.findElement(By.name("fromAccountId"))).selectByIndex(0);
        driver.findElement(By.cssSelector("input[value='Send Payment']")).click();
    }
}
