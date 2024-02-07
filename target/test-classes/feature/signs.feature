
Feature: validate sign in features
 

  @Reg
    Scenario: sign in feature valiadation
    And enter valide username "test" and password "password"
    When validate click functionality
    
  @Reg
    Scenario: login with invalide credientials
    And enter valide username "test" and password "password"
    When validate click functionality

  
  
    
    
    
 