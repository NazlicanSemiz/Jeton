@wip

Feature:Register Functionality

  Scenario: User should be able to register
    Given user is on the Sandbox Jeton web page
    Then user should see title is Sandbox Jeton
    When User clıcks Sign Up For Free button
    And User clicks Country Code button
    And User enters country code "+43"
    And User enters phone number "6641232281"
    And User enters email "logan+au43@jeton.com"
    And User enters password "123456Qw"
    And User enters first name "Nazli"
    And User enters last name "Semiz"
    And User enters dob "18-07-1996"
    And User clicks Sign Up button
    And User enters OTP Code "123456"

  Scenario: User enters address details
    Given  User selects country
    And User enters the United Kingdom
    And User enters address "15 Cooden Avenue"
    And User enters city "Leicester"
    And User enters postal code "LE3 0JS"
    And User selects I agree the terms&conditions and privacy policy
    And User clicks go to wallet button
