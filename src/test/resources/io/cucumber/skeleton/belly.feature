Feature: Belly

  Scenario: a few cukes
    Given I have 42 cukes in my belly
    When I wait 1 hour
    Then I am Happy

  Scenario: Login into GW
  Given Users open GW application 
  When User enters username
  And User enters Password
  And User clicks Login
  Then User should land on HomePage   