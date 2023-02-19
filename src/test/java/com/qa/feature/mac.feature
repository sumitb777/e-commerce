Feature: buy macbook;

Scenario: add mac to cart
Given in chrome "http://tutorialsninja.com/demo/" website is open
When user click on macbook
Then user should land on macbook page 
And user should see success massage