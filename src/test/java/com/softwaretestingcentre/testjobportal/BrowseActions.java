package com.softwaretestingcentre.testjobportal;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class BrowseActions extends UIInteractions {
    @Step("Open the Job List")
    public void browseJobs() {
        $("[data-testid='btn']").click();
    }
}
