#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Data Parameterisation - Method 4 from Feature to StepDefinition via DATA TABLE
Scenario: Login the Orange HRM using Datatable WITH Mutiple Rows input
    Given Open OrangeHRM site
    When Enter Username and password with table combination
    | username | password| message|
    |admin0      | admin0    | Invalid Credentials|
    |admin0      | admin123| Invalid Credentials|
    |Admin        | admin0    | Invalid Credentials|
    |Admin        | admin123| Valid Credentials|
  #   And Enter Submit Button
    Then Quit the browser
    
