@tag
Feature: To add a customer
  I want to use this template for my feature file

  @tag1
  Scenario: To add the new customer
    Given User should launch the browser
    And click the add customer link
    When User Provide valid details
    Then I validate the outcomes
    
    Scenario Outline: To add more customer details
    Given User should launch the browser
    And click the add customer link
    When User Provide valid details"<fname>","<lname>","<email>","<Address>","<PhoneNo>"
    Then I validate the outcomes

    Examples:
    |fname|lname|email|Address|PhoneNo|
    |aaa|aabb|aa@gmail.com|aaaaa|111111111|
    |bbb|bbbb|bb@gmail.com|bbbbb|222222222|
    |ccc|cccc|cc@gmail.com|ccccc|333333333|
    |ddd|dddd|dd@gmail.com|ddddd|444444444|
    |eee|eeee|ee@gmail.com|eeeee|555555555|
  