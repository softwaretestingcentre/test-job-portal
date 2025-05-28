Feature: Job Application

  @JobApplication
  Scenario: Apply for a React Developer job at Infosys
    Given John applies for the "React Developer" job at "Infosys"
    When John completes the application form with "John Smith" and "resume.pdf"
    Then he sees that the job application is acknowledged

  @JobApplication
  Scenario: John should be warned if he applies for the same job twice
    Given John applies for the "Fullstack Developer" job at "Amazon"
    When John completes the application form with "John Smith" and "resume.pdf"
    And he sees that the job application is acknowledged
    And John reapplies for the "Fullstack Developer" job at "Amazon"
    And John completes the application form with "John Smith" and "resume.pdf"
    Then he sees that the job application is rejected

