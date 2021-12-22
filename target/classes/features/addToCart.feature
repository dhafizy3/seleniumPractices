Feature: Add to cart an item

  @Capstone2
  Scenario: User add HP LP 3065 from Desktops tab to the cart
Given User is on website
When User click on Desktops
And User clicks on Show all  
And User click  ADD TO CART option on ‘HP LP3065’ item 
And User select quantity 1 
And User click add to Cart button 
Then User should see a message 'Success: you have added HP LP 3065 to your Shopping cart!'

