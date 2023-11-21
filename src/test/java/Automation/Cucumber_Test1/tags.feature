@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @Smoke
  Scenario Outline: Title of your scenario outline
  #//removing common methods
    #Given launchApplication
    Then username "<name>" and password "<value>"
    When click on sign-in
    Then get current url
    #And logout

    Examples: 
      | name                | value       |
      | pavan4331@gmail.com | *Pavan@4331 |

  @Sanity
  Scenario Outline: Title of your scenario outline
    #Given launchApplication
    Then username "<name>" and password "<value>"
    When click on sign-in
    Then get current url
    #And logout

    Examples: 
      | name                | value       |
      | pavan4331@gmail.com | *Pavan@4331 |

  @Regrastion
  Scenario Outline: Title of your scenario outline
    #Given launchApplication
    Then username "<name>" and password "<value>"
    When click on sign-in
    Then get current url
    #And logout

    Examples: 
      | name                | value       |
      | pavan4331@gmail.com | *Pavan@4331 |
