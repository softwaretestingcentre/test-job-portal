Feature: Job Application

  @JobApplication
  Scenario: Apply for a React Developer job at Infosys
    Given John applies for the "React Developer" job at "Infosys"
    When John completes the application form with "John Smith" and "resume.pdf"
    Then he sees that the job application is acknowledged

