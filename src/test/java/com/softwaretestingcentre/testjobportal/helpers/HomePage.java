package com.softwaretestingcentre.testjobportal.helpers;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://stc-job-portal.netlify.app/")
public class HomePage extends PageObject {
    public static Target NAVBAR_LINK = Target.the("Page {0}")
            .locatedBy("//nav//a[.='{0}']");
}
