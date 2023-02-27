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
@background
Feature: Usage of background in Cucumber feature
  Background: To be executed before every scenarios -  implementation
  Given User should have laptop powered-On
  Given User should have connected to internet
  
  Scenario: 
     Given I want to open the chrome browser
     When I launch the Google page
     Then I get the title of the Google page successfully
     
  Scenario: 
     Given I want to open the chrome browser
     When I launch the Bing page
     Then I get the title of the Bing page successfully
     
  Scenario: 
     Given I want to open the chrome browser
     When I launch the Eckankar page
     Then I get the title of the Eckankar page successfully