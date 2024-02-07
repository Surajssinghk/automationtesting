Feature: filter functionality

 @Reg
Scenario: Valiate filter functionality
    And enter valide username "error_user" and password "secret_sauce"
    When validate click functionality
    And check filter button