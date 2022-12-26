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
Feature: Data Parameterisation - Method 1 from Feature to StepDefinition
Scenario: Login the Orange HRM using Data from Feature-StepDef
    Given I want to open browser and navigate to OrangeHRM site
    When I enter Username "Admin" and password "admin123"
    And click on Login button
    Then I validate the Landing page
   
