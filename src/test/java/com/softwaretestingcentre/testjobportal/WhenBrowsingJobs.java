package com.softwaretestingcentre.testjobportal;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenBrowsingJobs {
    @Managed(driver = "chrome")
    WebDriver driver;

    NavigateActions navigate;
    BrowseActions browse;
    JobList jobList;

    @Test
    void jobsShouldBeListed() {
        navigate.toJobPortalHomePage();
        browse.browseJobs();

        Serenity.reportThat("The first job listed should be for a Fullstack Developer",
                () -> assertThat(jobList.firstResult()).contains("Fullstack Developer")
        );
    }

}
