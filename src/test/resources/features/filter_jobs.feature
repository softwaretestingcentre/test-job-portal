Feature: Filter jobs based on category

Scenario: Filter on Frontend jobs
  Given John is browsing jobs
  When he filters on "Frontend"
  Then he only sees "Frontend" jobs