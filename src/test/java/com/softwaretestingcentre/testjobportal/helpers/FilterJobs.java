package com.softwaretestingcentre.testjobportal.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

public class FilterJobs {

    public static Performable byCategory(String jobCategory) {
        return Task.where("{0} filters jobs by " + jobCategory,
                Click.on(JobListPage.JOB_CATEGORY_FILTER.of(jobCategory))
        );
    }

    public static Performable checkAllJobsMatchCategory(String category) {
        return Ensure.that(Text.ofEach(JobListPage.JOB_CATEGORY_LIST))
                .allMatch("category",
                        jobCategory -> jobCategory.equals(category));
    }

    public static Performable byExperience(String experience) {
        return Task.where("{0} filters jobs by " + experience + " experience",
                Click.on(JobListPage.JOB_EXPERIENCE_FILTER.of(experience))
        );
    }

    private static Boolean experienceIsInRange(String experience, String range) {
        int experienceYears = Integer.parseInt(experience);
        int experienceMin = Integer.parseInt(String.valueOf(range.charAt(0)));
        int experienceMax;
        try {
            experienceMax = Integer.parseInt(String.valueOf(range.charAt(2)));
        } catch (Exception ignored) {
            experienceMax = 99;
        }
        return experienceYears >= experienceMin && experienceYears <= experienceMax;
    }

    public static Performable checkAllJobsMatchExperience(String experienceRange) {
        return Ensure.that(Text.ofEach(JobListPage.JOB_EXPERIENCE_LIST))
                .allMatch("experience",
                        jobExperience -> experienceIsInRange(jobExperience, experienceRange));
    }

}
