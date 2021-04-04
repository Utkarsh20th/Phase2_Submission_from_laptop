Feature: Automated H&M web app E2E Tests
Description: E2E behaviour of logging into the H&M web app account to order cloth to checkout to logout is checked

Scenario: User places an order on H&M web app
 Given user is on H&M Home Page
 And user logins into account
 When user searches for cloth item
 And user selects size
 Then user goes to cart
 Then user enters address and payment details
 And then checks out and logout