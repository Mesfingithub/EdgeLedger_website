
Feature: Test cases about Radio button Demo page

  Background: Web driver is able to find home page and click on InputForms and then Radio button

  Scenario: Test case about Radio Button Demo field
    Given User is able to click on input form field button
    And   select the Radio button demo page
    When  User select the Male radio button
    And   User clicks on Get checked value
    Then  System should show 'Male' is checked message
    And   User should be able to verify the message
    When  User select the Female radio button
    And   User click on Get checked vale
    Then  System should show 'Female' is checked message
    And   User should be able to verify the message

  Scenario: Test case about Group Radio Buttons Demo field
    Given User is able to click on input form field button
    And   select the Radio button demo page

    When  User select the Male radio button and 0 to 5 age group
    And   User click on get values
    Then  System should show a message:- Sex: Male and Age group: 0 to 5
    And   User should be able to verify the message
    When  User select the Male radio button and 5 to 15 age group
    And   User click on get values
    Then  System should show a message:- Sex: Male and Age group: 5 to 15
    And   User should be able to verify the message
    When  User select the Male radio button and 15 to 50 age group
    And   User click on get values
    Then  System should show a message:- Sex: Male and Age group: 15 to 50
    And   User should be able to verify the message

    When  User select the Female radio button and 0 to 5 age group
    And   User click on get values
    Then  System should show a message:- Sex: Female and Age group: 0 to 5
    And   User should be able to verify the message
    When  User select the Female radio button and 5 to 15 age group
    And   User click on get values
    Then  System should show a message:- Sex: Female and Age group: 5 to 15
    And   User should be able to verify the message
    When  User select the Female radio button and 15 to 50 age group
    And   User click on get values
    Then  System should show a message:- Sex: Female and Age group: 15 to 50
    And   User should be able to verify the message

