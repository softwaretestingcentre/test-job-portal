package com.softwaretestingcentre.testjobportal.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable pageByLink(String pageName) {
        return Task.where("{0} opens the " + pageName + " page",
                Open.browserOn().the(HomePage.class),
                Click.on(HomePage.NAVBAR_LINK.of(pageName))
        );

    }
}
