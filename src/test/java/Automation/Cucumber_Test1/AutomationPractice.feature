Feature: test the automation practice website

  Background: 
    Given user navigate to login page

  Scenario: login into website and logout the website
    When enter username and password
    And click on sign button
    Then Website homepage should be launched
    And logout the website
    And close Application

  Scenario: login into website and logout the website
    When enter invaild_username and invaild_password
    And click on sign button
    Then Website homepage should not be launched
    And close Application
