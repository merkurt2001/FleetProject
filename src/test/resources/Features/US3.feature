Feature: As a user, I want to learn how to use the pinbar

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: US3AC1TC1 Verify user can use how to use the pinbar
    Given the user logged in as "sales manager"
    And the user click on the "Learn how to use this space" link
    Then the user should see pinbar texts
    Then the users should see an image on the page


  Scenario: US3AC1TC2 Verify user can see image on the page
    Given the user logged in as "sales manager"
    And the user click on the "Learn how to use this space" link
    Then the users should see an image on the page