
Feature: Test cases about Checkbox Demo page

  Background: Web driver is able to find home page and click on InputForms and then Checkbox Demo button

  Scenario: Test case about single Checkbox Demo
    Given User is able to click on input forms field button
    And   select the Checkbox Demo page
    When  User select the single checkbox
    Then  System should show success message:- check box is checked
    And   User should be able to verify success checked box message

  Scenario: Test case about Multiple checkbox Demo
    Given User is able to click on input forms field button
    And   select the Checkbox Demo page
    When  User click on multiple check box
    Then  System should show uncheck All button
    And   User should be able to verify uncheck All button
    When  User click on uncheck All button
    Then  System should show check all button
    And   User should be able to verify check all button