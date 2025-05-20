package com.softwaretestingcentre.testjobportal.features;

import com.softwaretestingcentre.testjobportal.NavigateActions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.PageElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import net.serenitybdd.junit5.SerenityJUnit5Extension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenFilterJobs {

    @CastMember(name = "John")
    Actor john;
    NavigateActions navigate;

    @Test
    @DisplayName("Only show Frontend jobs")
    void filterFrontend() {
        john.attemptsTo(
                Open.url(navigate.home),
                Click.on(Button.withText("Browse Jobs")),
                Click.on(PageElement.locatedBy(".filter li").containingText("Frontend"))
        );
        var filteredJobs = john.asksFor(Text.ofEach(".job-detail>.category"));
        assertThat(filteredJobs).allMatch(job -> job.contains("Frontend"));
    }
}
