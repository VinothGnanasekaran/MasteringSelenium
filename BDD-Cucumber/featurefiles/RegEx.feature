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
  Feature: To use the RegEx in the Stepdefintion file using cucumber
  Scenario: Usage of various RegEx 
    Given I want to write a step with 1 numeric
    When I check with 1.5 decimal 
    Then Myname is "Vinoth" and i am a "SDET" and i get salary above "27LPA" now