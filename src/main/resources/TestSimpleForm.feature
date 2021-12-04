
Feature: Test cases about Simple input form page

  Background: Web driver is able to find home page and click on InputForms and then Simple Form Demo button

    Scenario: Test case about single input field
      Given User is able to click on input form field button
      And   select the simple input form demo page
      When  User enters some text in Enter Message input box
      And   User clicks on show message button
      Then  System should show your message: text entered by user
      And   User should be able to verify the message

  Scenario: Test case about Two input field
    Given User is able to click on input form field button
    And   select the simple input form demo page
    When  User enter the value in Enter a input box
    When  User enter the value in Enter b input box
    And   User click on Get Total button
    Then  System should show your Total value : sum of a + b, value entered by user
    And   User should be able to verify the total sum value of numbers



