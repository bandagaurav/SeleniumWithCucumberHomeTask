Feature: Login Action

   
@login
  Scenario: Successful Login with Valid Credentials
    Given User enters Username
    When   User enters Password
    And   User Clicks on login button
	Then  User should see the Welcome message