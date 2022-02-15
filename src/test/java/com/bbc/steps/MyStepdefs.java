package com.bbc.steps;

import com.bbc.pages.Page1HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MyStepdefs {
    @Given("^I am on homepage of BBC Website$")
    public void iAmOnHomepageOfBBCWebsite() {
        System.out.println("I am on home page of BBC Sport website");
    }

    @Then("^I am able to see Output all team names with a match today,If there are no matches today, output a message to convey this\\.$")
    public void iAmAbleToSeeOutputAllTeamNamesWithAMatchTodayIfThereAreNoMatchesTodayOutputAMessageToConveyThis() {
        new Page1HomePage().getAllGamesOnPage();

    }
}
