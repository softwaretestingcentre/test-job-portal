Feature: Filter jobs

  Scenario Outline: Filter jobs by category
    Given John is browsing jobs
    When he filters on "<Category>"
    Then he only sees "<Category>" jobs
    Examples:
      | Category          |
      | Frontend          |
      | Backend           |
      | Devops            |
      | Full Stack        |
      | Digital Marketing |

  Scenario Outline: Filter jobs by experience level
    Given John is browsing jobs
    When he filters on "<Experience>" level
    Then he only sees jobs that match the "<Experience>" level
    Examples:
      | Experience |
      | 0-1 year   |
      | 2-3 year   |
      | 4-5 year   |
      | 5+ year    |

  Scenario: Filter jobs by salary
    Given John is browsing jobs
    When he filters on salary above "50000" pa
    Then he only sees jobs that pay more than "50000" pa

