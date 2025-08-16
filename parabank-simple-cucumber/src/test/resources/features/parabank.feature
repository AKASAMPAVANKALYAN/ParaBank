Feature: ParaBank Basic Operations

 
  Scenario Outline: Login with multiple credentials
    Given I open ParaBank website
    When I login with "<username>" and "<password>"
    Then I should see Accounts Overview page

    Examples:
      | username | password |
      | john     | demo     |

  Scenario: Transfer Funds
    Given I open ParaBank website
    When I login with "john" and "demo"
    And I transfer 100 dollars
    Then I should see transfer confirmation

  Scenario: Pay a Bill
    Given I open ParaBank website
    When I login with "john" and "demo"
    And I pay 50 dollars bill
    Then I should see bill payment confirmation

  Scenario: View Transactions
    Given I open ParaBank website
    When I login with "john" and "demo"
    And I open first account activity
    Then I should see at least one transaction
