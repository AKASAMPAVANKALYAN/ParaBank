package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import factory.DriverFactory;

public class LoginPage {

    private static final String URL = "https://parabank.parasoft.com/parabank/index.htm";

    public static void open() {
        WebDriver driver = DriverFactory.getDriver();
        driver.get(URL);
    }

    public static void login(String username, String password) {
        WebDriver driver = DriverFactory.getDriver();
        driver.findElement(By.xpath("//input[@name='username']")).clear();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);

        driver.findElement(By.xpath("//input[@name='password']")).clear();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);

        driver.findElement(By.cssSelector("input[value='Log In']")).click();
    }
}
