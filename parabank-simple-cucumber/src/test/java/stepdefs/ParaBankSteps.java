package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountActivityPage;
import pages.AccountsOverviewPage;
import pages.BillPayPage;
import pages.LoginPage;
import pages.TransferFundsPage;

public class ParaBankSteps {

    @Given("I open ParaBank website")
    public void openParaBank() {
        LoginPage.open();
    }

    @When("I login with {string} and {string}")
    public void login(String user, String pass) {
        LoginPage.login(user, pass);
    }

    @Then("I should see Accounts Overview page")
    public void verifyLogin() {
        Assert.assertTrue("Accounts Overview not visible", AccountsOverviewPage.isLoaded());
    }

    // --- Transfer $100 ---
    @When("I transfer 100 dollars")
    public void transferMoney() {
        TransferFundsPage.transfer100();
    }

    @Then("I should see transfer confirmation")
    public void verifyTransfer() {
        WebDriver driver = DriverFactory.getDriver();
        String src = driver.getPageSource().toLowerCase();
        boolean ok = src.contains("transfer complete") || src.contains("successfully transferred");
        Assert.assertTrue("Transfer not confirmed", ok);
    }

    // --- Bill Pay 50 ---
    @When("I pay 50 dollars bill")
    public void payBill() {
        BillPayPage.pay50();
    }

    @Then("I should see bill payment confirmation")
    public void verifyBillPay() {
        WebDriver driver = DriverFactory.getDriver();
        String src = driver.getPageSource().toLowerCase();
        boolean ok = src.contains("bill payment complete") || src.contains("bill payment has been scheduled");
        Assert.assertTrue("Bill payment not confirmed", ok);
    }

    // --- Transaction History ---
    @When("I open first account activity")
    public void openFirstAccountActivity() {
        WebDriver driver = DriverFactory.getDriver();
        // navigate straight to overview and click first account
        driver.get("https://parabank.parasoft.com/parabank/overview.htm");
        driver.findElements(org.openqa.selenium.By.cssSelector("#accountTable td a")).get(0).click();
    }

    @Then("I should see at least one transaction")
    public void verifyTransactionsPresent() {
        Assert.assertTrue("No transactions found", AccountActivityPage.getTransactionCount() > 0);
    }
}
