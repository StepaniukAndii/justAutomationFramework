Feature: Google Search

  Background: To Launch the browser
    Given Launch the browser

  Scenario: Search for Cucumber in Google
    When Open browser
    And Enter "Cucumber" in the search text box.
    Then Close Browser