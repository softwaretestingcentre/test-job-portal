package com.softwaretestingcentre.testjobportal.helpers;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class JobApplicationPage extends PageObject {

    public static Target APPLICANT_NAME = Target.the("applicant name")
            .locatedBy("[name='name']");

    public static Target APPLICANT_RESUME = Target.the("resume")
            .locatedBy("#myFile");

    public static Target SUBMIT = Target.the("submit button")
            .locatedBy("[type='submit']");

}
