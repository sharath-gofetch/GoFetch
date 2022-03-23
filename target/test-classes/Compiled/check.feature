@check
Feature: Check

  @check
  Scenario Outline: my first feature file
    Given User click on the login button
    When User enter the  username "<username>" and password "<password>" and click on the login button
    #Then User verify the user
    Examples:
      | username            | password   |
      | pay1@futurepet.care | Futurepet1 |