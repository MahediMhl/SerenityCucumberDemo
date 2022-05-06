Feature: HTML Form fill up

  Scenario: Fill up form with demo data should pass
    Given Sergey is on home page
    When He clicks on html form page link
    When He fills up the form and submits
    Then He should see the processed form