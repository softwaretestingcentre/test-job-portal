package com.softwaretestingcentre.testjobportal.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.nio.file.Path;
import java.nio.file.Paths;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class JobApplications {

    public static String SUCCESSFUL_APPLICATION = "Your Job Application has been Applied Successfully";
    public static String DUPLICATE_APPLICATION = "You Already Applied For This Job!";

    public static Performable applyForJob(String role, String company) {
        return Task.where("{0} applies for " + role + " job at " + company,
                Click.on(JobListPage.JOB_APPLY.of(role, company)));
    }

    public static Performable submitApplication(String name, String resume) {
        Path resumePath = Paths.get("src/test/resources/testdata/" + resume);
        return Task.where(name + " submits an application with " + resume,
                Enter.theValue(name).into(JobApplicationPage.APPLICANT_NAME),
                Upload.theFile(resumePath).to(JobApplicationPage.APPLICANT_RESUME),
                Click.on(JobApplicationPage.SUBMIT));
    }

    public static Performable applicationAlertHandler(String expectedMessage) {
        String outcome = theActorInTheSpotlight().asksFor(HtmlAlert.text());
        theActorInTheSpotlight().attemptsTo(Switch.toAlert().andAccept());
        return Ensure.that(outcome).isEqualTo(expectedMessage);
    }

    public static Performable checkJobApplicationIsAcknowledged() {
        return applicationAlertHandler(SUCCESSFUL_APPLICATION);
    }

    public static Performable checkDuplicateJobApplicationIsRejected() {
        return applicationAlertHandler(DUPLICATE_APPLICATION);
    }
}
