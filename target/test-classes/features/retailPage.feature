Feature: Retail Page Feature



Background: 
   Given User is on Retail website 
   And User click  on MyAccount
   When  User click on Login 
   And User enter username 'shahram@gmail.com' and password '123456789' 
   And User click on Login button
   Then User should be logged in to MyAccount dashboard


  @Rtag1
   Scenario: Register as an Affiliate user with Cheque Payment Method
   When User click on 'Register for an Affiliate Account' link 
   And User fill affiliate form with below information
   |company|website|taxID|payeeName|
	 |Zamani|aub.com|456545456|Emran|
   And click on Cheque as payment method
   And User check on About us check box 
   And User click on Continue button 
   Then User should see a success message 


   @Rtag2
   Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
   When User click on Edit your affiliate information link 
   And user click on Bank Transfer radio button
   And User fill Bank information with below information
   |bankName|abaNumber|swiftCode|accountName|accountNumber|
   |TD|5645464|4564|KarzaiMerza|546412156465|
   And User click on Continue button
   Then User should see a success message
   
   @Rtag3
   Scenario: Edit your account Information 
   When User click on ‘Edit your account information’ link 
   And User modify below information 
   |firstname|lastName|email|telephone|
   |Merza|Jamal|karim@gmail.com|456465465|
   And User click on Continue button  
   Then User should see a success message
   
   