
@tag
Feature: Add custom details
  I want to use this template for my feature file

  @tag1
  Scenario: Customer details
    Given User should launch browser
    And click to add customer link
    When adding custome info
    |fname| Gajen|
    |Lname| Mani|
    |mail | gg@gmail.com|
    |address| Karur |
    |ph.no| 383777366|
    Then I validate the outcomes
    

  
