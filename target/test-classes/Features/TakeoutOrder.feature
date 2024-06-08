Feature: User should be able to place takeout order


Background: User to select the order type as takeout
Given User is on the landing page
When User selected takeout order type
Then User should be landed on the index page


Scenario: User should be able to place A asap takeout order.

And Selects Order Time as ASAP
And Selects product
And Add to cart
And Clicks checkout with login as guest
And Enters the details
And Enters the payement details
Then The Order should be placed successfully



Scenario: User should be able to place A Future takeout order.

And Selects Order Time
And Selects product
And Add to cart
And Clicks checkout with login as guest
And Enters the details
And Enters the payement details
Then The Order should be placed successfully



