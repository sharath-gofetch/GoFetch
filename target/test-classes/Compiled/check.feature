Feature: Check

  @check
  Scenario Outline: my first feature file
    Given User click on the login button
    When User enter the  username "<username>" and password "<password>" and click on the login button
    #Then User verify the user
    Examples:
      | username            | password   |
      | pay1@futurepet.care | Futurepet1 |


  @check
  Scenario Outline: Create new gofetch payment plan
    Given User click on the login button
    When User enter the  username "<username>" and password "<password>" and click on the login button
    Then User select the Clinic
    Then Enter the phone number "<phoneNumber>"
    Then Choose a pet
    Then Select the payment plan "<paymentPlan>", enter payment details ccNumber "<ccNumber>", expiry "<expiryDate>", cvv "<cvv>", zipcode"<zipcode>" and click on pay
    Examples:
      | username            | password   | phoneNumber | paymentPlan | ccNumber         | expiryDate | cvv | zipcode |
      | pay2@futurepet.care | Futurepet1 | 1234567890  | monthly     | 4242424242424242 | 0724       | 234 | 123456  |