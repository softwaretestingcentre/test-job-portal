package com.softwaretestingcentre.testjobportal.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

public class FilterJobs {

    public static Performable byCategory(String jobCategory){
        return Task.where("{0} filters jobs by "+jobCategory,
                Click.on(JobListPage.JOB_FILTER.of(jobCategory))
        );
    }

    public static Performable checkAllJobsMatchCategory(String category) {
        return Ensure.that(Text.ofEach(JobListPage.JOB_CATEGORY_LIST))
                .allMatch("category",
                        it -> it.contains(category));
    }

}
