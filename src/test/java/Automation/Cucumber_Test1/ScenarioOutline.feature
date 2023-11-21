#@tag2
#Scenario Outline: Title of your scenario outline
#Given I want to write a step with <name>
#When I check for the <value> in step
#Then I verify the <status> in step
#
#Examples:
#| name  | value | status  |
#| name1 |     5 | success |
#| name2 |     7 | Fail    |
Feature: To the Secnario OutLine

  Scenario Outline: 
    Given launch the applicaton
    When register all deatils "<FirstName>","<lastName>","<Email>","<code>"
    Then click on submit button
    And logout application

    Examples: 
      | FirstName | lastName | Email           | code |
      | pavan     | kumar    | pavan@gmail.com |   99 |
      | pavan     | kumar    | pavan@gmail.com |   99 |
      | pavan     | kumar    | pavan@gmail.com |   99 |
      | pavan     | kumar    | pavan@gmail.com |   99 |
      | pavan     | kumar    | pavan@gmail.com |   99 |
