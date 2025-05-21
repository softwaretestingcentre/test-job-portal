package com.softwaretestingcentre.testjobportal.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.targets.Target;

public class NavigateTo {
    public static Performable theJobListPage() {
        return Task.where("{0} opens the Job list page",
                Open.browserOn().the(JobListPage.class),
                Click.on(Target.the("Browse Jobs button")
                        .locatedBy("[data-testid='btn']"))
        );
    }
}
