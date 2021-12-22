Feature: Desktops

  @Capstone
  Scenario: Verify all items are present in Desktops tab
    Given User is on Retail website
    When User clicks on Desktops tab
    And User click on show all desktops
    Then User should see all items are present in Desktop page

