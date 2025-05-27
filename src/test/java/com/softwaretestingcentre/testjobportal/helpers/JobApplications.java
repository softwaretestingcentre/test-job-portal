package com.softwaretestingcentre.testjobportal.helpers;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.nio.file.Path;
import java.nio.file.Paths;

public class JobApplications {
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

    public static Performable checkJobApplicationIsAcknowledged(Actor actor) {
        String acknowledgement = actor.asksFor(HtmlAlert.text());
        Switch.toAlert().andAccept();
        return Ensure.that(acknowledgement).isEqualTo("Your Job Application has been Applied Successfully");
    }
}
