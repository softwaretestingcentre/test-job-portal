package com.softwaretestingcentre.testjobportal.stepdefinitions;

import com.softwaretestingcentre.testjobportal.helpers.FilterJobs;
import com.softwaretestingcentre.testjobportal.helpers.NavigateTo;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

import static com.softwaretestingcentre.testjobportal.helpers.FilterJobs.checkAllJobsMatchCategory;
import static com.softwaretestingcentre.testjobportal.helpers.FilterJobs.checkAllJobsMatchExperience;

public class FilterStepDefinitions {

    @Given("{actor} is browsing jobs")
    public void actor_is_browsing_jobs(Actor actor) {
        actor.wasAbleTo(NavigateTo.pageByLink("Jobs"));
    }

    @When("{actor} filters on {string}")
    public void actor_filters_on_category(Actor actor, String category) {
        actor.wasAbleTo(FilterJobs.byCategory(category));
    }

    @Then("{actor} only sees {string} jobs")
    public void actor_only_sees_category_jobs(Actor actor, String category) {
        actor.attemptsTo(checkAllJobsMatchCategory(category));
    }

    @When("{actor} filters on {string} level")
    public void actor_filters_on_experience(Actor actor, String experience) {
        actor.attemptsTo(FilterJobs.byExperience(experience));
    }

    @Then("{actor} only sees jobs that match the {string} level")
    public void actor_only_sees_experience_level_jobs(Actor actor, String experience) {
        actor.attemptsTo(checkAllJobsMatchExperience(experience));
    }

    @When("he filters on salary above {string} pa")
    public void heFiltersOnSalaryAbovePa(String annualSalary) {
        throw new PendingException("Implement me");
    }

    @Then("he only sees jobs that pay more than {string} pa")
    public void heOnlySeesJobsThatPayMoreThanPa(String annualSalary) {
        throw new PendingException("Implement me");
    }
}
