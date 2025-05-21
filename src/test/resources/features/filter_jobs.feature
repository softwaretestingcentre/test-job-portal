Feature: Filter jobs based on category

#  Scenario: Filter on Frontend jobs
#    Given John is browsing jobs
#    When he filters on "Frontend"
#    Then he only sees "Frontend" jobs

  Scenario Outline: Filter jobs by category
    Given John is browsing jobs
    When he filters on "<Category>"
    Then he only sees "<Category>" jobs
    Examples:
      | Category |
      | Frontend |
      | Backend  |