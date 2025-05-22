package com.softwaretestingcentre.testjobportal.stepdefinitions;

import com.softwaretestingcentre.testjobportal.helpers.FilterJobs;
import com.softwaretestingcentre.testjobportal.helpers.NavigateTo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

import static com.softwaretestingcentre.testjobportal.helpers.FilterJobs.checkAllJobsMatchCategory;

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

}
