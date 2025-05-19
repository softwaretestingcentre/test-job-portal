package com.softwaretestingcentre.testjobportal;
import net.serenitybdd.core.pages.PageComponent;

public class JobList extends PageComponent {
    public String firstResult() {
        return $(".job-detail").getText();
    }
}
