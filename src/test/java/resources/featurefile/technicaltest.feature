#Feature: As a business user, I would like to make a record of all teams which are playing today

  #Scenario: Output all team names with a match today. If there are no matches today, output a message to convey this.
  #  Given I am on homepage of BBC Website
  #  Then I am able to see Output all team names with a match today,If there are no matches today, output a message to convey this.

Feature: As a sports user, I would like to read about all articles related to sports
  Scenario: Use the search option to find all articles related to ‘sports’. Output the first heading and the last heading returned on the page.
    Given I am on homepage of BBC Website
    When I Search for "sports"
    And I click on Search tab
    Then I can see sports news List

#Feature: As a QA, I would like to verify all negative scenarios for login
#  Scenario: Select ‘Sign in’, and enter as many negative scenarios as possible. Verify that a error message is displayed and the text that it
#  contains is as expected.


