@tag
Feature: Add Customer detail
  I want to use this template for my feature file

  @tag1
  Scenario: Add the customer info
    Given User should launch browser
    And click to add customer link
    When User provided detail
    |  Gajen |  Mani  | gg@gmail.com  | Karur  | 2322222 |
    Then I validate the outcomes



