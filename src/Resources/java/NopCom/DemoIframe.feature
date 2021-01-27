

  @Demoiframe
  Feature: Test Advertisement feature

    Scenario: As a User I should be able to navigate to the new webpage when I click on banner
      
      Given User has Advertise banner on page
      When I click on that banner
      Then it should open up the webpage in new window

