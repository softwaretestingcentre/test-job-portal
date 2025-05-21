package com.softwaretestingcentre.testjobportal.helpers;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://stc-job-portal.netlify.app/")
public class JobListPage extends PageObject {
    public static Target JOB_FILTER = Target.the("filter category {0}")
            .locatedBy("//li[text()='{0}']");

    public static Target JOB_CATEGORY_LIST = Target.the("job list")
            .locatedBy(".job-detail>.category");

}
