@LoginFeature
Feature: Parabank Login Feature

Scenario Outline: Parabank Login Test Scenario

Given user present on Parabank login page
When title of login page is ParaBank
Then user enters username "<username>" and User enters password "<password>"
Then user clicks on login button
And user is on home page

Examples:
|username            | Password     |
|Kaspar@automation22 | Automation22 |
