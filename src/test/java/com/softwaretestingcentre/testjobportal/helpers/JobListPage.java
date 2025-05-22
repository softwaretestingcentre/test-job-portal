package com.softwaretestingcentre.testjobportal.helpers;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class JobListPage extends PageObject {

    public static Target JOB_FILTER = Target.the("filter category {0}")
            .locatedBy("//*[@class='job-category']//li[.='{0}']");//li[text()='{0}']");

    public static Target JOB_CATEGORY_LIST = Target.the("job list")
            .locatedBy(".job-detail>.category>p:nth-child(2)");

}
