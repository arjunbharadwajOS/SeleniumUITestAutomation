#Sample Feature Definition Template
@feature
Feature: Title of your feature
  I want to use this template for my feature file

  @regression
  Scenario: Finding some cheese
    Given I am on the Google search page
    When I search for "Cheese!"
    Then the page title should start with "Cheese"
