# 🧪 ParaBank Automation Framework

This project automates test scenarios for the [ParaBank](https://parabank.parasoft.com/parabank/index.htm) web application using:

- Java
- Selenium WebDriver
- Cucumber (BDD)
- JUnit
- Maven
- Page Object Model (POM)

---

## 📂 Project Structure

```
ParaBank-Simple-Cucumber/
├─ pom.xml
└─ src
   └─ test
      ├─ java
      │  ├─ factory
      │  │   └─ DriverFactory.java
      │  ├─ hooks
      │  │   └─ Hooks.java
      │  ├─ pages
      │  │   ├─ LoginPage.java
      │  │   ├─ AccountsOverviewPage.java
      │  │   ├─ TransferFundsPage.java
      │  │   ├─ BillPayPage.java
      │  │   └─ AccountActivityPage.java
      │  ├─ stepdefs
      │  │   └─ ParaBankSteps.java
      │  └─ runners
      │      └─ TestRunner.java
      ├─ resources
      |   └─ parabank
      |      └─ parabank.feature
      ├─ pom.xml
      └── README.md
```

---

## ▶️ How to Run the Tests

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/parabank-automation.git
   ```

2. Open the project in **Eclipse** or **IntelliJ**.

3. Ensure Maven dependencies are installed:
   ```bash
   mvn clean install
   ```

4. Run tests via:
   - **TestRunner.java** → Right-click → `Run As > JUnit Test`

---

## ✅ Sample Feature

```gherkin
Feature: ParaBank Login

  Scenario: Valid login
    Given user is on the login page
    When user enters valid credentials
    Then user should be redirected to the homepage
```

---

## 📊 Test Reports

Cucumber generates an HTML report at:

```
target/cucumber-report.html
```

You can open this report in any browser to view test results.

---

## 👨‍💻 Author

**Pavankalyan Akasam**  
📧 apavanpkalyan@gmail.com  
📍 Hyderabad  
🔗 [GitHub Profile](https://github.com/AKASAMPAVANKALYAN)

---

## 🛠️ Tools Used

- Java 11+
- Selenium WebDriver
- Cucumber JVM
- JUnit
- Maven
- Eclipse IDE

---

## 📃 License

This project is licensed under the MIT License.
