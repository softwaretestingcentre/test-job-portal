package com.softwaretestingcentre.testjobportal.helpers;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class JobListPage extends PageObject {

    public static Target JOB_CATEGORY_FILTER = Target.the("category filter {0}")
            .locatedBy("//*[@class='job-category']//li[.='{0}']");

    public static Target JOB_CATEGORY_LIST = Target.the("job category list")
            .locatedBy(".job-detail>.category>p:nth-child(2)");

    public static Target JOB_EXPERIENCE_FILTER = Target.the("experience filter {0}")
            .locatedBy("//*[@class='job-category']//li[.='{0}']//input");

    public static Target JOB_EXPERIENCE_LIST = Target.the("job experience list")
            .locatedBy(".job-detail>.experience>p>div");

}
