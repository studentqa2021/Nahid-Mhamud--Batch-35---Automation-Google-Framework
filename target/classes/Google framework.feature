@Smoke @Regression
Feature: Testing google search function
Description: google search only visible iphone 13

@TC_OB-11 @Positive
Scenario: As Google user, I need to get only iphone 13 when i will search for iphone 13
Given  Open a browser and go to google
When search for iphone 13
Then iphone 13 should visible in search drop down

