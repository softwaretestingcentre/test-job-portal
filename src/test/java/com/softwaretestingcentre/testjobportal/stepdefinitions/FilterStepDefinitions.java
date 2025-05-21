package com.softwaretestingcentre.testjobportal.stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;

public class FilterStepDefinitions {

    @Given("{actor} is browsing jobs")
    public void actor_is_browsing_jobs(Actor actor) {
        throw new PendingException("Implement this step");
    }

    @Given("{actor} filters on {string}")
    public void actor_filters_on_category(Actor actor, String category) {
        throw new PendingException("Implement this step");
    }

    @Given("{actor} only sees {string} jobs")
    public void actor_only_sees_category_jobs(Actor actor) {
        throw new PendingException("Implement this step");
    }

}
