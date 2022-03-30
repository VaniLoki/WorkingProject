Feature: Search product on Home Page

@SearchLaptop
 Scenario:Search Laptop bag on home page
    Given Launch Amazon Website
    When User focus on Search textbox
    When User enters "laptop" in search Field
    Then User selects "bag" from autosuggestivedropdown
    Then User clicks on "MOSISO" from the dropdown