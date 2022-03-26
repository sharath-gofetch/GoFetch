Feature: GofetchPay
  Scenario Outline: Create new gofetch payment plan
    Given User click on the login button
    Then User enter the  username "<username>" and password "<password>" and click on the login button
    And User select the Clinic
    And Select the phone number
    Then Choose a pet
    And Select the monthly plan and enter payment details and pay