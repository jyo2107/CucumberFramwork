Feature: Login

Scenario: Successful Login with Valid Credentials

Given User Launch Chrome browser
When User opens URL "https://iblesoft.smarteweb.com/"
And User enters Email as "IBLEC1152" and Password as "12345678"
And Click on Login
Then Page Title should be "IBLESOFT"
And click on UserProfile
When user click on Logout link
Then Page Title should be "IBLESOFT"
And close browser