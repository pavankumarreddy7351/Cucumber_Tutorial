Feature: To Test the Nexgen Register Page

  Scenario: Enter all mandetory fields
    Given launch the application
    When enter registeration deatils
      | FirstName | LastName | Gender | Email               | Code |
      | pavan     | kumar    | Mail   | pavan4331@gmail.com |   99 |
    Then click on submite button
    And close the application
