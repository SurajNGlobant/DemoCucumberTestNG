
@homePage @searchModule

Feature: validate Amazon Search features
  
    @validSearch
    Scenario: Verify that user is able to search product
    Given I am at the homepage of Amazon
    When I search with 'pc'
    Then The list of product is displayed for 'pc'
    
    @invalidSearch
    Scenario: Verify that user is able to search product
    Given I am at the homepage of Amazon
    When I search with 'adlfjaldjf'
    Then The search error message is displayed as 'Your search "adlfjaldjf" did not match any products.'
   