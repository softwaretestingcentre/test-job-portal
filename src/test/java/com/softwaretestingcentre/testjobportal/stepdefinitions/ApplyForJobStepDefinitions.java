package com.softwaretestingcentre.testjobportal.stepdefinitions;

import com.softwaretestingcentre.testjobportal.helpers.JobApplications;
import com.softwaretestingcentre.testjobportal.helpers.NavigateTo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

public class ApplyForJobStepDefinitions {
    @Given("{actor} applies/reapplies for the {string} job at {string}")
    public void actorAppliesForTheJobAt(Actor actor, String role, String company) {
        actor.wasAbleTo(NavigateTo.pageByLink("Jobs"));
        actor.attemptsTo(JobApplications.applyForJob(role, company));
    }

    @When("{actor} completes the application form with {string} and {string}")
    public void actorCompletesTheFormWithAnd(Actor actor, String name, String resume) {
        actor.attemptsTo(JobApplications.submitApplication(name, resume));
    }

    @Then("{actor} sees that the job application is acknowledged")
    public void heSeesThatTheJobApplicationIsAcknowledged(Actor actor) {
        actor.attemptsTo(JobApplications.checkJobApplicationIsAcknowledged());
    }

    @Then("{actor} sees that the job application is rejected")
    public void heSeesThatTheJobApplicationIsRejected(Actor actor) {
        actor.attemptsTo(JobApplications.checkDuplicateJobApplicationIsRejected());
    }
}
