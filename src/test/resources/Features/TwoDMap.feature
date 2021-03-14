
@tag
Feature: Add cust twdmap
  I want to use this template for my feature file

  @tag1
  Scenario: Add cust info
    Given Launch twod url
    And click link twod
    When fill detail twod
    | Fname | Lname | MailId      | Address | Phone.No |
    | Gajen | Mani  | gg@gmail.com| Krr     | 73888818 |
    | hewee | jwej  | hh@gmail.com| hee     | 45366266 |
    | ryeeh | ettt  | rr@gmail.com| ger     | 32292991 |
    | iwiwi | eree  | er@gmail.com| wer     | 92983882 |
    
    Then I validate the outcomes
 

 