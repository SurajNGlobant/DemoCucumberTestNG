@signInPage @signInModule
Feature: validate Amazon SignIn feature
  
    @SignInValid
    Scenario Outline: Verify that user is able to sign in successfully with valid credential
    Given I am at the signInPage of Amazon
    When I enter username as <email> and password as <password>
    And I click on signIn button
    Then The <username> appears on the signInYourAccount block

    Examples:
    | email                     |  password       | username  |
    | suraj.ganga@globant.com   |                 | Suraj     |
    
    @SignInInvalid
    Scenario Outline: Verify that user is not able to sign in with invalid credential
    Given I am at the signInPage of Amazon
    When I enter username as <email> and password as <password>
    And I click on signIn button
    Then The message for invalid signin is displayed as <error>

    Examples:
    | email                     |  password       |                              error                                 |
    |                           |                 | Enter your email or mobile phone number + Enter your password      |
    | suraj.ganga@globant.com   |                 | Enter your password                                                |
    |                           |  dvasdvvadv     | Enter your email or mobile phone number                            |
    | suraj.ganga@globant.com   |   dvasdvvadv    | Your email or password was incorrect. Please try again.            |
    
    
    
    