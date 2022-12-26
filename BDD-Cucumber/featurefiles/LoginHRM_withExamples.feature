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

#Scenario & Scenario Outline 
	# Scenario is common for all Cucumber file with or without Datatable
	# Scenario Outline is only 
				#1. when used with Examples, 
				#2. Value needs to be passed within <placeholder> steps  
				#3. All the steps(Given, When, Then) will loop n number of times as per the rows in the Example Table
				#4. The Output of the file will n loops of testcases executed as per rows in Example table- for each combination once.
									
Feature: Data Parameterisation - Method 5 from Feature to StepDefinition via DATA TABLE With Examples
Scenario Outline: Login to OrangeHRM using Datatable WITH Examples
    Given Open OrangeHRM site for login
    When Enter "<username>" and "<password>" with Example table combination
    Then Close the login browser
    
    Examples: 
    | username | password| 
    |admin0      | admin0    | 
    |admin0      | admin123| 
    |Admin        | admin0    | 
    |Admin        | admin123| 