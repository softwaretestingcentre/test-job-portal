package com.softwaretestingcentre.testjobportal;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class NavigateActions extends UIInteractions {
    @Step("Navigate to the home page")
    public void toJobPortalHomePage() {
        openUrl("http://localhost:3000/Home");
    }
}