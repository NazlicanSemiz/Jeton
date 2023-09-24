@wip

Feature:Login Functionality

  Scenario: User should be able to register
    Given user is on the Jeton web page
    When User enters the phone number "6641232281"
    And User enters the password "123456Qw"
    And User selects User ID tab
    And User enters the email "logan+au43@jeton.com"
    And User clicks login button
    Then User enters the OTP Code "123456"



